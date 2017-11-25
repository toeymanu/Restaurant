/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restuarant_model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import restuarant.controller.ConnectionBuilder;

/**
 *
 * @author taloey
 */
public class PictureDB {

    static Connection con = ConnectionBuilder.getConnection();
    private static int MenuId;
    private static String MenuName;
    private static String MenuDescription;
    private static String MenuImg;

    public static int getMenu_ID(int MenuIndex) {

        MenuId = MenuIndex;
        try {
            String sql = "Select * From Menu where Menu_ID = ?";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setInt(1, MenuIndex);
            ResultSet rs = pstm.executeQuery();
            if(rs.next()){
                MenuId = rs.getInt("Menu_ID");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());;
        }
        System.out.println(MenuId);
        return MenuId;
    }

     public static String getMenu_Name(int MenuId) {
        try {
            String sql = "Select * From Menu where Menu_ID = ?";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setInt(1, MenuId);
            ResultSet rs = pstm.executeQuery();
            if(rs.next()){
                MenuName = rs.getString("Menu_Name");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());;
        }
        System.out.println(MenuName);
        return MenuName;
    } 
//    public static String getClub_pic(int club_id) {       
//        try {
//            String sql = "SELECT * FROM clubs WHERE club_id = ?";
//            PreparedStatement pre = con.prepareStatement(sql);
//            pre.setInt(1, club_id);
//            ResultSet rs = pre.executeQuery();
//            if(rs.next()) {
//                club_picture = rs.getString("club_picture");
//            }
//        } 
//        catch (SQLException e) {
//            System.out.println(e + "\n" + e.getMessage());
//            e.printStackTrace();
//        }
//        return club_picture;  
//    }
// 
//
//    
//    public static String getClub_description(int club_id) {       
//        try {
//            String sql = "SELECT * FROM clubs WHERE club_id = ?";
//            PreparedStatement pre = con.prepareStatement(sql);
//            pre.setInt(1, club_id);
//            ResultSet rs = pre.executeQuery();
//            if(rs.next()) {
//                club_name = rs.getString("club_description");
//            }
//        } 
//        catch (SQLException e) {
//            System.out.println(e + "\n" + e.getMessage());
//            e.printStackTrace();
//        }
//        return club_name;  
//    }
//}
     public static void main(String[] args) {
        PictureDB.getMenu_ID(1);
        PictureDB.getMenu_Name(1);
    }
}
