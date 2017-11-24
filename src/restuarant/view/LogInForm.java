/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restuarant.view;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.sql.Connection;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import restuarant.controller.ConnectionBuilder;
import restuarant.controller.Login;

/**
 *
 * @author ASUS
 */
public class LogInForm extends javax.swing.JFrame {
    static Connection con = ConnectionBuilder.getConnection();
    private String Username,password;
    public LogInForm() {
        initComponents();

    }

    /**
     * Creates new form LogInForm
     */

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Lusername = new javax.swing.JLabel();
        Username1 = new javax.swing.JTextField();
        Lpassword = new javax.swing.JLabel();
        Password1 = new javax.swing.JPasswordField();
        Blogin = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LogIn");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("spoon-and-fork-crossed_318-33017.jpg"))

        );
        getContentPane().setLayout(null);

        Lusername.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        Lusername.setForeground(new java.awt.Color(255, 255, 255));
        Lusername.setText("Username :");
        getContentPane().add(Lusername);
        Lusername.setBounds(220, 490, 130, 40);

        Username1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Username1ActionPerformed(evt);
            }
        });
        getContentPane().add(Username1);
        Username1.setBounds(350, 500, 280, 30);

        Lpassword.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        Lpassword.setForeground(new java.awt.Color(255, 255, 255));
        Lpassword.setText("Password :");
        getContentPane().add(Lpassword);
        Lpassword.setBounds(220, 560, 130, 40);

        Password1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Password1ActionPerformed(evt);
            }
        });
        getContentPane().add(Password1);
        Password1.setBounds(350, 570, 280, 30);

        Blogin.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Blogin.setText("Log in");
        Blogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BloginActionPerformed(evt);
            }
        });
        getContentPane().add(Blogin);
        Blogin.setBounds(440, 620, 100, 30);

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(236, 0, 86));
        jLabel4.setText("Log-in");
        jLabel4.setToolTipText("");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(420, 30, 170, 50);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setToolTipText("");
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-280, 0, 1580, 100);

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GuiImg/wlog.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-20, 0, 1170, 740);

        setSize(new java.awt.Dimension(1096, 759));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Username1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Username1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Username1ActionPerformed

    private void Password1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Password1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Password1ActionPerformed

    private void BloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BloginActionPerformed
        Username = Username1.getText();
        password = Password1.getText();
        
        Login log = new Login();
        if(log.LoginRestuarant(Username, password) == true){
        }  else {
            JOptionPane frame = new JOptionPane();
            JOptionPane.showMessageDialog(frame, "Failed to Login \n Please re-enter your username or password", "Login", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BloginActionPerformed

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
            java.util.logging.Logger.getLogger(LogInForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogInForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogInForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogInForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LogInForm myFrame = new LogInForm();

                myFrame.setExtendedState(MAXIMIZED_BOTH);

                myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

                new LogInForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Blogin;
    private javax.swing.JLabel Lpassword;
    private javax.swing.JLabel Lusername;
    private javax.swing.JPasswordField Password1;
    private javax.swing.JTextField Username1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
