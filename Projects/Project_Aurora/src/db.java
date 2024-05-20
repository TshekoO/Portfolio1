/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
/**
 *
 * @author Admin
 */
public class db {
  public static Connection mycon() {
      Connection con = null;
      
      try{
          
         Class.forName("com.mysql.jdbc.Driver");
         con = DriverManager.getConnection("jdbc:mysql:http://localhost/login","root","");
      }catch(ClassNotFoundException e){
          System.out.println(e);
      }
      return con;
  } 
  
}
