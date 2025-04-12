/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UserJFrames;

import java.io.*;
import java.nio.file.*;


/**
 *
 * @author alber
 */
public class CreateAccount extends javax.swing.JFrame {

    /**
     * Creates new form CreateAccountJFrame
     */
    public CreateAccount() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        passwordField = new javax.swing.JPasswordField();
        verifyPasswordField = new javax.swing.JPasswordField();
        accountTextField = new javax.swing.JTextField();
        createAccountButton = new javax.swing.JButton();
        accountLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        verifyPasswordLabel = new javax.swing.JLabel();
        ErrorPanel = new javax.swing.JPanel();
        ErrorLabel1 = new javax.swing.JLabel();
        ErrorLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        passwordField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        passwordField.setMinimumSize(new java.awt.Dimension(160, 22));

        verifyPasswordField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        verifyPasswordField.setPreferredSize(new java.awt.Dimension(160, 22));

        accountTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        accountTextField.setActionCommand("<Not Set>");
        accountTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        accountTextField.setPreferredSize(new java.awt.Dimension(160, 22));

        createAccountButton.setText("Create");
        createAccountButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        createAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAccountButtonActionPerformed(evt);
            }
        });

        accountLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        accountLabel.setText("Account Name");

        passwordLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        passwordLabel.setText("Enter Password");

        verifyPasswordLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        verifyPasswordLabel.setText("Enter Password Again");

        ErrorLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ErrorLabel1.setText("");

        ErrorLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ErrorLabel2.setText("");

        javax.swing.GroupLayout ErrorPanelLayout = new javax.swing.GroupLayout(ErrorPanel);
        ErrorPanel.setLayout(ErrorPanelLayout);
        ErrorPanelLayout.setHorizontalGroup(
            ErrorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(ErrorPanelLayout.createSequentialGroup()
                .addGroup(ErrorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ErrorLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                    .addComponent(ErrorLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        ErrorPanelLayout.setVerticalGroup(
            ErrorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ErrorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ErrorLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ErrorLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(189, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ErrorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(verifyPasswordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(passwordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(accountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(verifyPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(createAccountButton))
                            .addComponent(accountTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(verifyPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verifyPasswordLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createAccountButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ErrorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void createAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAccountButtonActionPerformed
        
        /* Create a path for the purpose of storing the account name and password entered. "user.home" specifies the home folder in 
        this computer's file system. */
        
        Path passwordFile = Paths.get(System.getProperty("user.home"), "pass", "password.log");
        
         /* Check if account name given matches with any account names already created. Uses the binary search algorithm 
        for this */
         
        try {
            
            if (accountNameTaken(passwordFile, accountTextField.getText())) {
        
                ErrorLabel1.setText("The account name you entered has already been taken.");
                ErrorLabel2.setText("Please enter a different account name.");
                return;
            
            }
        }
        
        catch(IOException x) {
        
            System.err.format("IOException: %s%n", x);
        
        }
        
        // Determine whether the passwords entered in initial password field and the verify password field are the same
        
        if (!java.util.Arrays.equals(passwordField.getPassword(), verifyPasswordField.getPassword())) {
        
            ErrorLabel1.setText("The given passwords do not match.");
            ErrorLabel2.setText("Please make sure they match.");
            return;
        
        }
        
        // Check if the path (and the file specified by the path) does NOT exist in this computer's file system
        
        if (Files.notExists(passwordFile)) {
            
            try {
                
                /* Retrieve a string that represents the passwordFile path, EXCEPT for the file of the path, which 
                is not included in the string. */
                
                String parentDirectoryString = passwordFile.subpath(0, passwordFile.getNameCount() - 1).toString();
                
                /* Create path that is the same as the passwordFile path except that the file of the path is not included
                in this new path. */
                
                Path passwordDirectory = Paths.get(passwordFile.getRoot().toString(), parentDirectoryString);
                
                // Check if passwordDirectory path exists in the file system. If it does not, create it.
                
                if (Files.notExists(passwordDirectory))
                    Files.createDirectory(passwordDirectory);
                
                // Create file specified by passwordFile path
                
                Files.createFile(passwordFile);
            }
            
            catch(IOException x) {
                
                System.err.format("IOException: %s%n", x);
            }
        }
        
        /* The WRITE enum constant (and no others) of the StandardOpenOption enum class needs to be used if 
        you only want to overwrite specific lines in a file, and not the entire file every time you use the write 
        instance method of the BufferedWriter class. */
        
        try(BufferedReader reader = Files.newBufferedReader(passwordFile); BufferedWriter writer = 
                Files.newBufferedWriter(passwordFile, StandardOpenOption.WRITE)) {
        
            // Read the first line of password file to get the current number of accounts
            
            String numOfAccountsString = reader.readLine();
            Integer numOfAccounts;
            
            /* If the file has not been written to yet, then no accounts (or passwords) have been stored in the file yet.
            Therefore, the current number of accounts created is 0. */
            
            if (numOfAccountsString == null)
                numOfAccounts = 0;                                          /* The literal int value '0' is autoboxed to an Integer
                                                                            value. */
           
            /* If the file has been written to by the program, then there should be an integer on the first line of the 
            file that represents the number of accounts created and stored in the file. */
            
            else {
                
                numOfAccounts = Integer.decode(numOfAccountsString);        // Convert the first line of file to an Integer
                
            }
            
            // If the number of accounts created and stored is 0, then write the number '1' to the first line of the file
            
            if (numOfAccounts == 0) {                                       // Unboxes 'Integer' value to 'int' and compares it to 0
            
                writer.write("1");
                writer.newLine();
                        
            } 
            
            /* If the number of accounts created is greater than 0, add 1 to the number of accounts and write the number 
            to the first line of the file */
            
            else {
                
                numOfAccounts += 1;
                numOfAccountsString = numOfAccounts.toString();
                writer.write(numOfAccountsString, 0, numOfAccountsString.length());                
                
            }
            
        }
        
        catch (IOException x) {
            
            System.err.format("IOException: %s%n", x);
            
        }
        
        /* Store account name and password entered by user into password file. Make sure to use the APPEND enum constant 
        so as to not overwrite the text that is already in the file. */
        
        try (BufferedWriter writer = Files.newBufferedWriter(passwordFile, StandardOpenOption.APPEND)) {
            
            writer.write(accountTextField.getText(), 0, accountTextField.getText().length());
            writer.newLine();
            writer.write(passwordField.getPassword(), 0, passwordField.getPassword().length);
            writer.newLine();
            
        } 
        
        catch (IOException x) {
            
            System.err.format("IOException: %s%n", x);
            
        }
    }//GEN-LAST:event_createAccountButtonActionPerformed

    // Method that returns 'true' if the given account name exists in the password file and false if it doesn't
    
    static boolean accountNameTaken(Path passwordFile, String accountName) throws IOException {
    
        // Retrieve the (unsorted) list of account names in the file
        
        String[] listOfAccountNames = getAccountNames(passwordFile);
        
        if (listOfAccountNames == null) // If there are no account names in the file
            return false;     
        
        // Sort list 
        
        String[] sortedAccountNames = sortAccountNames(listOfAccountNames);
        
        /* Given that the elements in list are sorted in alphabetical order, use the Binary Search algorithm to search 
        for given account name in list */
        
        int low = 0;
        int high = sortedAccountNames.length - 1;
        int mid;
        
        while (low <= high) {
        
            mid = high + low / 2;
            if (sortedAccountNames[mid].equalsIgnoreCase(accountName))
                return true;
            else if (accountName.compareToIgnoreCase(sortedAccountNames[mid]) < 0)
                high = mid - 1;
            else
                low = mid + 1;
        }
        
        return false;
    }
    
    // Returns an (unsorted) array of all the account names stored in the password file
    
    static String[] getAccountNames(Path passwordFile) throws IOException {
    
        BufferedReader reader = Files.newBufferedReader(passwordFile);
        
        // Retrieve the number of accounts stored in file
        
        String numOfAccountsString = reader.readLine();
        
        if (numOfAccountsString == null) // If no number is present
            return null;
        
        // Create array for the purpose of storing names
        
        int numOfAccounts = Integer.parseInt(numOfAccountsString);
        String[] listOfAccountNames = new String[numOfAccounts];
        for (int i = 0; i < listOfAccountNames.length; i++) {
            
            listOfAccountNames[i] = reader.readLine();
            
            // Skip over password
            
            reader.readLine();
                
        }
        
        return listOfAccountNames;
    
    }
    
    /* Method uses insertion sort algorithm to sort the given list in alphabetical order. compareToIgnoreCase() method 
    needs to be used instead of compareTo() method. */
    
    static String[] sortAccountNames(String[] accountNames) {
    
        String w;
        for (int i = 0; i < accountNames.length - 1; i++) {
        
            int j = i + 1;
            w = accountNames[j];
            
            while (j > 0 && w.compareToIgnoreCase(accountNames[j - 1]) < 0) {
            
                accountNames[j] = accountNames[j - 1];
                j--;
            
            }
        
            accountNames[j] = w;
        }
    
        return accountNames;
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateAccount().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ErrorLabel1;
    private javax.swing.JLabel ErrorLabel2;
    private javax.swing.JPanel ErrorPanel;
    private javax.swing.JLabel accountLabel;
    private javax.swing.JTextField accountTextField;
    private javax.swing.JButton createAccountButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField verifyPasswordField;
    private javax.swing.JLabel verifyPasswordLabel;
    // End of variables declaration//GEN-END:variables
}
