/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otros;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author DANIEL 
 * 
 */

public class Conectado_db {
    
    /*
    El nombre de la base  de datos
    */
    public String db = "bdnomina.sqlite";
    
    /*
    Carga el driver de la base de datos
    */
    public String url = "jdbc:sqlite:"+db;
    
    /*
    usuario de la base  de datos
    */
    public String user = "root";
    
    /*
    la contraseña de la base de datos
    */
    public String password = "Admin123";
    
    /*
    define el contructor de la clase principal
    */
    public Connection Conectar(){

       Connection link = null;
      
    
       try{
           Class.forName("org.sqlite.JDBC");
           link = DriverManager.getConnection(this.url, this.user, this.password);
           
    
       }catch(Exception ex){
           JOptionPane.showMessageDialog(null, ex);
       }
       
       /*
       retorna el link 
       */
               
       return link;

   }
    
}
  