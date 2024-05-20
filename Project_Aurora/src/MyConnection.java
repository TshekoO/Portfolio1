import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class MyConnection {
    Connection con = null;
  static final String DB_URL = "jdbc:mysql://localhost/project";
    static final String USER = "root";
    static final String PASS = "";
  
   public static Connection mycon() {
   

Connection con = null;
  
        try{

            //register jdbc,  not required for newer versions of jdk

            Class.forName("com.mysql.cj.jdbc.Driver");

            //open a connection

            con = DriverManager.getConnection(DB_URL,USER,PASS);

            return con;
         

        }

        catch(ClassNotFoundException | SQLException ex){

            System.out.println("There were errors while connecting to db");

            return null;

        }
   }

   
}

