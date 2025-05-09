/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package QuizApplicationPackage;

import javax.swing.*;

public class Credits extends javax.swing.JFrame {

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel creditsPanel;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel memberLabel;
    private javax.swing.JButton nextButton;
    private javax.swing.JButton previousButton;
    String[] credits;
    String[] photosDirectory;
    int currPage = 0;
    // End of variables declaration//GEN-END:variables

    /**
     * Creates new form CreditsJFrame
     */
    public Credits() {
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

        creditsPanel = new javax.swing.JPanel();
        memberLabel = new javax.swing.JLabel();
        imageLabel = new javax.swing.JLabel();
        nextButton = new javax.swing.JButton();
        previousButton = new javax.swing.JButton();

        photosDirectory = new String[] {
                "photos/johnny.jpg",
                "photos/nathan.jpg",
                "photos/nolan.jpg",
                "photos/albert.jpg",
                "photos/eric.jpg",
                "photos/jesus.jpg"
        };

        credits = new String[] {
                "Program Manager - Johnny Nicholson",
                "Analyst - Nathan Gumataotao",
                "Designer/Programmer - Nolan Smith",
                "Designer/Programmer - Albert Lehman",
                "Programmer - Eric Li",
                "Programmer - Jesus Pelaez"
        };

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Credits");

        memberLabel.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        memberLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        nextButton.setText("Next");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        previousButton.setText("Previous");
        previousButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousButtonActionPerformed(evt);
            }
        });

        loadPage();

        javax.swing.GroupLayout creditsPanelLayout = new javax.swing.GroupLayout(creditsPanel);
        creditsPanel.setLayout(creditsPanelLayout);
        creditsPanelLayout.setHorizontalGroup(
            creditsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(creditsPanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(creditsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, creditsPanelLayout.createSequentialGroup()
                        .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, creditsPanelLayout.createSequentialGroup()
                        .addComponent(memberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, creditsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(creditsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(previousButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nextButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(170, 170, 170))
        );
        creditsPanelLayout.setVerticalGroup(
            creditsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, creditsPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(memberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nextButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(previousButton)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addComponent(creditsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(creditsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadPage() {
        memberLabel.setText(credits[currPage]);
        try {
            imageLabel.setIcon(new ImageIcon(Credits.class.getResource(photosDirectory[currPage])));
        }
        catch (NullPointerException x) {
            JOptionPane.showMessageDialog(
                    null,
                    "Photo could not be loaded: " + x.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
        previousButton.setEnabled(currPage != 0);
        nextButton.setEnabled(currPage != photosDirectory.length - 1);
    }
    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        if (currPage < photosDirectory.length - 1) {
            currPage++;
            loadPage();
        }
    }//GEN-LAST:event_nextButtonActionPerformed

    private void previousButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousButtonActionPerformed
        if (currPage > 0) {
            currPage--;
            loadPage();
        }
    }//GEN-LAST:event_previousButtonActionPerformed
}
