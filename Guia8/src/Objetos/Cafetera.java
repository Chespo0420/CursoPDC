/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author clavs
 */
public class Cafetera {
    
    private int capacidadMaxima;
    private int cafeActual;

    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima, int cafeActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cafeActual = cafeActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCafeActual() {
        return cafeActual;
    }

    public void setCafeActual(int cafeActual) {
        this.cafeActual = cafeActual;
    }
    
    
}
