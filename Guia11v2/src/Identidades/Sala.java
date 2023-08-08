/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Identidades;


public class Sala {

    private boolean[][] asientos = new boolean[8][6];
    private Pelicula pelicula;

    public Sala() {
    }

    public Sala(boolean[][] asientos, Pelicula pelicula) {
        this.asientos = asientos;
        this.pelicula = pelicula;
    }

    public boolean[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(boolean[][] asientos) {
        this.asientos = asientos;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }
}
