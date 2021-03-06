/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restuarant.view;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import restuarant.controller.ConnectionBuilder;

/**
 *
 * @author taloey
 */
public class AllOrder extends javax.swing.JFrame {

    /**
     * Creates new form AllOrder
     */
    private int username = -1;
    public AllOrder() {
        initComponents();
    }
     public AllOrder(int user) {
        username = user;
        initComponents();
    }

    public void allDetail(){
        Statement s = null;
        try {
            Orderdetail.setModel(new DefaultTableModel());
            DefaultTableModel model = (DefaultTableModel) Orderdetail.getModel();
            model.addColumn("UserID");
            model.addColumn("FirstName");
            model.addColumn("MenuName");
            model.addColumn("MenuPrice");
            model.addColumn("Quantity");
            model.addColumn("Total");

            Connection con = ConnectionBuilder.getConnection();
            String sql = "select o.Totalprice,u.User_ID,u.FirstName,d.Quantity,m.Menu_Name,m.Menu_Price From Orders o join User u on o.User_UserID = u.User_ID "
                    + "join MenuDetail d on o.Order_ID = d.Orders_OrderID join Menu m on d.Menu_MenuID = m.Menu_ID WHERE u.User_ID = 1";
            s = con.createStatement();
            ResultSet rs = s.executeQuery(sql);
            int row = 0;
            while (rs != null && rs.next()) {
                model.addRow(new Object[0]);
                model.setValueAt(rs.getString("u.User_ID"), row, 0);
                model.setValueAt(rs.getString("u.FirstName"), row, 1);
                model.setValueAt(rs.getString("m.Menu_Name"), row, 2);
                model.setValueAt(rs.getString("m.Menu_Price"), row, 3);
                model.setValueAt(rs.getString("d.Quantity"), row, 4);
                model.setValueAt(rs.getString("o.Totalprice"), row, 5);
            

                row++;
            }
            rs.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Orderdetail = new javax.swing.JTable();
        CheckDetail = new javax.swing.JButton();
        Signout = new javax.swing.JButton();
        Homepage = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1080, 720));
        getContentPane().setLayout(null);

        Orderdetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Orderdetail);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 210, 810, 490);

        CheckDetail.setText("Detail");
        CheckDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckDetailActionPerformed(evt);
            }
        });
        getContentPane().add(CheckDetail);
        CheckDetail.setBounds(900, 210, 81, 29);

        Signout.setText("Signout");
        Signout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignoutActionPerformed(evt);
            }
        });
        getContentPane().add(Signout);
        Signout.setBounds(890, 170, 92, 29);

        Homepage.setText("Homepage");
        Homepage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomepageActionPerformed(evt);
            }
        });
        getContentPane().add(Homepage);
        Homepage.setBounds(30, 170, 111, 29);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GuiImg/workWel.jpg"))); // NOI18N
        Background.setText("jLabel1");
        getContentPane().add(Background);
        Background.setBounds(0, 0, 1080, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CheckDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckDetailActionPerformed
        allDetail();
    }//GEN-LAST:event_CheckDetailActionPerformed

    private void SignoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignoutActionPerformed
        username = -1;
        
        Welcome wel = new Welcome();
        this.setVisible(false);
        wel.setVisible(true);
    }//GEN-LAST:event_SignoutActionPerformed

    private void HomepageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomepageActionPerformed
        Welcomeuser user = new Welcomeuser(username);
        this.setVisible(false);
        user.setVisible(true);
    }//GEN-LAST:event_HomepageActionPerformed

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
            java.util.logging.Logger.getLogger(AllOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AllOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AllOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AllOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AllOrder().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton CheckDetail;
    private javax.swing.JButton Homepage;
    private javax.swing.JTable Orderdetail;
    private javax.swing.JButton Signout;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
