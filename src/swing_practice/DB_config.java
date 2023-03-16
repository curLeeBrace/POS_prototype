/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing_practice;

/**
 *
 * @author Boruto
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


/**
 * You can easily Execute Query and see the resultSet, But first declare or make 
 * your connection to your database server
 * @author Boruto
 */
public class DB_config
{
    
    /**
     * Result of a query
     * 
     */
    public ResultSet rs = null;
    /**
     * Connection to the database server
     *
     */
    public Connection conn = null;
    
    
    public static String url = "";
    public static String user = "";
    public static String pass = "";
    

    public DB_config(String Query)
    {

        try 
        {
            conn = DriverManager.getConnection(url,user,pass);
            Statement stmt = conn.createStatement();
            
            this.rs = stmt.executeQuery(Query);
           
            
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, e, "WARNING!", 2);
        }
        
    
        
    }
    
  
}
