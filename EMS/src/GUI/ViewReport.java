/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Entities.Exam;
import Entities.Instructor;
import Entities.Model;
import Entities.Question;
import Entities.User;
import org.jfree.chart.ChartPanel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Ziad Khobeiz
 */
public class ViewReport extends javax.swing.JFrame {

    private Instructor instructor;
    private Exam exam;
    private Font myFont = new java.awt.Font("Tahoma", Font.LAYOUT_LEFT_TO_RIGHT, 11);
    
    /**
     * Creates new form Report
     */

    public ViewReport(Instructor instructor, Exam exam) {
        this.instructor = instructor;
        this.exam = exam;
        initComponents();
        showTitle();
        showTopQuestions(5);
        drawHistogram("The Occurrence of Students Marks", "Students Marks",
                "No. Students");
    }
    
    private void showTitle() {
        title.setText("Exam #" + exam.getId() + ": " + exam.getName());
    }
    
    private void showTopQuestions(int size) {
        Vector<Question> questions = exam.getTopQuestions(size);
        int delta = 100 , currentIndex = 0; 
        
        for (Question question : questions)
        {
            JLabel questionNumber = new JLabel("Q" + (currentIndex+1) + ": ");
            questionNumber.setBounds(20, delta, 300, 80);
            questionNumber.setFont(myFont);
            panel.add(questionNumber);
            JTextField questionStatement = new JTextField(question.getStatement());
            questionStatement.setEditable(false);
            questionStatement.setBounds(50, 25+delta, 550, 30);
            questionStatement.setFont(myFont);
            panel.add(questionStatement);
            JButton showQuestionButton = new JButton("Question");
            showQuestionButton.setFont(myFont);
            showQuestionButton.setBounds(630, 25+delta , 130, 30);
            showQuestionButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    new ViewQuestion(instructor, question, new Model(question.getExamId(), question.getModelNumber()), true).setVisible(true);
                    dispose();
                }
            });
            panel.add(showQuestionButton);
            currentIndex++;
            delta += 45;
        }  
    }

    private void drawHistogram(String title, String xAxis, String yAxis) {
        Histogram histogram = new Histogram(Histogram.HistogramData(exam), title, xAxis, yAxis);
        ChartPanel chartPanel = new ChartPanel( histogram.getHistogramChart());
        chartPanel.setBounds(125 ,400, 500, 300);
        panel.add(chartPanel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        logoutButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        subtitle = new javax.swing.JLabel();
        title = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(134, 171, 161));
        setResizable(false);
        setSize(new java.awt.Dimension(1200, 1100));

        panel.setBackground(new java.awt.Color(134, 171, 161));
        panel.setPreferredSize(new java.awt.Dimension(798, 850));

        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        subtitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        subtitle.setText("Top 5 Questions:");

        title.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Title");
        title.setFocusTraversalPolicyProvider(true);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(subtitle)
                        .addContainerGap(628, Short.MAX_VALUE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(backButton)
                        .addGap(286, 286, 286)
                        .addComponent(title)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logoutButton)
                        .addGap(21, 21, 21))))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logoutButton)
                    .addComponent(backButton)
                    .addComponent(title))
                .addGap(18, 18, 18)
                .addComponent(subtitle)
                .addContainerGap(764, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        new ViewExams((User) instructor, exam.getExamClass()).setVisible(true);
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        new ViewReport(new Instructor("omarhassan"), new Exam(1)).setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton logoutButton;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel subtitle;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
