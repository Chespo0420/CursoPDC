/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Identidades;

import java.util.ArrayList;


public class Equipo {
    private ArrayList<JugadorFut> jugadores = new ArrayList();

    public Equipo() {
    }

    public ArrayList<JugadorFut> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<JugadorFut> jugadores) {
        this.jugadores = jugadores;
    }
    
}
