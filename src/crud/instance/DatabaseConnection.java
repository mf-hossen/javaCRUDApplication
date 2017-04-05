
package crud.instance;

import java.sql.Connection;
import java.sql.DriverManager;


public class DatabaseConnection {
    
    private Connection con;
    private static DatabaseConnection dbc;
    
    private DatabaseConnection(){
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded");
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaCRUD", "root", "mf2312");
            System.out.println("Connected success!!!");
        } catch (Exception ex) {
            
            System.out.println(ex);
        }
    }
    
    
    public static DatabaseConnection getDatabaseConnection(){
        
        if(dbc == null){
            dbc = new DatabaseConnection();
        }
        
        return dbc;
    }
    
   public Connection getConnection(){
       
       return con;
   }
}
