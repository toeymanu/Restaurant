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
                    + "Value (3,?,?,?,?,?,?,?,0)";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, Username);
            pstm.setString(2, Password);
            pstm.setString(3, Firstname);
            pstm.setString(4, Lastname);
            pstm.setString(5, Tel);
            pstm.setString(6, Email);
            pstm.setString(7, Address);

            int rs = pstm.executeUpdate();

            con.close();
        } catch (SQLException ex) {
            System.out.println("Fail");;
        }
        return status;

    }
}
