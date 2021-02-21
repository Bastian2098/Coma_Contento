package persistencia;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class conexion {

    public static conexion instance;
    private Connection cnn;

    private conexion() {
        try {
            Class.forName("org.postgresql.Driver");
            try {
                cnn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bd_coma_contento", "bastian", "980220");
            } catch (SQLException ex) {
                Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public static synchronized conexion getInstance(){
        if(instance == null){
            instance = new conexion();
        }
        return instance;
    }
    
    public Connection getCnn(){
        return cnn;
    }
    
    public void cerrarConexion(){
        instance = null;
    }
}
