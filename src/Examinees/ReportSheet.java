/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examinees;

import QuizApplicationPackage.User;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.LinkedList;
import java.io.RandomAccessFile;

public class ReportSheet {
    
    public ReportSheet(String userName, String quizName, LinkedList responses, int attempts) {
        this.userName = userName;
        this.quizName = quizName;
        this.responses = responses;
        this.attempts = attempts;
    }
    
    public ReportSheet(String userName, String quizName) {
        this.userName = userName;
        this.quizName = quizName;
    }
    
    String userName = "";
    String quizName = "";
    LinkedList<Response> responses = new LinkedList<Response>();
    int attempts = 0;
    
    public static class Response {
        
        /*
            Because questions are in random order and may be modified, the
            question and answers must be stored somewhere instead of question
            numbers or it won't be possible to say which questions were correct.
        */
        public Response(String question, String answer, boolean correct) {
            this.question = question;
            this.answer = answer;
            this.correct = correct;
        }
        
        String question = "";
        String answer = "";
        boolean correct = false;
        
        public static final Response error = new Response("Error", "", false);
        
        // Test if a Response exists
        public static boolean exists (Response response) {
            return response != null && response != error;
        }
        
        public static Response loadNext(BufferedReader reader) {

            try {

                // Read question, if none then return null
                String question = reader.readLine();
                if (question == null) return null;

                // Read answer
                String answer = reader.readLine();
                
                // Read whether correct
                String correctStr = reader.readLine();
                boolean correct;
                
                if (correctStr.matches("0")) {
                    correct = false;
                } else if (correctStr.matches("1")) {
                    correct = true;
                } else {
                    return error;
                }

                return new Response(question, answer, correct);

            } catch (IOException x) {
                return error;
            }
        }
        
        public void save(BufferedWriter writer) throws IOException {
            
            writer.write(question);
            writer.newLine();
            writer.write(answer);
            writer.newLine();
            
            String correctStr = ((correct) ? "1" : "0" );
            writer.write(correctStr);
            writer.newLine();
        }
    }
    
    /*
        Calculates score as a ratio. It is more common that ratios are needed
        than percentages, because a ratio from one function may be directly
        passed into another in a more complex calculation. Percentages are only
        used to be more human readable, so the conversion to percentage should
        be done when displayed.
    */
    public double calculateScoreRatio() {
        
        int numResponses = 0;
        int numCorrect = 0;
        
        // Count responses and correct responses
        for (Response response : responses) {
            
            numResponses++;
            numCorrect += response.correct ? 1 : 0;
        }
        
        /*
            Considering a score of 0/0 to be 1. (numCorrect must also be 0 if
            numResponses is 0).
        */
        if (numResponses == 0) return 1.0d;
        
        return ((double)numCorrect) / ((double)numResponses);
    }
    
    /*
        Loads ReportSheet from file with name quizName under account
        accountName. Returns null if error or file did not exist because it is
        impossible to be sure whether a file just couldn't be accessed and
        appeared to not exist.
    */
    public static ReportSheet load(String userName, String quizName) {
        
        Path examineeQuizFolder = User.userDirectory.resolve("Examinees", userName, quizName);
        
        try (
            BufferedReader reader = Files.newBufferedReader(examineeQuizFolder.resolve("reportSheet.log"))
        ) {
            
            // Load attempts
            String attemptsStr = reader.readLine();
            int attempts = 0;
            
            if (attemptsStr == null) {
                return null; // Couldn't read first line
            } else {
                attempts = Integer.parseInt(attemptsStr);
            }
            
            // Load responses
            LinkedList<Response> responses = new LinkedList<Response>();
            Response response;
            while (Response.exists(response = Response.loadNext(reader))) {
                responses.addLast(response);
            }
            
            if (response == Response.error) return null;
            
            return new ReportSheet(userName, quizName, responses, attempts);
            
        } catch (IOException e) {
            return null;
        } catch (NumberFormatException e) {
            return null;
        }
    }
    
    /*
        Side-effect: Increments attempts in attempts file.
        Save the Report Sheet, overwriting the previous if new score is greater.
        Return if successful.
    */
    public boolean save() {
    
        // Ensure folder exists
        Path examineeQuizFolder = User.userDirectory.resolve("Examinees", userName, quizName);   
        try {
            if (Files.notExists(examineeQuizFolder)) Files.createDirectories(examineeQuizFolder);
        }
        catch (IOException x) {
            System.err.format("IOException: %s%n", x);
            return false;
        }
        
        // Open for reading just to check if empty
        // The purpose of this is to ensure that:
        // 1) The file will exist if the try/catch is passed
        // 2) To know whether the file has any contents that aren't recognized
        //    as a ReportSheet
        boolean confirmedEmpty = false;
        try (
            // Opening for reading and writing because intent is to create file if missing and read
            RandomAccessFile file = new RandomAccessFile(examineeQuizFolder.resolve("reportSheet.log").toString(), "rw");
        ) {
            confirmedEmpty = file.length() == 0;
        } catch(IOException x) {
            System.err.format("IOException: %s%n", x); 
            return false;
        }
        
        // The file must exist
        
        // Obtain previous score
        double oldScoreRatio = -1.0d; // Replaceable value
        int attempts = 0;
        ReportSheet oldReportSheet = load(userName, quizName);
        
        // The file should be empty if a ReportSheet wasn't read
        boolean expectedEmpty = oldReportSheet == null;
        
        // If file empty and expected empty (no report sheet) then the nothing can be overwritten (continue)
        // If file not empty but expected empty (no report sheet) then don't overwrite the unreadable data, error (return false)
        // If file empty but not expected empty (but somehow report sheet?) (shouldn't be possible unless the file was messed with) then error (return false)
        // If file not empty and not expected empty (report sheet) then can be overwritten if higher score (continue)
        // (If file's emptiness/nonemptiness did not meet expectations, error).
        if (confirmedEmpty != expectedEmpty) {
            return false;
        }
        
        // By this point, either a ReportSheet was read, or a ReportSheet
        // definitely does not exist. (The possibility of a ReportSheet
        // existing but appearing not to should be eliminated, so no accidental
        // overwrites should be possible).
        
        // Obtain score and attempts if report sheet exists
        if (oldReportSheet != null) {
            oldScoreRatio = oldReportSheet.calculateScoreRatio();
            attempts = oldReportSheet.attempts;
        }
        
        // Obtain new score
        double newScoreRatio = calculateScoreRatio();
        
        /*
            If new score is worse or equal, don't replace old report sheet.
            Success if choosing not to because no file needed to be rewritten.
        */
        if (newScoreRatio <= oldScoreRatio) return true;
        
        // Replace the old report sheet
        try (
           BufferedWriter writer = Files.newBufferedWriter(examineeQuizFolder.resolve("reportSheet.log"), StandardOpenOption.CREATE) 
        ) {
            
            attempts++;
            
            writer.write(Integer.toString(attempts));
            writer.newLine();
            
            for (Response response : responses) {
                response.save(writer);
            }
            
        } catch(IOException x) {
           
            System.err.format("IOException: %s%n", x); 
            return false;
        }
            
        return true;
    }
}
