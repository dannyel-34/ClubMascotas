/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaqueteConexion;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.exceptions.MySQLDataException;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author DANIEL
 */

public class DBConexion {
   
    
    public String db = "dbMascotas";
    public String host = "jdbc:mysql://localhost:3306/";
    public String user = "root";
    public String pass = "";

    String url = host + db + "?user=" + user + "&password="+pass;
    
    public Connection Conectar(){
       Connection link = null;
       
       try{
           Class.forName("com.mysql.jdbc.Driver");
           
           Connection conn = (Connection) DriverManager.getConnection(url);
           conn.close();
       }catch(ClassNotFoundException e){
           System.out.println("De de conexion");
       }catch(SQLException e){
           System.out.println("Error SQL");
       }          
       return link;
   }     
}
