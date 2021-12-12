

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ALPHA
 */
public class Database {
    
    public static Connection mysqlconfig;
    public static Connection configDB(){
        try{
            String url = "jdbc:mysql://localhost:3306/e_mart_database";
            String user = "root";
            String pass = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Gagal Koneksi KeServer ! , ERR : " + e.getMessage() , "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        
        return mysqlconfig;
    }
            
}
