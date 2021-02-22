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
import java.util.ArrayList;
import java.util.logging.Level;
import logica.DTO.PlatoDTO;
import persistencia.conexion;

/**
 *
 * @author bastian
 */
public class PlatoDAO {
    
    private static final conexion cnn = conexion.getInstance();
    private static final String SQL_REGION = "select plato.nombre from plato, region where region.codigo = cod_region_fk and region.nombre = ?";
       
    public ArrayList<PlatoDTO> consultarRegion(String region){
        ArrayList<PlatoDTO> lista = new ArrayList<PlatoDTO>();
        PlatoDTO objP = null;
        PreparedStatement psnt;
        try{
            psnt = cnn.getCnn().prepareStatement(SQL_REGION);
            psnt.setString(1, region);
            ResultSet rs = psnt.executeQuery();
            while(rs.next()){
                objP = new PlatoDTO();
                objP.setNombre(rs.getString("nombre"));
                lista.add(objP);
            }
        }catch(SQLException ex){
            Logger.getLogger(PlatoDAO.class.getClass()).log(Level.SEVERE, null, ex);
        }finally{
            cnn.cerrarConexion();
        }
        return lista;
    }
}
