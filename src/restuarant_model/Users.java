/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restuarant_model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import restuarant.controller.ConnectionBuilder;

/**
 *
 * @author taloey
 */
public class Users {
    static Connection con = ConnectionBuilder.getConnection();
    private static long std_id;
    private static String std_name;
    private static String std_faculty;
    private static String std_department;
    private static String std_major;
    private static String std_tel;
    private static String std_facebook;
    private static String std_medicine;
    private static String std_food;
    private static String std_email;
    private static String std_pic;
    //private bla bla std_picture;
    private static String std_role;
    private static java.util.Date created_at;
    private static java.util.Date updated_at;

    public static long getStd_id(long stdUsername) {
        std_id = stdUsername;        
        try {
            String sql = "SELECT std_id FROM students WHERE std_id = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setLong(1, std_id);
            ResultSet rs = pre.executeQuery();
            if(rs.next()) {
                std_id = rs.getLong("std_id");
            }
        } 
        catch (SQLException e) {
            System.out.println(e + "\n" + e.getMessage());
            e.printStackTrace();
        }
        
        return std_id;
    }

    public static String getStd_name() {
        try {
            String sql = "SELECT * FROM User std_name = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setLong(1, std_id);
            ResultSet rs = pre.executeQuery();
            if(rs.next()) {
                std_name = rs.getString("std_name");
                //System.out.println(stdName);
            }
        } 
        catch (SQLException e) {
            System.out.println(e + "\n" + e.getMessage());
            e.printStackTrace();
        }
        return std_name;
    }

     /*public static String getStd_surname(long std_id) {
            try {
            String sql = "SELECT * FROM students WHERE std_id = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setLong(1, std_id);
            ResultSet rs = pre.executeQuery();
            if(rs.next()) {
                std_surname = rs.getString("std_surname");
                //System.out.println(stdPic);
            }
        } 
        catch (SQLException e) {
            System.out.println(e + "\n" + e.getMessage());
            e.printStackTrace();
        }
        return std_surname;
    }*/
    public static String getStd_faculty(long std_id) {
         try {
            String sql = "SELECT * FROM students WHERE std_id = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setLong(1, std_id);
            ResultSet rs = pre.executeQuery();
            if(rs.next()) {
                std_faculty = rs.getString("std_faculty");
                //System.out.println(stdFaculty);
            }
        } 
        catch (SQLException e) {
            System.out.println(e + "\n" + e.getMessage());
            e.printStackTrace();
        }
        return std_faculty;
    }

    public static String getStd_department() {
        return std_department;
    }

    public static String getStd_major() {
        return std_major;
    }

    public static String getStd_tel(long std_id) {
        try {
            String sql = "SELECT * FROM students WHERE std_id = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setLong(1, std_id);
            ResultSet rs = pre.executeQuery();
            if(rs.next()) {
                std_tel = rs.getString("std_tel");
                //System.out.println(stdTel);
            }
        } 
        catch (SQLException e) {
            System.out.println(e + "\n" + e.getMessage());
            e.printStackTrace();
        }
        return std_tel;
    }

    public static String getStd_facebook(long std_id) {
        try {
            String sql = "SELECT * FROM students WHERE std_id = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setLong(1, std_id);
            ResultSet rs = pre.executeQuery();
            if(rs.next()) {
                std_facebook = rs.getString("std_facebook");
                //System.out.println(stdFacebook);
            }
        } 
        catch (SQLException e) {
            System.out.println(e + "\n" + e.getMessage());
            e.printStackTrace();
        }
        return std_facebook;
    }

    public static String getStd_medicine(long std_id) {
        try {
            String sql = "SELECT * FROM students WHERE std_id = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setLong(1, std_id);
            ResultSet rs = pre.executeQuery();
            if(rs.next()) {
                std_medicine = rs.getString("std_medicine");
                //System.out.println(stdMedicine);
            }
        } 
        catch (SQLException e) {
            System.out.println(e + "\n" + e.getMessage());
            e.printStackTrace();
        }
        return std_medicine;
    }

    public static String getStd_food(long std_id) {
        try {
            String sql = "SELECT * FROM students WHERE std_id = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setLong(1, std_id);
            ResultSet rs = pre.executeQuery();
            if(rs.next()) {
                std_food = rs.getString("std_food");
                //System.out.println(stdFood);
            }
        } 
        catch (SQLException e) {
            System.out.println(e + "\n" + e.getMessage());
            e.printStackTrace();
        }
        return std_food;
    }

    public static String getStd_email(long std_id) {
        try {
            String sql = "SELECT * FROM students WHERE std_id = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setLong(1, std_id);
            ResultSet rs = pre.executeQuery();
            if(rs.next()) {
                std_email = rs.getString("std_email");
                //System.out.println(stdEmail);
            }
        } 
        catch (SQLException e) {
            System.out.println(e + "\n" + e.getMessage());
            e.printStackTrace();
        }
        return std_email;
    }

    public static String getStd_pic(long std_id) {
        try {
            String sql = "SELECT * FROM students WHERE std_id = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setLong(1, std_id);
            ResultSet rs = pre.executeQuery();
            if(rs.next()) {
                std_pic = rs.getString("std_picture");
                
                //System.out.println(stdPic);
            }
        } 
        catch (SQLException e) {
            System.out.println(e + "\n" + e.getMessage());
            e.printStackTrace();
        }
        return std_pic;
    }
}
    