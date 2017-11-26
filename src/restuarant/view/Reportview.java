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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import restuarant.controller.ConnectionBuilder;

public class Reportview extends javax.swing.JFrame {

    /**
     * Creates new form Welcome
     */
    private int username = -1;

    public Reportview() {
        initComponents();
    }

    public Reportview(int user) {
        initComponents();
        username = user;
    }

    public void showuser() {
        Statement s = null;
        try {
            UserTable.setModel(new DefaultTableModel());
            DefaultTableModel model = (DefaultTableModel) UserTable.getModel();
            model.addColumn("UserID");
            model.addColumn("UserName");
            model.addColumn("Password");
            model.addColumn("Firstname");
            model.addColumn("LastName");
            model.addColumn("Tel");
            model.addColumn("Email");
            model.addColumn("Address");
            model.addColumn("RoleName");

            Connection con = ConnectionBuilder.getConnection();
//            String sql = "select r.roomId,r.floor,rt.bedrooms,rt.bathrooms,rt.size,rt.pricePerMonth,"
//                    + "rt.deposit from Room r join RoomType rt on r.typeId=rt.typeId "
//                    + "order by r.roomId";
            String sql = "select u.User_ID,u.UserName,u.Password,u.FirstName,u.LastName,u.Tel,u.Email,u.Address,r.RoleName "
                    + "From User u join Role r on u.Role_RoleID = r.RoleID "
                    + "order by u.User_ID";
            s = con.createStatement();
            ResultSet rs = s.executeQuery(sql);
            int row = 0;
            while (rs != null && rs.next()) {
                model.addRow(new Object[0]);
                model.setValueAt(rs.getString("u.User_ID"), row, 0);
                model.setValueAt(rs.getString("u.UserName"), row, 1);
                model.setValueAt(rs.getString("u.Password"), row, 2);
                model.setValueAt(rs.getString("u.FirstName"), row, 3);
                model.setValueAt(rs.getString("u.LastName"), row, 4);
                model.setValueAt(rs.getString("u.Tel"), row, 5);
                model.setValueAt(rs.getString("u.Email"), row, 6);
                model.setValueAt(rs.getString("u.Address"), row, 7);
                model.setValueAt(rs.getString("r.RoleName"), row, 8);

                row++;
            }
            rs.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void showMenu() {
        Statement s = null;
        try {
            UserTable.setModel(new DefaultTableModel());
            DefaultTableModel model = (DefaultTableModel) UserTable.getModel();
            model.addColumn("MenuID");
            model.addColumn("MenuName");
            model.addColumn("MenuDescription");
            model.addColumn("MenuPrice");
            model.addColumn("MenuStatus");
            model.addColumn("MenuType");

            Connection con = ConnectionBuilder.getConnection();
            String sql = "select m.Menu_ID,m.Menu_Name,m.Menu_Description,m.Menu_Price,s.Status_Name,t.Type_Name "
                    + "From Menu m join Menu_Status s on m.Menu_Status_Status_ID=s.Status_ID join Menu_Type t on m.Menu_Type_Type_ID = t.Type_ID "
                    + "order by m.Menu_ID";
            s = con.createStatement();
            ResultSet rs = s.executeQuery(sql);
            int row = 0;
            while (rs != null && rs.next()) {
                model.addRow(new Object[0]);
                model.setValueAt(rs.getString("m.Menu_ID"), row, 0);
                model.setValueAt(rs.getString("m.Menu_Name"), row, 1);
                model.setValueAt(rs.getString("m.Menu_Description"), row, 2);
                model.setValueAt(rs.getString("m.Menu_Price"), row, 3);
                model.setValueAt(rs.getString("s.Status_Name"), row, 4);
                model.setValueAt(rs.getString("t.Type_Name"), row, 5);

                row++;
            }
            rs.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void showFeedBack() {
        Statement s = null;
        try {
            UserTable.setModel(new DefaultTableModel());
            DefaultTableModel model = (DefaultTableModel) UserTable.getModel();
            model.addColumn("FeedBackID");
            model.addColumn("FeedBackDetail");
            model.addColumn("UserID");
            model.addColumn("FirstName");
            model.addColumn("LastName");
            model.addColumn("Tel");

            Connection con = ConnectionBuilder.getConnection();
            String sql = "select f.FeedBack_ID,f.FeedBack_Detail,u.User_ID,u.FirstName,u.LastName,u.Tel "
                    + "From FeedBack f join User u on f.User_UserID = u.User_ID "
                    + "order by u.User_ID";
            s = con.createStatement();
            ResultSet rs = s.executeQuery(sql);
            int row = 0;
            while (rs != null && rs.next()) {
                model.addRow(new Object[0]);
                model.setValueAt(rs.getString("f.FeedBack_ID"), row, 0);
                model.setValueAt(rs.getString("f.FeedBack_Detail"), row, 1);
                model.setValueAt(rs.getString("u.User_ID"), row, 2);
                model.setValueAt(rs.getString("u.FirstName"), row, 3);
                model.setValueAt(rs.getString("u.LastName"), row, 4);
                model.setValueAt(rs.getString("u.Tel"), row, 5);

                row++;
            }
            rs.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void showpro() {
        Statement s = null;
        try {
            UserTable.setModel(new DefaultTableModel());
            DefaultTableModel model = (DefaultTableModel) UserTable.getModel();
            model.addColumn("PromotionID");
            model.addColumn("ProDiscount");

            Connection con = ConnectionBuilder.getConnection();
            String sql = "select PromotionID,Discount From Promotion order by PromotionID";
            s = con.createStatement();
            ResultSet rs = s.executeQuery(sql);
            int row = 0;
            while (rs != null && rs.next()) {
                model.addRow(new Object[0]);
                model.setValueAt(rs.getString("PromotionID"), row, 0);
                model.setValueAt(rs.getString("Discount"), row, 1);

                row++;
            }
            rs.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void showOrder() {
        Statement s = null;
        try {
            UserTable.setModel(new DefaultTableModel());
            DefaultTableModel model = (DefaultTableModel) UserTable.getModel();
            model.addColumn("UserID");
            model.addColumn("FirstName");
            model.addColumn("Tel");
            model.addColumn("MenuID");
            model.addColumn("MenuName");
            model.addColumn("Price");
            model.addColumn("Quantity");
            model.addColumn("Date");
            model.addColumn("TotalPrice");

            Connection con = ConnectionBuilder.getConnection();
            String sql = "select u.User_ID,u.FirstName,u.Tel,m.Menu_ID,m.Menu_Name,m.Menu_Price,d.Quantity,o.TotalPrice,o.Order_Date "
                    + "from User u join Orders o on u.User_ID = o.User_UserID "
                    + "join MenuDetail d on o.Order_ID = d.Orders_OrderID join Menu m on d.Menu_MenuID = m.Menu_ID order by u.User_ID";
            s = con.createStatement();
            ResultSet rs = s.executeQuery(sql);
            int row = 0;
            while (rs != null && rs.next()) {
                model.addRow(new Object[0]);
                model.setValueAt(rs.getString("u.User_ID"), row, 0);
                model.setValueAt(rs.getString("u.FirstName"), row, 1);
                model.setValueAt(rs.getString("u.Tel"), row, 2);
                model.setValueAt(rs.getString("m.Menu_ID"), row, 3);
                model.setValueAt(rs.getString("m.Menu_Name"), row, 4);
                model.setValueAt(rs.getString("m.Menu_Price"), row, 5);
                model.setValueAt(rs.getString("d.Quantity"), row,6);
                model.setValueAt(rs.getString("o.Order_Date"), row, 7);
                model.setValueAt(rs.getString("o.TotalPrice"), row, 8);

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

        Welcome = new javax.swing.JLabel();
        Report = new javax.swing.JButton();
        Menu = new javax.swing.JButton();
        Promotion = new javax.swing.JButton();
        FeedBack = new javax.swing.JButton();
        Signout = new javax.swing.JButton();
        Orders = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        UserTable = new javax.swing.JTable();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sum-jang Restaurant");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("spoon-and-fork-crossed_318-33017.jpg")));
        setSize(new java.awt.Dimension(1220, 1080));
        getContentPane().setLayout(null);

        Welcome.setFont(new java.awt.Font("Tw Cen MT Condensed", 3, 45)); // NOI18N
        Welcome.setForeground(new java.awt.Color(255, 255, 255));
        Welcome.setText("Welcome To Sum-jang Restaurant");
        getContentPane().add(Welcome);
        Welcome.setBounds(130, 40, 830, 140);

        Report.setText("User");
        Report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportActionPerformed(evt);
            }
        });
        getContentPane().add(Report);
        Report.setBounds(900, 250, 130, 40);

        Menu.setText("Menu");
        Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActionPerformed(evt);
            }
        });
        getContentPane().add(Menu);
        Menu.setBounds(910, 360, 120, 40);

        Promotion.setText("Promotion");
        Promotion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PromotionActionPerformed(evt);
            }
        });
        getContentPane().add(Promotion);
        Promotion.setBounds(910, 480, 130, 40);

        FeedBack.setText("FeedBack");
        FeedBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FeedBackActionPerformed(evt);
            }
        });
        getContentPane().add(FeedBack);
        FeedBack.setBounds(910, 580, 130, 40);

        Signout.setText("Signout");
        Signout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignoutActionPerformed(evt);
            }
        });
        getContentPane().add(Signout);
        Signout.setBounds(920, 190, 92, 29);

        Orders.setText("OrderAll");
        Orders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrdersActionPerformed(evt);
            }
        });
        getContentPane().add(Orders);
        Orders.setBounds(917, 680, 120, 40);

        UserTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(UserTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 240, 830, 460);

        background.setBackground(new java.awt.Color(255, 51, 51));
        background.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GuiImg/workWel.jpg"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, -210, 1220, 1170);

        setSize(new java.awt.Dimension(1096, 759));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportActionPerformed
        // TODO add your handling code here:
        showuser();
    }//GEN-LAST:event_ReportActionPerformed

    private void MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActionPerformed
        showMenu();
    }//GEN-LAST:event_MenuActionPerformed

    private void PromotionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PromotionActionPerformed
        showpro();
    }//GEN-LAST:event_PromotionActionPerformed

    private void SignoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignoutActionPerformed
        username = -1;

        Welcome wel = new Welcome();
        this.setVisible(false);
        wel.setVisible(true);
    }//GEN-LAST:event_SignoutActionPerformed

    private void FeedBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FeedBackActionPerformed
        showFeedBack();
    }//GEN-LAST:event_FeedBackActionPerformed

    private void OrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrdersActionPerformed
       showOrder();
    }//GEN-LAST:event_OrdersActionPerformed

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
            java.util.logging.Logger.getLogger(Reportview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reportview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reportview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reportview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Reportview myFrame2 = new Reportview();
                myFrame2.setExtendedState(MAXIMIZED_BOTH);
                myFrame2.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                new Reportview().setVisible(true);
            }
        });

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FeedBack;
    private javax.swing.JButton Menu;
    private javax.swing.JButton Orders;
    private javax.swing.JButton Promotion;
    private javax.swing.JButton Report;
    private javax.swing.JButton Signout;
    private javax.swing.JTable UserTable;
    private javax.swing.JLabel Welcome;
    private javax.swing.JLabel background;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
