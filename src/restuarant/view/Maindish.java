/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restuarant.view;

import java.awt.Image;
import static java.awt.SystemColor.menu;
//import static java.awt.SystemColor.menu;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import restuarant.controller.ConnectionBuilder;
import restuarant.controller.Function;

/**
 *
 * @author ASUS
 */
public class Maindish extends javax.swing.JFrame {

    /**
     * Creates new form Maindish
     */
    private int username = -1;
    private static int quantity = 0;
    Double Price = 0.0;
    Double tol;
    String id;
    private String photo;

    public Maindish(int user) {
        initComponents();
        username = user;
        setLocationRelativeTo(null);

        Menuall.setModel(new javax.swing.AbstractListModel<String>() {
            ArrayList<String> strings = Function.getAllMaindish();

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

    public Maindish() {
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
        jButton2 = new javax.swing.JButton();
        pic1 = new javax.swing.JPanel();
        ImageS = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Menuall = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        Total = new javax.swing.JLabel();
        MenuID1 = new javax.swing.JLabel();
        Background1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1080, 720));
        setSize(new java.awt.Dimension(1080, 720));
        getContentPane().setLayout(null);

        Homepage.setBackground(new java.awt.Color(153, 153, 153));
        Homepage.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        Homepage.setText("Homepage");
        Homepage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomepageActionPerformed(evt);
            }
        });
        getContentPane().add(Homepage);
        Homepage.setBounds(220, 120, 120, 30);

        Mandish.setBackground(new java.awt.Color(153, 153, 153));
        Mandish.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        Mandish.setText("Maindish");
        Mandish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MandishActionPerformed(evt);
            }
        });
        getContentPane().add(Mandish);
        Mandish.setBounds(340, 120, 130, 30);

        Dessert.setBackground(new java.awt.Color(153, 153, 153));
        Dessert.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        Dessert.setText("Dessert");
        Dessert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DessertActionPerformed(evt);
            }
        });
        getContentPane().add(Dessert);
        Dessert.setBounds(470, 120, 130, 30);

        SignOut.setBackground(new java.awt.Color(153, 153, 153));
        SignOut.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        SignOut.setText("Sign-Out");
        SignOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignOutActionPerformed(evt);
            }
        });
        getContentPane().add(SignOut);
        SignOut.setBounds(830, 120, 130, 30);

        Drink.setBackground(new java.awt.Color(153, 153, 153));
        Drink.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        Drink.setText("Drinks");
        Drink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DrinkActionPerformed(evt);
            }
        });
        getContentPane().add(Drink);
        Drink.setBounds(600, 120, 130, 30);

        jButton2.setText("CheckAllOrder");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(810, 40, 180, 29);

        pic1.setBackground(new java.awt.Color(255, 255, 255));
        pic1.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(204, 102, 0)));

        javax.swing.GroupLayout pic1Layout = new javax.swing.GroupLayout(pic1);
        pic1.setLayout(pic1Layout);
        pic1Layout.setHorizontalGroup(
            pic1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ImageS, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
        );
        pic1Layout.setVerticalGroup(
            pic1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pic1Layout.createSequentialGroup()
                .addComponent(ImageS, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(pic1);
        pic1.setBounds(70, 230, 380, 330);

        Menuall.setBorder(new javax.swing.border.MatteBorder(null));
        Menuall.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Menuall.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        Menuall.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuallMouseClicked(evt);
            }
        });
        Menuall.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                MenuallValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(Menuall);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(560, 230, 380, 300);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 170, 330, 50);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setText("Price :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(580, 580, 60, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(750, 580, 96, 27);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(70, 570, 500, 120);

        jButton1.setFont(new java.awt.Font("Kanit", 0, 13)); // NOI18N
        jButton1.setText("สั่งเลย");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(950, 620, 97, 29);

        Total.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        getContentPane().add(Total);
        Total.setBounds(650, 580, 90, 30);

        MenuID1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        getContentPane().add(MenuID1);
        MenuID1.setBounds(580, 540, 90, 30);

        Background1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GuiImg/maindish1.jpg"))); // NOI18N
        getContentPane().add(Background1);
        Background1.setBounds(0, -10, 1090, 730);

        setBounds(0, 0, 1098, 767);
    }// </editor-fold>//GEN-END:initComponents

    private void DrinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DrinkActionPerformed
        Drink d = new Drink();
        this.setVisible(false);
        d.setVisible(true);
    }//GEN-LAST:event_DrinkActionPerformed

    private void MenuallMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuallMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuallMouseClicked

    private void MenuallValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_MenuallValueChanged
//        System.out.println(Menuall.getSelectedValue());
        String menu[] = Function.getMenu(Menuall.getSelectedValue());
        jLabel2.setText(menu[0]);
        jTextArea1.setText(menu[2]);
        Total.setText(menu[3]);
        Price = Double.parseDouble(menu[3]);
        MenuID1.setText(menu[4]);
        
        
//        Image.setIcon(new ImageIcon((new ImageIcon("src/Images/"+(menu[2])).getImage().getScaledInstance(395,335.))));
        ImageS.setIcon(new ImageIcon((new ImageIcon("/src/Guilmg/"+(menu[1])).getImage().getScaledInstance(395,335,Image.SCALE_SMOOTH))));

    }//GEN-LAST:event_MenuallValueChanged

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

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
//            quantity = jComboBox1.getSelectedIndex();

//        tol = (quantity+1) * Price;
//        Total.setText("Total Price: "+tol);
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        quantity = jComboBox1.getSelectedIndex();

        String menu[] = Function.getMenu(Menuall.getSelectedValue());

        Function func = new Function();
        func.putPrice(menu[4], quantity + 1);
        func.updateOrder(1,func.getSumPrice(1));
        
        Maindish md = new Maindish(username);
        this.setVisible(false);
        md.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       AllOrder al = new AllOrder(username);
        this.setVisible(false);
        al.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Maindish.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Maindish.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Maindish.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Maindish.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Maindish().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background1;
    private javax.swing.JButton Dessert;
    private javax.swing.JButton Drink;
    private javax.swing.JButton Homepage;
    private javax.swing.JLabel ImageS;
    private javax.swing.JButton Mandish;
    private javax.swing.JLabel MenuID1;
    private javax.swing.JList<String> Menuall;
    private javax.swing.JButton SignOut;
    private javax.swing.JLabel Total;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel pic1;
    // End of variables declaration//GEN-END:variables
}
