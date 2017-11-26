/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restuarant.controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import restuarant.view.LogInForm;

/**
 *
 * @author taloey
 */
public class Function {

    private static String user_id;
    public static String name;
    private static String lastname;
    private static String tel;
    private static String email;
    private static String address;

    public boolean LoginRestuarant(String username, String password) {
        boolean status = false;
        String passworduser = null;
        try {
            Connection con = ConnectionBuilder.getConnection();
            String sql = "select * from User where Username = ?";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, username);
            ResultSet rs = pstm.executeQuery();

            if (rs.next()) {
                passworduser = rs.getString("Password");
            }
            if (password.equals(passworduser)) {
                status = true;
            }
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return status;
    }

    public boolean Register(String Username, String Password, String Firstname, String Lastname, String Tel, String Email, String Address) {
        boolean status = false;
        try {
            Connection con = ConnectionBuilder.getConnection();
            String sql = "Insert INTO User " + "(User_ID,Username,Password,Firstname,Lastname,Tel,Email,Address,Role_RoleID)"
                    + "Value (?,?,?,?,?,?,?,?,0)";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setInt(1, (getLastID() + 1));
            pstm.setString(2, Username);
            pstm.setString(3, Password);
            pstm.setString(4, Firstname);
            pstm.setString(5, Lastname);
            pstm.setString(6, Tel);
            pstm.setString(7, Email);
            pstm.setString(8, Address);

            int rs = pstm.executeUpdate();

            con.close();
        } catch (SQLException ex) {
            System.out.println("Fail");
        }
        return status;

    }

    public static int getLastID() {
        int lastID = 0;
        try {
            Connection con = ConnectionBuilder.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("Select User_ID From User order by User_ID DESC");
            if (rs.next()) {
                lastID = rs.getInt("User_ID");
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Function.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lastID;
    }

    public static void main(String[] args) {
        int test = getLastID();
        System.out.println(test);
    }

    public static ArrayList<String> getAllMaindish() {
        ArrayList<String> str = new ArrayList<>();
        try {
            Connection con = ConnectionBuilder.getConnection();
            Statement st = con.createStatement();
            String sql = "SELECT * FROM Menu WHERE Menu_Type_Type_ID = 1 order by Menu_Name ASC";
            ResultSet res = st.executeQuery(sql);
            while (res.next()) {
                str.add(res.getString("Menu_Name"));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
        return str;
    }

    public static ArrayList<String> getAllDessert() {
        ArrayList<String> str = new ArrayList<>();
        try {
            Connection con = ConnectionBuilder.getConnection();
            Statement st = con.createStatement();
            String sql = "SELECT * FROM Menu WHERE Menu_Type_Type_ID = 2 order by Menu_Name ASC";
            ResultSet res = st.executeQuery(sql);
            while (res.next()) {
                str.add(res.getString("Menu_Name"));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
        return str;
    }

    public static ArrayList<String> getAllDrink() {
        ArrayList<String> str = new ArrayList<>();
        try {
            Connection con = ConnectionBuilder.getConnection();
            Statement st = con.createStatement();
            String sql = "SELECT * FROM Menu WHERE Menu_Type_Type_ID = 3 order by Menu_Name ASC";
            ResultSet res = st.executeQuery(sql);
            while (res.next()) {
                str.add(res.getString("Menu_Name"));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
        return str;
    }

    public static String[] getMenu(String menuName) {
        String menu[] = new String[5];
        try {
            Connection con = ConnectionBuilder.getConnection();
            Statement st = con.createStatement();
            String sql = "SELECT * FROM Menu WHERE Menu_Name='" + menuName + "'";
//            System.out.println(sql);
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                menu[0] = rs.getString("Menu_Name");
                menu[1] = rs.getString("Menu_Img");
                menu[2] = rs.getString("Menu_Description");
                menu[3] = rs.getString("Menu_Price");
                menu[4] = rs.getString("Menu_ID");
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Function.class.getName()).log(Level.SEVERE, null, ex);
        }
        return menu;

    }

    public boolean putPrice(String MenuID, int Quantity) {
        boolean status = false;
        try {
            Connection con = ConnectionBuilder.getConnection();
            String sql = "INSERT INTO MenuDetail " + "(Menu_Detail_ID,Orders_OrderID,Menu_MenuID,Quantity)"
                    + "Values (?,1,?,?)";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setInt(1, getLastDetailID() + 1);
            pstm.setString(2, MenuID);
            pstm.setInt(3, Quantity);

            int rs = pstm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Function.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }

    public static int getLastDetailID() {
        int lastID = 0;
        try {
            Connection con = ConnectionBuilder.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("Select Menu_Detail_ID From MenuDetail order by Menu_Detail_ID DESC");
            if (rs.next()) {
                lastID = rs.getInt("Menu_Detail_ID");
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Function.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lastID;
    }

    public boolean updateOrders() {
        int Quan = 0;
        int pri = 0;
        try {
            Connection con = ConnectionBuilder.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("Select m.Menu_Price,d.Quantity From Menu m join MenuDetail d on m.Menu_ID = d.Menu_MenuID");
            if (rs.next()) {
                Quan = rs.getInt("d.Quantity");
                pri = rs.getInt("m.Menu_Price");
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Function.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static String getFirstName(int UserIDReal) {
        int id = LogInForm.UserIDReal;
        try {
            Connection con = ConnectionBuilder.getConnection();
            String sql = "SELECT * FROM User WHERE User_ID = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setInt(1, id);
            ResultSet rs = pre.executeQuery();
            if (rs.next()) {
                name = rs.getString("FirstName");
                //System.out.println(stdName);
            }
            con.close();
        } catch (SQLException e) {
            System.out.println(e + "\n" + e.getMessage());
            e.printStackTrace();
        }
        return name;
    }

    public static String getLastName(int UserIDReal) {
        int id = LogInForm.UserIDReal;
        try {
            Connection con = ConnectionBuilder.getConnection();
            String sql = "SELECT * FROM User WHERE User_ID = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setInt(1, id);
            ResultSet rs = pre.executeQuery();
            if (rs.next()) {
                lastname = rs.getString("LastName");
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Function.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lastname;
    }

    public static String getTel(int UserIDReal) {
        int id = LogInForm.UserIDReal;
        try {
            Connection con = ConnectionBuilder.getConnection();
            String sql = "SELECT * FROM User WHERE User_ID = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setInt(1, id);
            ResultSet rs = pre.executeQuery();
            if (rs.next()) {
                tel = rs.getString("Tel");
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Function.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tel;
    }

    public static String getemail(int UserIDReal) {
        int id = LogInForm.UserIDReal;
        try {
            Connection con = ConnectionBuilder.getConnection();
            String sql = "SELECT * FROM User WHERE User_ID = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setInt(1, id);
            ResultSet rs = pre.executeQuery();
            if (rs.next()) {
                email = rs.getString("Email");
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Function.class.getName()).log(Level.SEVERE, null, ex);
        }
        return email;
    }

    public static String getaddress(int UserIDReal) {
        int id = LogInForm.UserIDReal;
        try {
            Connection con = ConnectionBuilder.getConnection();
            String sql = "SELECT * FROM User WHERE User_ID = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setInt(1, id);
            ResultSet rs = pre.executeQuery();
            if (rs.next()) {
                address = rs.getString("Address");
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Function.class.getName()).log(Level.SEVERE, null, ex);
        }
        return address;
    }

    public boolean getFeedback(String Feed) {
        int id = LogInForm.UserIDReal;
        boolean status = false;
        try {
            Connection con = ConnectionBuilder.getConnection();
            String sql = "INSERT INTO FeedBack " + "(FeedBack_ID,FeedBack_Detail,User_UserID)"
                    + "Values (?,?,?)";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setInt(1, getLastFeedbackID() + 1);
            pstm.setString(2, Feed);
            pstm.setInt(3, id);

            int rs = pstm.executeUpdate();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Function.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }

    public static int getLastFeedbackID() {
        int lastID = 0;
        try {
            Connection con = ConnectionBuilder.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("Select FeedBack_ID From FeedBack order by FeedBack_ID DESC");
            if (rs.next()) {
                lastID = rs.getInt("FeedBack_ID");
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Function.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lastID;
    }

    public boolean getOrder(String orderid, Date date, Double total, int pro) {
        int id = LogInForm.UserIDReal;
        boolean status = false;
        try {

            Connection con = ConnectionBuilder.getConnection();
            String sql = "INSERT INTO Orders " + ("(Order_ID,Order_Date,TotalPrice,User_UserID,Promotion_Promotion)"
                    + "Values (?,?,?,?,?");
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, orderid);
            pstm.setDate(2, date);
            pstm.setDouble(3, total);
            pstm.setInt(4, id);
            pstm.setInt(5, pro);

            int rs = pstm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Function.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }
    
//
}
