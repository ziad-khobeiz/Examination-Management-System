/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Entities.*;

import javax.swing.*;

/**
 *
 * @author yn653
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Login() {
        initComponents();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        loginButton = new javax.swing.JButton();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        usernameTextfield = new javax.swing.JTextField();
        passwordTextField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(134, 171, 161));
        setSize(new java.awt.Dimension(800, 680));

        jPanel1.setBackground(new java.awt.Color(134, 171, 161));

        loginButton.setBackground(new java.awt.Color(253, 184, 39));
        loginButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        usernameLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        usernameLabel.setText("Username");

        passwordLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        passwordLabel.setText("Password");

        usernameTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextfieldActionPerformed(evt);
                loginButtonActionPerformed(evt);
            }

        });

        passwordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextFieldActionPerformed(evt);
                loginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(345, 345, 345)
                        .addComponent(loginButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameLabel)
                            .addComponent(passwordLabel))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usernameTextfield, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(passwordTextField))))
                .addContainerGap(339, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(264, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel)
                    .addComponent(usernameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginButton)
                .addGap(317, 317, 317))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        
        String username = usernameTextfield.getText();
        if(username.trim().isEmpty()){

            JOptionPane.showMessageDialog(null, "Please enter the username.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }else if(passwordTextField.getText().trim().isEmpty()){

            JOptionPane.showMessageDialog(null, "Please enter the password.", "Error", JOptionPane.ERROR_MESSAGE);

            return;
        }else if(User.isValidUser(username, passwordTextField.getText())) {
           
           User.UserType userType = User.getUserType(username);
           setVisible(false);
            
           switch(userType) {
               
               case ADMIN:
                   new AdminDashboard(username).setVisible(true);
                   dispose();
                   break;
               default:
                   new UserDashboard(userType, username).setVisible(true);
                   dispose();
           }

        }else if(!User.isValidUser(username, passwordTextField.getText())){

            JOptionPane.showMessageDialog(null, "The username or password are incorrect.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
    }//GEN-LAST:event_loginButtonActionPerformed

    private void usernameTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTextfieldActionPerformed

    private void passwordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {        
                
                new Login().setVisible(true);
            }
        });
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameTextfield;
    // End of variables declaration//GEN-END:variables
}
