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
import javax.swing.WindowConstants;

public class Welcomeuser extends javax.swing.JFrame {

    private String username = null;

    public Welcomeuser() {
        initComponents();
    }

    public Welcomeuser(String user) {
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
        Welcome.setBounds(140, 0, 880, 150);

        Mainpage.setBackground(new java.awt.Color(255, 51, 51));
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
        Feedbackk.setBounds(950, 670, 130, 50);

        logout.setBackground(new java.awt.Color(255, 51, 51));
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

        maindish.setBackground(new java.awt.Color(255, 51, 51));
        maindish.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        maindish.setForeground(new java.awt.Color(255, 255, 255));
        maindish.setText("Maindish");
        maindish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maindishActionPerformed(evt);
            }
        });
        getContentPane().add(maindish);
        maindish.setBounds(300, 160, 100, 40);

        Drink.setText("Drink");
        Drink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DrinkActionPerformed(evt);
            }
        });
        getContentPane().add(Drink);
        Drink.setBounds(520, 170, 79, 29);

        Dessert.setText("Dessert");
        Dessert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DessertActionPerformed(evt);
            }
        });
        getContentPane().add(Dessert);
        Dessert.setBounds(720, 170, 97, 29);

        background.setBackground(new java.awt.Color(255, 51, 51));
        background.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GuiImg/chi1.jpg"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 1080, 720);

        setSize(new java.awt.Dimension(1080, 742));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MainpageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainpageActionPerformed
        Welcomeuser user = new Welcomeuser();
        this.setVisible(false);
        user.setVisible(true);
    }//GEN-LAST:event_MainpageActionPerformed

    private void FeedbackkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FeedbackkActionPerformed
        Feedback feed = new Feedback();
        this.setVisible(false);
        feed.setVisible(true);
    }//GEN-LAST:event_FeedbackkActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        username = null;
        
        Welcome wel = new Welcome();
        this.setVisible(false);
        wel.setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    private void maindishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maindishActionPerformed
        Maindish md = new Maindish();
        this.setVisible(false);
        md.setVisible(true);
    }//GEN-LAST:event_maindishActionPerformed

    private void DrinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DrinkActionPerformed
        Drink d = new Drink();
        this.setVisible(false);
        d.setVisible(true);
    }//GEN-LAST:event_DrinkActionPerformed

    private void DessertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DessertActionPerformed
        Desserts ds = new Desserts();
        this.setVisible(false);
        ds.setVisible(true);
    }//GEN-LAST:event_DessertActionPerformed

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
    private javax.swing.JButton Dessert;
    private javax.swing.JButton Drink;
    private javax.swing.JButton Feedbackk;
    private javax.swing.JButton Mainpage;
    private javax.swing.JLabel Welcome;
    private javax.swing.JLabel background;
    private javax.swing.JButton logout;
    private javax.swing.JButton maindish;
    // End of variables declaration//GEN-END:variables
}