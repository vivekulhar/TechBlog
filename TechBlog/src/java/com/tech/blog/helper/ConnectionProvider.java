
package com.tech.blog.helper;
import java.sql.*;

public class ConnectionProvider {
    
    private static Connection con;
    public static Connection getConnection()
    {
        try
        {
            //driver class load
            
            if(con==null){
                Class.forName("com.mysql.jdbc.Driver");
            
                //create a connection..
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techblog","root","@noth3rOnebites");

            }
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return con;
    }
}
