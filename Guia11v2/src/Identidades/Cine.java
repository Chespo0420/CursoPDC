/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Identidades;

import java.util.ArrayList;
import java.util.List;

public class Cine {
    
    private double precio;
    private List<Sala> sala;

    public Cine() {
        this.precio = 800;
        this.sala = new ArrayList();
    }

    public Cine(double precio, Sala sala) {
        this.precio = precio;
        this.sala = new ArrayList();
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public List<Sala> getSala() {
        return sala;
    }

    public void setSala(List<Sala> sala) {
        this.sala = sala;
    }
}
