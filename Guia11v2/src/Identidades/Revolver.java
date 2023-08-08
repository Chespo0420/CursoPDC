/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Identidades;


public class Revolver {

    private int posicionActual;
    private int posicionDisparo;

    public Revolver() {
    }

    public Revolver(int posicionActual, int posicionDisparo) {
        this.posicionActual = posicionActual;
        this.posicionDisparo = posicionDisparo;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionDisparo() {
        return posicionDisparo;
    }

    public void setPosicionDisparo(int posicionDisparo) {
        this.posicionDisparo = posicionDisparo;
    }

}
