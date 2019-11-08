
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    //Incorporar libreria SQL
    private static String driver = "";
    //Nombre de la base de datos
    private static String database = "";
    //Servidor
    private static String hostname = "";
    //Puerto
    private static String port = "";
    //Usuario
    private static String username = "";
    //Url de conexion a la base de datos
    private static String connectionURL;
    //Conector
    public static Connection conn;
    
    public Conexion(){
        this.connectionURL = "jdbc:mysql://"+hostname+ ":" +port+ "/" + database;
        this.getconnection();
    }
    
    public static Connection getconnection(){
        try {
            Class.forName(driver);
            try {
            conn = DriverManager.getConnection(connectionURL);
            } catch(SQLException ex){
            System.out.println("Error al crear conector: "+ ex.getMessage());
            }
    } catch(ClassNotFoundException ex) {
    
    }
    return conn;
}
    
}
