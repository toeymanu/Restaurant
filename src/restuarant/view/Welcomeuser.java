/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restuarant.view;

/**
 *
 * @author ASUS
 */
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.WindowConstants;
import restuarant.controller.*;

public class Welcomeuser extends javax.swing.JFrame {
    private String FN,LN,Tele,Emails,Addr;
    private int username = -1;

    public Welcomeuser() {
        initComponents();
    }

    public Welcomeuser(int user) {
        initComponents();
        username = user;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Welcome = new javax.swing.JLabel();
        Mainpage = new javax.swing.JButton();
        Feedbackk = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        maindish = new javax.swing.JButton();
        Drink = new javax.swing.JButton();
        Dessert = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        FirstName = new javax.swing.JTextField();
        LastName = new javax.swing.JTextField();
        Tel = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        Address = new javax.swing.JTextField();
        Update = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sum-jang Restaurant");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("spoon-and-fork-crossed_318-33017.jpg")));
        setSize(new java.awt.Dimension(1080, 720));
        getContentPane().setLayout(null);

        Welcome.setFont(new java.awt.Font("Tw Cen MT Condensed", 3, 45)); // NOI18N
        Welcome.setForeground(new java.awt.Color(255, 255, 255));
        Welcome.setText("Welcome To Sum-jang Restaurant");
        getContentPane().add(Welcome);
        Welcome.setBounds(130, 0, 880, 150);

        Mainpage.setBackground(new java.awt.Color(0, 0, 0));
        Mainpage.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        Mainpage.setForeground(new java.awt.Color(255, 255, 255));
        Mainpage.setText("Mainpage");
        Mainpage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainpageActionPerformed(evt);
            }
        });
        getContentPane().add(Mainpage);
        Mainpage.setBounds(130, 160, 100, 40);

        Feedbackk.setBackground(new java.awt.Color(0, 0, 0));
        Feedbackk.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        Feedbackk.setForeground(new java.awt.Color(255, 255, 255));
        Feedbackk.setText("Feedback");
        Feedbackk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FeedbackkActionPerformed(evt);
            }
        });
        getContentPane().add(Feedbackk);
        Feedbackk.setBounds(930, 630, 130, 60);

        logout.setBackground(new java.awt.Color(0, 0, 0));
        logout.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout);
        logout.setBounds(950, 160, 100, 40);

        maindish.setBackground(new java.awt.Color(0, 0, 0));
        maindish.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        maindish.setForeground(new java.awt.Color(255, 255, 255));
        maindish.setText("Maindish");
        maindish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maindishActionPerformed(evt);
            }
        });
        getContentPane().add(maindish);
        maindish.setBounds(310, 160, 100, 40);

        Drink.setBackground(new java.awt.Color(0, 0, 0));
        Drink.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        Drink.setForeground(new java.awt.Color(255, 255, 255));
        Drink.setText("Drink");
        Drink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DrinkActionPerformed(evt);
            }
        });
        getContentPane().add(Drink);
        Drink.setBounds(740, 160, 100, 40);

        Dessert.setBackground(new java.awt.Color(0, 0, 0));
        Dessert.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        Dessert.setForeground(new java.awt.Color(255, 255, 255));
        Dessert.setText("Dessert");
        Dessert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DessertActionPerformed(evt);
            }
        });
        getContentPane().add(Dessert);
        Dessert.setBounds(510, 160, 97, 40);

        jLabel1.setText("FirstName : ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(350, 290, 76, 16);

        jLabel2.setText("LastName : ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(350, 330, 74, 20);

        jLabel3.setText("Tel :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(380, 380, 30, 16);

        jLabel4.setText("email : ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(370, 420, 50, 16);

        jLabel5.setText("Address :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(350, 460, 60, 20);

        FirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstNameActionPerformed(evt);
            }
        });
        getContentPane().add(FirstName);
        FirstName.setBounds(450, 280, 150, 30);
        FirstName.setText(Function.getFirstName(LogInForm.UserIDReal));
        getContentPane().add(LastName);
        LastName.setBounds(450, 320, 150, 30);
        LastName.setText(Function.getLastName(LogInForm.UserIDReal));
        getContentPane().add(Tel);
        Tel.setBounds(450, 370, 150, 30);
        Tel.setText(Function.getTel(LogInForm.UserIDReal));
        getContentPane().add(email);
        email.setBounds(450, 420, 150, 30);
        email.setText(Function.getemail(LogInForm.UserIDReal));
        getContentPane().add(Address);
        Address.setBounds(450, 460, 150, 30);
        Address.setText(Function.getaddress(LogInForm.UserIDReal));

        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        getContentPane().add(Update);
        Update.setBounds(480, 540, 88, 29);

        background.setBackground(new java.awt.Color(255, 51, 51));
        background.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GuiImg/chi1.jpg"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 1080, 720);

        setSize(new java.awt.Dimension(1080, 742));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MainpageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainpageActionPerformed
        Welcomeuser user = new Welcomeuser(username);
        this.setVisible(false);
        user.setVisible(true);
    }//GEN-LAST:event_MainpageActionPerformed

    private void FeedbackkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FeedbackkActionPerformed
        Feedback feed = new Feedback(username);
        this.setVisible(false);
        feed.setVisible(true);
    }//GEN-LAST:event_FeedbackkActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        username = -1;
        
        Welcome wel = new Welcome();
        this.setVisible(false);
        wel.setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    private void maindishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maindishActionPerformed
        Maindish md = new Maindish(username);
        this.setVisible(false);
        md.setVisible(true);
    }//GEN-LAST:event_maindishActionPerformed

    private void DrinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DrinkActionPerformed
        Drink d = new Drink(username);
        this.setVisible(false);
        d.setVisible(true);
    }//GEN-LAST:event_DrinkActionPerformed

    private void DessertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DessertActionPerformed
        Desserts ds = new Desserts(username);
        this.setVisible(false);
        ds.setVisible(true);
    }//GEN-LAST:event_DessertActionPerformed

    private void FirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstNameActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        try {
            Connection con = ConnectionBuilder.getConnection();
            String sql = "UPDATE User SET FirstName=?, LastName=?, Tel=?, Email=?, Address=? WHERE User_ID = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, FirstName.getText());
            pre.setString(2, LastName.getText());
            pre.setString(3, Tel.getText());
            pre.setString(4, email.getText());
            pre.setString(5, Address.getText());
            pre.setInt(6, LogInForm.UserIDReal);
            
            pre.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Welcomeuser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_UpdateActionPerformed

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
            java.util.logging.Logger.getLogger(Welcomeuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Welcomeuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Welcomeuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Welcomeuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Welcomeuser myFrame2 = new Welcomeuser();
                myFrame2.setExtendedState(MAXIMIZED_BOTH);
                myFrame2.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                new Welcomeuser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Address;
    private javax.swing.JButton Dessert;
    private javax.swing.JButton Drink;
    private javax.swing.JButton Feedbackk;
    private javax.swing.JTextField FirstName;
    private javax.swing.JTextField LastName;
    private javax.swing.JButton Mainpage;
    private javax.swing.JTextField Tel;
    private javax.swing.JButton Update;
    private javax.swing.JLabel Welcome;
    private javax.swing.JLabel background;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton logout;
    private javax.swing.JButton maindish;
    // End of variables declaration//GEN-END:variables
}
