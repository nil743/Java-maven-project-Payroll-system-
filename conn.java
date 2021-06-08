package payroll;

import java.sql.*;

public class conn {
    
    public static Connection c;
    public static Statement s;
 
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql:///payroll","root","1234");
            s = c.createStatement();
            
        
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}