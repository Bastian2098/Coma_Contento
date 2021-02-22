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
public class PlatoDTO {
    
    private int codigo, recetaFK, precio;
    private String nombre, descripcion, foto, region;

    public PlatoDTO(int codigo, int recetaFK, String region, int precio, String nombre, String descripcion, String foto) {
        this.codigo = codigo;
        this.recetaFK = recetaFK;
        this.region = region;
        this.precio = precio;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.foto = foto;
    }
    
    public PlatoDTO() {
        this.codigo = 0;
        this.recetaFK = 0;
        this.region = "";
        this.precio = 0;
        this.nombre = "";
        this.descripcion = "";
        this.foto = "";
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getRecetaFK() {
        return recetaFK;
    }

    public void setRecetaFK(int recetaFK) {
        this.recetaFK = recetaFK;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
