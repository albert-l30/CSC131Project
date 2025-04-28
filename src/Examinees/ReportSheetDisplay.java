/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Examinees;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import Examinees.ReportSheet.*;
import javax.swing.WindowConstants;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class ReportSheetDisplay extends javax.swing.JFrame {

    /**
     * Creates new form ReportSheetDisplay
     * @param reportSheet
     */
    public ReportSheetDisplay(ReportSheet reportSheet) {
        initComponents();
        
        // Correct initComponents' alterations
        BoxLayout layout = new BoxLayout(getContentPane(), BoxLayout.Y_AXIS);
        getContentPane().setLayout(layout);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        setSize(720, 640);
        
        listResponses(reportSheet);
    }
    
    private void listResponses(ReportSheet reportSheet) {
        
        // Prepare container and label
        
        JFrame frame = this;
        
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        
        JLabel label = new JLabel("Exam: " + reportSheet.quizName);
        label.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
        panel.add(label);
        
        {
            // Panel to contain label
            JPanel numberingPanel = new JPanel();
            //numberingPanel.setBorder(BorderFactory.createLineBorder(Color.black));
            
            BoxLayout layout = new BoxLayout(numberingPanel, BoxLayout.Y_AXIS);
            numberingPanel.setLayout(layout);
            
            numberingPanel.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
            
            // Label to explain how questions are numbered/ordered
            JLabel numberingLabel = new JLabel("(Questions numbered by order recieved)");
            numberingPanel.add(numberingLabel);
                
            // Try to make the panel not take up the entire screen
            {
                // An arbitrarily large width so that the maximum height can be set
                int panelWidth = 10000;
                
                // The maximum height
                int panelHeight = 50;
                
                /*numberingPanel.setSize(new Dimension(numberingPanel.getSize().width, panelHeight));
                numberingPanel.setPreferredSize(new Dimension(numberingPanel.getSize().width, panelHeight));
                numberingPanel.setMaximumSize(new Dimension(panelWidth, panelHeight));*/
            }
            
            panel.add(numberingPanel);
        }
        
        // Display each response: question, answer, and whether it was correct.
        
        int numResponses = 0;
        int numCorrect = 0;
        for (Response response : reportSheet.responses) {
            numResponses++;
            numCorrect += (response.correct) ? 1 : 0;
            
            // Panel to contain response
            JPanel responsePanel = new JPanel();
            responsePanel.setBorder(BorderFactory.createLineBorder(Color.black));
            
            BoxLayout layout = new BoxLayout(responsePanel, BoxLayout.Y_AXIS);
            responsePanel.setLayout(layout);
            
            responsePanel.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
            
            // Label to display question and whether correct
            JLabel questionLabel = new JLabel("Question " + numResponses + ": " + response.question);
            responsePanel.add(questionLabel);
                
            // Label to display answer
            JLabel answerLabel = new JLabel("Response: " + response.answer + " (" + ((response.correct) ? "Correct" : "Incorrect") + ")");
            responsePanel.add(answerLabel);
                
            // Try to make the panels not take up the entire screen
            {
                // An arbitrarily large width so that the maximum height can be set
                int panelWidth = 10000;
                
                // The maximum height
                int panelHeight = 50;
                
                responsePanel.setSize(new Dimension(responsePanel.getSize().width, panelHeight));
                responsePanel.setPreferredSize(new Dimension(responsePanel.getSize().width, panelHeight));
                responsePanel.setMaximumSize(new Dimension(panelWidth, panelHeight));
            }
                
            panel.add(responsePanel);
        }
        
        //JFrame reportSheetGrade = new ReportSheetDisplayA(numCorrect, numResponses);
        //javax.swing.JInternalFrame f2 = reportSheetGrade;
        //panel.add(reportSheetGrade);
        
        addScoreDisplay(panel, numCorrect, numResponses);

        JScrollPane scroll = new JScrollPane(panel);
        frame.add(scroll);
        frame.setVisible(true);
    }
    
    private void forceSize(javax.swing.JComponent component, int width, int height) {
        
        Dimension dimension = new Dimension(width, height);
        
        component.setSize(dimension);
        component.setPreferredSize(dimension);
        component.setMaximumSize(dimension);
    }
    
    private void addScoreDisplay(JPanel panel, int numerator, int denominator) {
        
        JPanel scoreDisplay = new JPanel();
        BoxLayout layout = new BoxLayout(scoreDisplay, BoxLayout.Y_AXIS);
        scoreDisplay.setLayout(layout);
        forceSize(scoreDisplay, 10000, 200);
        
        scoreDisplay.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
        
        JLabel scoreLabel = new JLabel();
        scoreLabel.setText("Score:");
        scoreLabel.setFont(new java.awt.Font("Segoe UI", 1, 18));
        forceSize(scoreDisplay, 200, 50);
        panel.add(scoreLabel);
        
        JPanel midPanel = new JPanel();
        BoxLayout midLayout = new BoxLayout(midPanel, BoxLayout.X_AXIS);
        midPanel.setLayout(midLayout);
        {
            JPanel fractionPanel = new JPanel();
            forceSize(fractionPanel, 100, 105);
            fractionPanel.setLayout(new BorderLayout());
            //fractionPanel.setBorder(BorderFactory.createLineBorder(Color.black));
            {
                JLabel numeratorLabel = new JLabel();
                numeratorLabel.setText(Integer.toString(numerator));
                numeratorLabel.setFont(new java.awt.Font("Segoe UI", 1, 18));
                forceSize(numeratorLabel, 100, 50);
                //numeratorLabel.setBorder(BorderFactory.createLineBorder(Color.black));
                numeratorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                fractionPanel.add(numeratorLabel, BorderLayout.NORTH);
                
                javax.swing.JSeparator fractionSeparator = new javax.swing.JSeparator();
                forceSize(fractionSeparator, 100, 5);
                fractionSeparator.setForeground(Color.black);
                fractionSeparator.setBackground(Color.black);
                //fractionSeparator.setBorder(BorderFactory.createLineBorder(Color.black));
                fractionPanel.add(fractionSeparator, BorderLayout.CENTER);
                
                JLabel denominatorLabel = new JLabel();
                denominatorLabel.setText(Integer.toString(denominator));
                denominatorLabel.setFont(new java.awt.Font("Segoe UI", 1, 18));
                forceSize(denominatorLabel, 100, 50);
                //denominatorLabel.setBorder(BorderFactory.createLineBorder(Color.black));
                denominatorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                fractionPanel.add(denominatorLabel, BorderLayout.SOUTH);
            }
            midPanel.add(fractionPanel);

            JLabel equalsSignLabel = new JLabel();
            equalsSignLabel.setText(" =");
            equalsSignLabel.setFont(new java.awt.Font("Segoe UI", 1, 18));
            forceSize(equalsSignLabel, 25, 50);
            //equalsSignLabel.setBorder(BorderFactory.createLineBorder(Color.black));
            midPanel.add(equalsSignLabel);

            String percentage = Math.floor((((double)numerator) / ((double)denominator) * 100) * 100) / 100 + "%";
            
            JLabel percentageLabel = new JLabel();
            percentageLabel.setText(percentage);
            percentageLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
            forceSize(percentageLabel, 100, 50);
            //percentageLabel.setBorder(BorderFactory.createLineBorder(Color.black));
            midPanel.add(percentageLabel);
        }
        panel.add(midPanel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
