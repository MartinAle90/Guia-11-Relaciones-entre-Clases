/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Martin
 */
public class Producto {
    
    private Integer id;
    private String nombreProducto;
    private Integer precio ;
    
    static private int nextId=1;

    public Producto() {
        id= nextId++;
    }

    public Producto(Integer id, String nombreProducto, Integer precio, int nextId) {
        this.id = id;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +  "nombreProducto=" + nombreProducto  + ", precio=" + precio + '}'+'\n' ;
    }

}
