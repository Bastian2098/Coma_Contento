/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;
import logica.DAO.EncargadoDAO;
import logica.DAO.PlatoDAO;
import logica.DTO.EncargadoDTO;
import logica.DTO.PlatoDTO;
import vista.index;
import vista.login;

/**
 *
 * @author bastian
 */
public class Control implements ActionListener{
    
    login view;
    index inicio;
    
    public Control(){
        view = new login();
        inicio = new index();
        this.view.getjButton1().addActionListener(this);
    }
    
    public void iniciar(){
        view.setVisible(true);
    }
    
    public EncargadoDTO autenticar(EncargadoDTO item){
        EncargadoDTO objE;
        EncargadoDAO objDao = new EncargadoDAO ();
        objE = objDao.autenticar(item);
        return objE;
    }
    
    public ArrayList<PlatoDTO> consultarRegion(String region){
        ArrayList<PlatoDTO> result = new ArrayList<PlatoDTO>();
        PlatoDAO objDao = new PlatoDAO();
        result = objDao.consultarRegion(region);
        return result;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(view.getjButton1() == ae.getSource()){
            EncargadoDTO obj = new EncargadoDTO();
            obj.setRegion(view.getjComboBox1().getSelectedItem().toString());
            obj.setClave(view.getjPasswordField1().getText());
            System.out.println(view.getjComboBox1().getSelectedItem().toString());
            if(autenticar(obj) != null){
                System.out.println("Logeado");
                view.setVisible(false);
                ArrayList<PlatoDTO> objP = consultarRegion("Andina");
                for(PlatoDTO plato: objP){
                    DefaultMutableTreeNode nodo = new DefaultMutableTreeNode();
                    nodo.setUserObject(plato);
                    inicio.getPanel3().getNodoAndina().add(nodo);
                }
                objP = consultarRegion("Caribe");
                for(PlatoDTO plato: objP){
                    DefaultMutableTreeNode nodo = new DefaultMutableTreeNode();
                    nodo.setUserObject(plato);
                    inicio.getPanel3().getNodoCaribe().add(nodo);
                }
                objP = consultarRegion("Insular");
                for(PlatoDTO plato: objP){
                    DefaultMutableTreeNode nodo = new DefaultMutableTreeNode();
                    nodo.setUserObject(plato);
                    inicio.getPanel3().getNodoInsular().add(nodo);
                }
                inicio.setVisible(true);
            }else{
                System.out.println("Paila");
            }
        }
    }
}
