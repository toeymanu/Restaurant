/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restuarant.controller;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author taloey
 */
public class ConnectionBuilder {

    public static Connection getConnection() {
        Connection con = null;
        String db_name = "toey";
        String user = "toey";
        String pass = "toey";
//        String user = "int203";
//        String pass = "int203;";
//nfiosdfiosdjfipasjdopsajdosajdpsajdasjdopasdjpoasdj
        String hostName = "db.int203.phornlert.me:3306";
        String driverName = "com.mysql.jdbc.Driver";
        try {
            Class.forName(driverName);
            System.out.println("test");
            String url = "jdbc:mysql://" + hostName + "/" + db_name + "?characterEncoding=UTF-8";
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Driver Connect");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
        return con;

    }

    public static void main(String[] args) {
        Connection con = ConnectionBuilder.getConnection();
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionBuilder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
