/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restuarant.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author taloey
 */
public class Function {

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
        String menu[] = new String[3];
        try {
            Connection con = ConnectionBuilder.getConnection();
            Statement st = con.createStatement();
            String sql = "SELECT * FROM Menu WHERE Menu_Name='" + menuName + "'";
            System.out.println(sql);
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                menu[0] = rs.getString("Menu_Name");
                menu[1] = rs.getString("Menu_Img");
                menu[2] = rs.getString("Menu_Description");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Function.class.getName()).log(Level.SEVERE, null, ex);
        }
        return menu;

    }
}
