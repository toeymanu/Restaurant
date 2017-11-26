/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restuarant.view;

import java.util.ArrayList;
import restuarant.controller.Function;
import restuarant_model.PictureDB;

/**
 *
 * @author ASUS
 */
public class Drink extends javax.swing.JFrame {

    /**
     * Creates new form Drink
     */
    private int username = -1;

    public Drink(int user) {
        initComponents();
        username = user;
        setLocationRelativeTo(null);

        AllDrink.setModel(new javax.swing.AbstractListModel<String>() {
            ArrayList<String> strings = Function.getAllDrink();

            @Override
            public int getSize() {
                return strings.size();
            }

            @Override
            public String getElementAt(int i) {
                return strings.get(i);
            }
        });
    }

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
        pic1 = new javax.swing.JPanel();
        Namepic1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AllDrink = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        Background = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1080, 720));
        setSize(new java.awt.Dimension(1080, 720));
        getContentPane().setLayout(null);

        Homepage.setBackground(new java.awt.Color(227, 178, 80));
        Homepage.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        Homepage.setText("Homepage");
        Homepage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomepageActionPerformed(evt);
            }
        });
        getContentPane().add(Homepage);
        Homepage.setBounds(230, 170, 120, 40);

        Mandish.setBackground(new java.awt.Color(227, 178, 80));
        Mandish.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        Mandish.setText("Maindish");
        Mandish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MandishActionPerformed(evt);
            }
        });
        getContentPane().add(Mandish);
        Mandish.setBounds(350, 170, 120, 40);

        Dessert.setBackground(new java.awt.Color(227, 178, 80));
        Dessert.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        Dessert.setText("Dessert");
        Dessert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DessertActionPerformed(evt);
            }
        });
        getContentPane().add(Dessert);
        Dessert.setBounds(470, 170, 120, 40);

        SignOut.setBackground(new java.awt.Color(227, 178, 80));
        SignOut.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        SignOut.setText("Sign-Out");
        SignOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignOutActionPerformed(evt);
            }
        });
        getContentPane().add(SignOut);
        SignOut.setBounds(710, 170, 120, 40);

        Drink.setBackground(new java.awt.Color(227, 178, 80));
        Drink.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        Drink.setText("Drinks");
        Drink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DrinkActionPerformed(evt);
            }
        });
        getContentPane().add(Drink);
        Drink.setBounds(590, 170, 120, 40);

        pic1.setBackground(new java.awt.Color(255, 255, 255));
        pic1.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(204, 102, 0)));

        javax.swing.GroupLayout pic1Layout = new javax.swing.GroupLayout(pic1);
        pic1.setLayout(pic1Layout);
        pic1Layout.setHorizontalGroup(
            pic1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 412, Short.MAX_VALUE)
        );
        pic1Layout.setVerticalGroup(
            pic1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 272, Short.MAX_VALUE)
        );

        getContentPane().add(pic1);
        pic1.setBounds(530, 290, 420, 280);

        Namepic1.setBackground(new java.awt.Color(255, 255, 255));
        Namepic1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        getContentPane().add(Namepic1);
        Namepic1.setBounds(660, 240, 190, 40);

        AllDrink.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        AllDrink.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AllDrink.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        AllDrink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AllDrinkMouseClicked(evt);
            }
        });
        AllDrink.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                AllDrinkValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(AllDrink);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(100, 280, 360, 290);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(100, 580, 550, 120);

        Background.setForeground(new java.awt.Color(255, 255, 0));
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GuiImg/drink1.jpg"))); // NOI18N
        getContentPane().add(Background);
        Background.setBounds(0, 0, 1080, 720);

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(610, 380, 412, 272);

        setBounds(0, 0, 1098, 767);
    }// </editor-fold>//GEN-END:initComponents

    private void DrinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DrinkActionPerformed
        Drink d = new Drink(username);
        this.setVisible(false);
        d.setVisible(true);
    }//GEN-LAST:event_DrinkActionPerformed

    private void HomepageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomepageActionPerformed
        Welcomeuser user = new Welcomeuser(username);
        this.setVisible(false);
        user.setVisible(true);
    }//GEN-LAST:event_HomepageActionPerformed

    private void MandishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MandishActionPerformed
        Maindish md = new Maindish(username);
        this.setVisible(false);
        md.setVisible(true);
    }//GEN-LAST:event_MandishActionPerformed

    private void AllDrinkValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_AllDrinkValueChanged
//        System.out.println(AllDrink.getSelectedValue());
        String menu[] = Function.getMenu(AllDrink.getSelectedValue());
        Namepic1.setText(menu[0]);
        jTextArea1.setText(menu[2]);
    }//GEN-LAST:event_AllDrinkValueChanged

    private void AllDrinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AllDrinkMouseClicked
//         System.out.println(AllDrink.getSelectedValue());
//       
//        String menu[] = Function.getMenu(AllDrink.getSelectedValue());
//            Namepic1.setText(menu[0]);
//            jTextArea1.setText(menu[2]);
    }//GEN-LAST:event_AllDrinkMouseClicked

    private void DessertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DessertActionPerformed
        Desserts ds = new Desserts(username);
        this.setVisible(false);
        ds.setVisible(true);
    }//GEN-LAST:event_DessertActionPerformed

    private void SignOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignOutActionPerformed
        username = -1;

        Welcome wel = new Welcome();
        this.setVisible(false);
        wel.setVisible(true);
    }//GEN-LAST:event_SignOutActionPerformed

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
    private javax.swing.JList<String> AllDrink;
    private javax.swing.JLabel Background;
    private javax.swing.JButton Dessert;
    private javax.swing.JButton Drink;
    private javax.swing.JButton Homepage;
    private javax.swing.JButton Mandish;
    private javax.swing.JLabel Namepic1;
    private javax.swing.JButton SignOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel pic1;
    // End of variables declaration//GEN-END:variables
}
