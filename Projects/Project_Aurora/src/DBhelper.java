import java.sql.*;
import java.beans.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class DBhelper {
   public static Statement st;
   public static Connection conn;
   public static PreparedStatement getData;
   static{
      
       try {
           String url = "jdbc:mysql://localhost/project";
           Class.forName("com.mysql.cj.jdbc.Driver");
           conn = DriverManager.getConnection(url,"root","");
           
           st =(Statement) conn.createStatement();
        
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(DBhelper.class.getName()).log(Level.SEVERE, null, ex);
       } catch (SQLException ex) {
           Logger.getLogger(DBhelper.class.getName()).log(Level.SEVERE, null, ex);
       }
   }

}
