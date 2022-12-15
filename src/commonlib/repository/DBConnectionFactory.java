/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commonlib.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Lenovo
 */
public class DBConnectionFactory {
    
    private static DBConnectionFactory instance;
    private Connection conn;
    
    private DBConnectionFactory(){
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/dog_grooming_salon_app", "root", "");
        } catch (SQLException ex) {
            Logger.getLogger(DBConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Connection getConnection(){
        return conn;
    }
    
    public static DBConnectionFactory getInstance() throws SQLException{
        if(instance == null)
            instance = new DBConnectionFactory();
        return instance;
    }
    
}
