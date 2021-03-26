/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author bizarre
 */
public class EstablishTimeExam extends javax.swing.JFrame {

    /**
     * Creates new form EstablishTimeExam
     */
    public EstablishTimeExam() {
        initComponents();
        setVisible(true);
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
        LogoutButton = new javax.swing.JButton();
        startTimeExamLabel = new javax.swing.JLabel();
        endTimeExamLabel1 = new javax.swing.JLabel();
        startDateHoursTextField = new javax.swing.JTextField();
        startDateMinutesTextField = new javax.swing.JTextField();
        startDateSecondsTextField = new javax.swing.JTextField();
        separator1 = new javax.swing.JLabel();
        separator2 = new javax.swing.JLabel();
        finishButton = new javax.swing.JButton();
        examDay = new javax.swing.JLabel();
        startDateYearTextField = new javax.swing.JTextField();
        separator5 = new javax.swing.JLabel();
        startDateMonthTextField = new javax.swing.JTextField();
        separator6 = new javax.swing.JLabel();
        startDateDayTextField = new javax.swing.JTextField();
        endDateSecondsTextField = new javax.swing.JTextField();
        separator7 = new javax.swing.JLabel();
        endDateMinutesTextField = new javax.swing.JTextField();
        separator8 = new javax.swing.JLabel();
        endDateHoursTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(134, 171, 161));

        LogoutButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        LogoutButton.setText("Logout");
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });

        startTimeExamLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        startTimeExamLabel.setText("2 - Enter the start time of the exam:");

        endTimeExamLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        endTimeExamLabel1.setText("3 - Enter the end time of the exam:");

        startDateHoursTextField.setText("HH");
        startDateHoursTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startDateHoursTextFieldActionPerformed(evt);
            }
        });

        startDateMinutesTextField.setText("mm");
        startDateMinutesTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startDateMinutesTextFieldActionPerformed(evt);
            }
        });

        startDateSecondsTextField.setText("ss");
        startDateSecondsTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startDateSecondsTextFieldActionPerformed(evt);
            }
        });

        separator1.setText(":");

        separator2.setText(":");

        finishButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        finishButton.setText("Finish");
        finishButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishButtonActionPerformed(evt);
            }
        });

        examDay.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        examDay.setText("1 - Enter the exam day:");

        startDateYearTextField.setText("YYYY");

        separator5.setText("/");

        startDateMonthTextField.setText("MM");

        separator6.setText("/");

        startDateDayTextField.setText("DD");

        endDateSecondsTextField.setText("ss");
        endDateSecondsTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endDateSecondsTextFieldActionPerformed(evt);
            }
        });

        separator7.setText(":");

        endDateMinutesTextField.setText("mm");
        endDateMinutesTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endDateMinutesTextFieldActionPerformed(evt);
            }
        });

        separator8.setText(":");

        endDateHoursTextField.setText("HH");
        endDateHoursTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endDateHoursTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(finishButton)
                    .addComponent(LogoutButton))
                .addGap(24, 24, 24))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(endTimeExamLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(startTimeExamLabel)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(startDateHoursTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(separator1)
                            .addGap(28, 28, 28)
                            .addComponent(startDateMinutesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26)
                            .addComponent(separator2)
                            .addGap(26, 26, 26)
                            .addComponent(startDateSecondsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(startDateDayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(separator6)
                            .addGap(28, 28, 28)
                            .addComponent(startDateMonthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26)
                            .addComponent(separator5)
                            .addGap(26, 26, 26)
                            .addComponent(startDateYearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(endDateHoursTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(separator8)
                            .addGap(28, 28, 28)
                            .addComponent(endDateMinutesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26)
                            .addComponent(separator7)
                            .addGap(26, 26, 26)
                            .addComponent(endDateSecondsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(examDay))
                .addContainerGap(407, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(LogoutButton)
                .addGap(120, 120, 120)
                .addComponent(examDay)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startDateDayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startDateYearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startDateMonthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(separator6)
                    .addComponent(separator5))
                .addGap(27, 27, 27)
                .addComponent(startTimeExamLabel)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startDateHoursTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startDateSecondsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startDateMinutesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(separator1)
                    .addComponent(separator2))
                .addGap(26, 26, 26)
                .addComponent(endTimeExamLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(endDateHoursTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(endDateSecondsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(endDateMinutesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(separator8)
                    .addComponent(separator7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                .addComponent(finishButton)
                .addGap(78, 78, 78))
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

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        // TODO add your handling code here:
        new Login();
        dispose();
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void startDateMinutesTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startDateMinutesTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_startDateMinutesTextFieldActionPerformed

    private void startDateHoursTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startDateHoursTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_startDateHoursTextFieldActionPerformed

    private void finishButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishButtonActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_finishButtonActionPerformed

    private void startDateSecondsTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startDateSecondsTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_startDateSecondsTextFieldActionPerformed

    private void endDateSecondsTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endDateSecondsTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_endDateSecondsTextFieldActionPerformed

    private void endDateMinutesTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endDateMinutesTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_endDateMinutesTextFieldActionPerformed

    private void endDateHoursTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endDateHoursTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_endDateHoursTextFieldActionPerformed
    private void DateValidation() /*throws ParseException*/{
        String strtTimeHour = startDateHoursTextField.getText();
        String strtTimeMinute = startDateMinutesTextField.getText();
        String strtTimeSecond = startDateSecondsTextField.getText();
        String endTimeHour = endDateHoursTextField.getText();
        String endTimeMinute = endDateMinutesTextField.getText();
        String endTimeSecond = endDateSecondsTextField.getText();
        String strtDateDay = startDateDayTextField.getText();
        String strtDateMonth = startDateMonthTextField.getText();
        String strtDateYear = startDateYearTextField.getText();
        DateFormat df = new SimpleDateFormat("dd/MM/yy");
        //Date date1 = df.parse(startDateDayTextField.getText() + "/" + startDateMonthTextField + "/" + startDateYearTextField);
        //System.out.println(df.format(date1));
        //Date dateobj = new Date();
        //System.out.println(df.format(dateobj));
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
            java.util.logging.Logger.getLogger(EstablishTimeExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EstablishTimeExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EstablishTimeExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstablishTimeExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EstablishTimeExam().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogoutButton;
    private javax.swing.JTextField endDateHoursTextField;
    private javax.swing.JTextField endDateMinutesTextField;
    private javax.swing.JTextField endDateSecondsTextField;
    private javax.swing.JLabel endTimeExamLabel1;
    private javax.swing.JLabel examDay;
    private javax.swing.JButton finishButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel separator1;
    private javax.swing.JLabel separator2;
    private javax.swing.JLabel separator5;
    private javax.swing.JLabel separator6;
    private javax.swing.JLabel separator7;
    private javax.swing.JLabel separator8;
    private javax.swing.JTextField startDateDayTextField;
    private javax.swing.JTextField startDateHoursTextField;
    private javax.swing.JTextField startDateMinutesTextField;
    private javax.swing.JTextField startDateMonthTextField;
    private javax.swing.JTextField startDateSecondsTextField;
    private javax.swing.JTextField startDateYearTextField;
    private javax.swing.JLabel startTimeExamLabel;
    // End of variables declaration//GEN-END:variables
}
