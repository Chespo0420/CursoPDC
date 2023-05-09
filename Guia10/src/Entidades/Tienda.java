/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Chespo
 */
public class Tienda {
    private String Articulo;
    private Double Precio;

    public Tienda() {
    }

    public Tienda(String Articulo, Double Precio) {
        this.Articulo = Articulo;
        this.Precio = Precio;
    }

    public String getArticulo() {
        return Articulo;
    }

    public void setArticulo(String Articulo) {
        this.Articulo = Articulo;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double Precio) {
        this.Precio = Precio;
    }

    
    
    
}
