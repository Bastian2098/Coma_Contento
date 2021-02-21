/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.DTO;

/**
 *
 * @author bastian
 */
public class EncargadoDTO {
    
    private int codigo;
    private String nombre, clave, telefono, region;

    public EncargadoDTO(int codigo, String nombre, String clave, String telefono, String region) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.clave = clave;
        this.telefono = telefono;
        this.region = region;
    }
    
    public EncargadoDTO(String region, String clave) {
        this.region = region;
        this.clave = clave;
    }
    
    public EncargadoDTO() {
        this.codigo = 0;
        this.nombre = "";
        this.clave = "";
        this.telefono = "";
        this.region = "";
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}
