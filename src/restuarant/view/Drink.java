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
public class Drink extends javax.swing.JFrame {

    /**
     * Creates new form Drink
     */
    public Drink() {
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

        Homepage = new javax.swing.JButton();
        Mandish = new javax.swing.JButton();
        Dessert = new javax.swing.JButton();
        SignOut = new javax.swing.JButton();
        Drink = new javax.swing.JButton();
        pic2 = new javax.swing.JPanel();
        pic3 = new javax.swing.JPanel();
        pic4 = new javax.swing.JPanel();
        pic1 = new javax.swing.JPanel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1080, 720));
        getContentPane().setLayout(null);

        Homepage.setBackground(new java.awt.Color(227, 178, 80));
        Homepage.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        Homepage.setText("Homepage");
        getContentPane().add(Homepage);
        Homepage.setBounds(230, 170, 120, 40);

        Mandish.setBackground(new java.awt.Color(227, 178, 80));
        Mandish.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        Mandish.setText("Maindish");
        getContentPane().add(Mandish);
        Mandish.setBounds(470, 170, 120, 40);

        Dessert.setBackground(new java.awt.Color(227, 178, 80));
        Dessert.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        Dessert.setText("Dessert");
        getContentPane().add(Dessert);
        Dessert.setBounds(710, 170, 120, 40);

        SignOut.setBackground(new java.awt.Color(227, 178, 80));
        SignOut.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        SignOut.setText("Sign-Out");
        getContentPane().add(SignOut);
        SignOut.setBounds(590, 170, 120, 40);

        Drink.setBackground(new java.awt.Color(227, 178, 80));
        Drink.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        Drink.setText("Drinks");
        Drink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DrinkActionPerformed(evt);
            }
        });
        getContentPane().add(Drink);
        Drink.setBounds(350, 170, 120, 40);

        pic2.setBackground(new java.awt.Color(255, 255, 255));
        pic2.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(204, 102, 0)));

        javax.swing.GroupLayout pic2Layout = new javax.swing.GroupLayout(pic2);
        pic2.setLayout(pic2Layout);
        pic2Layout.setHorizontalGroup(
            pic2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 162, Short.MAX_VALUE)
        );
        pic2Layout.setVerticalGroup(
            pic2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 132, Short.MAX_VALUE)
        );

        getContentPane().add(pic2);
        pic2.setBounds(580, 240, 170, 140);

        pic3.setBackground(new java.awt.Color(255, 255, 255));
        pic3.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(204, 102, 0)));

        javax.swing.GroupLayout pic3Layout = new javax.swing.GroupLayout(pic3);
        pic3.setLayout(pic3Layout);
        pic3Layout.setHorizontalGroup(
            pic3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 162, Short.MAX_VALUE)
        );
        pic3Layout.setVerticalGroup(
            pic3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 132, Short.MAX_VALUE)
        );

        getContentPane().add(pic3);
        pic3.setBounds(270, 440, 170, 140);

        pic4.setBackground(new java.awt.Color(255, 255, 255));
        pic4.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(204, 102, 0)));

        javax.swing.GroupLayout pic4Layout = new javax.swing.GroupLayout(pic4);
        pic4.setLayout(pic4Layout);
        pic4Layout.setHorizontalGroup(
            pic4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 162, Short.MAX_VALUE)
        );
        pic4Layout.setVerticalGroup(
            pic4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 132, Short.MAX_VALUE)
        );

        getContentPane().add(pic4);
        pic4.setBounds(590, 440, 170, 140);

        pic1.setBackground(new java.awt.Color(255, 255, 255));
        pic1.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(204, 102, 0)));

        javax.swing.GroupLayout pic1Layout = new javax.swing.GroupLayout(pic1);
        pic1.setLayout(pic1Layout);
        pic1Layout.setHorizontalGroup(
            pic1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 162, Short.MAX_VALUE)
        );
        pic1Layout.setVerticalGroup(
            pic1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 132, Short.MAX_VALUE)
        );

        getContentPane().add(pic1);
        pic1.setBounds(270, 240, 170, 140);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GuiImg/drink1.jpg"))); // NOI18N
        getContentPane().add(Background);
        Background.setBounds(0, 0, 1080, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DrinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DrinkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DrinkActionPerformed

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
            java.util.logging.Logger.getLogger(Drink.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Drink.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Drink.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Drink.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Drink().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton Dessert;
    private javax.swing.JButton Drink;
    private javax.swing.JButton Homepage;
    private javax.swing.JButton Mandish;
    private javax.swing.JButton SignOut;
    private javax.swing.JPanel pic1;
    private javax.swing.JPanel pic2;
    private javax.swing.JPanel pic3;
    private javax.swing.JPanel pic4;
    // End of variables declaration//GEN-END:variables
}
