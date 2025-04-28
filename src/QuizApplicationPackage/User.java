package QuizApplicationPackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class User {
    
    /*
        Call to try to ensure folder and file exist. May not succeed,
        but success is not essential because it will be caught ahead by
        load functions as file not being found which must always check
        for the file.
    */
    public static void init() {
        
        /* First ensure folder and file exist */
        
        // Create Users folder
        try {
            Files.createDirectories(User.userDirectory);
        } catch(IOException x) {
            System.err.format("IOException: %s%n", x);
        }
        
        // Create accounts file
        try (BufferedWriter writer = Files.newBufferedWriter(User.accountsFile, StandardOpenOption.CREATE, StandardOpenOption.APPEND)) {}
        catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }
        
    }
            
    public User(String name, String password, Role role) {
        this.name = name;
        this.password = password;
        this.role = role;
    }
        
    public String name;
    private String password;
    private Role role;
    
    /*
        Used to differentiate between the two cases of not finding a user:
        they do not exist, or there was an error. Cannot throw exception
        because I cannot find an exception that suits this case.
    */
    public static final User nonexistent = new User("Nonexistent User", "", Role.EXAMINEE);
    public static final User error = new User("Error finding User", "", Role.EXAMINEE);
    
    // Test if a user exists
    public static boolean exists (User user) {
        return user != null && user != nonexistent && user != error;
    }
        
    public enum Role {
        
        EXAMINEE(0), ADMINISTRATOR(1);
        public static final int numRoles = 2;
        
        private final int role;
        Role(int role) {
            this.role = role;
        }
        public int getValue() {
            return role;
        }
    }
    
    public static final String[] roleNames = {"Examinee", "Administrator"};
    
    public String roleName() {
        
        int roleId = role.getValue();
        if (roleId < 0 || roleId >= roleNames.length) return "Unnamed Role";
        return roleNames[roleId];
    }
    
    /* Creates a path to the User folder. "user.home" specifies the home folder in 
        this computer's file system. */
    public static final Path userDirectory = Paths.get(System.getProperty("user.home"), "QuizApplication", "Users");
    
    /* Creates a path to the accounts file. */
    public static final Path accountsFile = userDirectory.resolve("accounts.txt");
    
    public static User load(String userName) {

        try (BufferedReader reader = Files.newBufferedReader(accountsFile)) {
        
            User account;
            while (User.exists(account = loadNext(reader))) {

                // If name matches, return user
                if (account.name.equals(userName)) return account;
            }
            
            if (account == error) return error;
        
        } catch (NoSuchFileException x) {
            //System.out.println("Could not open account file.");
            return error;
        } catch (IOException x) {
            return error;
        }
        
        return nonexistent;
    }
    
    public static User loadNext(BufferedReader reader) {

        try {
        
            // Read name, if none then return null
            String accountName = reader.readLine();
            if (accountName == null) return null;
            
            // Read password
            String password = reader.readLine();

            /*
                Read role. Will cause NumberFormatException when reading past
                other Users if not a number.
            */
            Role role = Role.values()[Integer.parseInt(reader.readLine())];
            
            return new User(accountName, password, role);
        
        } catch (IOException x) {
            return error;
        } catch (NumberFormatException x) {
            return error;
        }
    }
    
    /*
        Copy of User.load with condition swapped from name to role. Could use
        one load function with a lambda function but that overcomplicates this
    */
    public static User getAdministrator() {

        try (BufferedReader reader = Files.newBufferedReader(accountsFile)) {
        
            User account;
            while (User.exists(account = loadNext(reader))) {

                // If role matches, return user
                if (account.getRole() == User.Role.ADMINISTRATOR) return account;
            }
            
            if (account == error) return error;
        
        } catch (NoSuchFileException x) {
            //System.out.println("Could not open account file.");
            return error;
        } catch (IOException x) {
            return error;
        }
        
        return nonexistent;
    }
    
    boolean hasPassword(String password) {
        return this.password.equals(password);
    }
    
    public Role getRole() {
        return role;
    }
}

