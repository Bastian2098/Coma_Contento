/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.DAO;

import com.sun.istack.internal.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import logica.DTO.EncargadoDTO;
import persistencia.conexion;

/**
 *
 * @author bastian
 */
public class EncargadoDAO {
    
    private static final String SQL_LOGIN = "select encargado.codigo, encargado.nombre, encargado.clave, encargado.telefono from encargado, enc_reg, region where encargado.codigo = cod_encargado_fk and cod_region_fk = region.codigo and region.nombre = ? and encargado.clave = ?";
    private static final conexion cnn = conexion.getInstance();
    
    public EncargadoDTO autenticar(EncargadoDTO filtro){
        EncargadoDTO objE = null;
        PreparedStatement psnt;
        try{
            psnt = cnn.getCnn().prepareStatement(SQL_LOGIN);
            //psnt.setString(1, filtro.getNombre());
            psnt.setString(1, filtro.getRegion());
            psnt.setString(2, filtro.getClave());
            ResultSet rs = psnt.executeQuery();
            while(rs.next()){
                objE = new EncargadoDTO();
                objE.setCodigo(rs.getInt("codigo"));
                objE.setNombre(rs.getString("nombre"));
                objE.setClave(rs.getString("clave"));
                objE.setTelefono(rs.getString("telefono"));
                System.out.println("DAO: "+objE.getNombre());
            }
        }catch(SQLException ex){
            Logger.getLogger(EncargadoDAO.class.getClass()).log(Level.SEVERE, null, ex);
        }finally{
            cnn.cerrarConexion();
        }
        return objE;
    }
    
    
}
