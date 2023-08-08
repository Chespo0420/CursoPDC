/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Identidades;

import java.util.ArrayList;

public class Juego {
    
    private ArrayList<JugadorV> jugadores = new ArrayList();
    private Revolver rev;

    public Juego() {
    }

    public Juego(Revolver rev) {
        this.rev = rev;
    }

    public ArrayList<JugadorV> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<JugadorV> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getRev() {
        return rev;
    }

    public void setRev(Revolver rev) {
        this.rev = rev;
    }
    
}
