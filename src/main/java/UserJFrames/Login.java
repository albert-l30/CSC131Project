package UserJFrames;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Files;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

public class Login extends javax.swing.JFrame {

    /**
     * Creates new form HomeJFrame
     */
    public Login() {
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

        createAccountPanel = new javax.swing.JPanel();
        createAccountLabel1 = new javax.swing.JLabel();
        createAccountLabel2 = new javax.swing.JLabel();
        createAccountButton = new javax.swing.JButton();
        accountNameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        accountTextField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        ErrorLabel = new javax.swing.JLabel();
        homeMenuBar = new javax.swing.JMenuBar();
        infoMenu = new javax.swing.JMenu();
        aboutItemMenu = new javax.swing.JMenuItem();
        contactMenuItem = new javax.swing.JMenuItem();
        creditsMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));

        createAccountLabel1.setText("Don't have an account?");

        createAccountLabel2.setText("Click the 'Create Account' button below.");

        createAccountButton.setText("Create Account");
        createAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAccountButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout createAccountPanelLayout = new javax.swing.GroupLayout(createAccountPanel);
        createAccountPanel.setLayout(createAccountPanelLayout);
        createAccountPanelLayout.setHorizontalGroup(
            createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createAccountPanelLayout.createSequentialGroup()
                .addContainerGap(128, Short.MAX_VALUE)
                .addGroup(createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createAccountPanelLayout.createSequentialGroup()
                        .addGroup(createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(createAccountLabel2)
                            .addGroup(createAccountPanelLayout.createSequentialGroup()
                                .addComponent(createAccountButton)
                                .addGap(50, 50, 50)))
                        .addGap(67, 67, 67))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createAccountPanelLayout.createSequentialGroup()
                        .addComponent(createAccountLabel1)
                        .addGap(113, 113, 113))))
        );
        createAccountPanelLayout.setVerticalGroup(
            createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createAccountPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(createAccountLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(createAccountLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(createAccountButton)
                .addContainerGap())
        );

        accountNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        accountNameLabel.setText("Account Name");

        passwordLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        passwordLabel.setText("Enter Password");

        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        loginButton.setText("Log in");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        ErrorLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ErrorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        infoMenu.setText("Info");

        aboutItemMenu.setText("About");
        aboutItemMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutItemMenuActionPerformed(evt);
            }
        });
        infoMenu.add(aboutItemMenu);

        contactMenuItem.setText("Contact");
        contactMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactMenuItemActionPerformed(evt);
            }
        });
        infoMenu.add(contactMenuItem);

        creditsMenuItem.setText("Credits");
        creditsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditsMenuItemActionPerformed(evt);
            }
        });
        infoMenu.add(creditsMenuItem);

        homeMenuBar.add(infoMenu);

        setJMenuBar(homeMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(141, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(189, 189, 189)
                                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(passwordField)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(accountNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(accountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(createAccountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ErrorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountNameLabel)
                    .addComponent(accountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createAccountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ErrorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void createAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAccountButtonActionPerformed
        new CreateAccount().setVisible(true);
    }//GEN-LAST:event_createAccountButtonActionPerformed

    private boolean administrator() throws IOException {
    
        try {
            
            Path administratorFile = Paths.get(System.getProperty("user.home"), "QuizApplication", "Users", "administrator.log");
            BufferedReader reader = Files.newBufferedReader(administratorFile);
            return accountTextField.getText().equals(reader.readLine());
         
        }
        
        catch(NoSuchFileException x) {
        
            return false;
        
        }

    }
    
    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        
        /* Create a path that represents where the correct password is stored. "user.home" specifies the home folder in 
        this computer's file system. */
        
        Path passwordFile = Paths.get(System.getProperty("user.home"), "QuizApplication", "Users", "passwords.log");
        
        // Check if account name entered in the account text field exists in the password file 
        
        try {
           
            if (!accountNameTaken(passwordFile, accountTextField.getText())) {
        
                ErrorLabel.setText("The account name you entered does not exist.");
                return;
        
            } 
        }
        
        catch (IOException x) {
            
            System.err.format("IOException: %s%n", x);
            
        }
        
        // Check if password entered is correct.
        
        try {
        
            if (!isPasswordCorrect(passwordFile, accountTextField.getText(), passwordField.getPassword())) {
        
                ErrorLabel.setText("The password you entered is incorrect.");
                return;
                 
            }
            
            dispose();
            
            // Open Administrator home window if account given is an administrator account
            
            if (administrator()) 
                new AdministratorHome(accountTextField.getText()).setVisible(true);
            else
                new ExamineeHome(accountTextField.getText()).setVisible(true);
            
        }
        
        catch(IOException x) {
        
            System.err.format("IOException: %s%n", x);
        
        }
        
    }//GEN-LAST:event_passwordFieldActionPerformed

    private static boolean isPasswordCorrect(Path passwordFile, String accountNameInput, char[] passwordInput) throws IOException {
        
        BufferedReader reader = Files.newBufferedReader(passwordFile);
        
        String accountNameMatch = reader.readLine();
        String passwordMatch;
        String passwordInputString =  String.valueOf(passwordInput);
        
        // Find correct account with linear search algorithm
        
        while (accountNameMatch != null) {                                      // If end of file is not reached
        
            if (accountNameInput.equals(accountNameMatch)) {                    // If the account names match
            
                passwordMatch = reader.readLine();
                return passwordInputString.equals(passwordMatch);               // Return 'true' if the passwords are the same, 'false' otherwise.
                
            }
            
            reader.readLine();                                                  // Skip over password of account name that does not match
            accountNameMatch = reader.readLine();
        
        }
        
        return false;
        
    }
    
     // Returns 'true' if the given account name exists in the password file and false if it doesn't
    
    private static boolean accountNameTaken(Path passwordFile, String accountName) throws IOException {
    
        try {
            
            BufferedReader reader = Files.newBufferedReader(passwordFile);
            String accountNameMatch = reader.readLine();
            while (accountNameMatch != null) {
        
                if (accountName.equals(accountNameMatch))
                    return true;
            
                reader.readLine();                          // Skip over password
                accountNameMatch = reader.readLine();       // Read next account name     
        
            }
        }
        
        catch(NoSuchFileException x) {
        
            return false;
        
        }
        
        return false;
        
    }
    
    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        passwordFieldActionPerformed(evt); 
    }//GEN-LAST:event_loginButtonActionPerformed

    private void creditsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditsMenuItemActionPerformed
        new Credits().setVisible(true);
    }//GEN-LAST:event_creditsMenuItemActionPerformed

    private void contactMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactMenuItemActionPerformed
        new Contact().setVisible(true);
    }//GEN-LAST:event_contactMenuItemActionPerformed

    private void aboutItemMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutItemMenuActionPerformed
        new About().setVisible(true);                             // Creates 'About' window and displays it
    }//GEN-LAST:event_aboutItemMenuActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ErrorLabel;
    private javax.swing.JMenuItem aboutItemMenu;
    private javax.swing.JLabel accountNameLabel;
    private javax.swing.JTextField accountTextField;
    private javax.swing.JMenuItem contactMenuItem;
    private javax.swing.JButton createAccountButton;
    private javax.swing.JLabel createAccountLabel1;
    private javax.swing.JLabel createAccountLabel2;
    private javax.swing.JPanel createAccountPanel;
    private javax.swing.JMenuItem creditsMenuItem;
    private javax.swing.JMenuBar homeMenuBar;
    private javax.swing.JMenu infoMenu;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    // End of variables declaration//GEN-END:variables
}
