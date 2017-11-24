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
public class Login {

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
            if(password.equals(passworduser)){
                status= true;
            }
            con.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return status;
    }
}
