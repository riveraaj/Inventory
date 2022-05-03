package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Jonathan Rivera
 */

public class Conexion {

    public Connection con;
    
    //En este metodo se realiza la conexion con el servidor
    public void getConexion(){
        
        String ConxionUrl = "jdbc:sqlserver://YARVIS:1433;"
            + "database=Proyecto;"
            + "user=Messias;"
            + "password=11724;"
            + "loginTimeout=10;";
        try {
            con = DriverManager.getConnection(ConxionUrl);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }                  
    }    
} 
