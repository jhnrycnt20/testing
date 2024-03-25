/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author SCC
 */
public class dbConnector {
    private Connection connect;
    public dbConnector() {
    
        try{
        connect = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/testing","root","");
        
    }catch(SQLException e){
                System.out.println("cant connect to database:"+e.getMessage());
                
    }
}
    
    public ResultSet getData(String sql) throws SQLException{
        Statement st = connect.createStatement();
        ResultSet rs = st.executeQuery(sql);
        return rs;
    }
    
}