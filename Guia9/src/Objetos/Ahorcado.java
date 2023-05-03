/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author Chespo
 */
public class Ahorcado {
    
    
     private int letrasEncontradas;
    private int intentos;
    int longitud;
    private String[] palabra = new String[longitud];

    public Ahorcado() {
    }

    public Ahorcado(int letrasEncontradas, int intentos, int longitud) {
        this.letrasEncontradas = letrasEncontradas;
        this.intentos = intentos;
        this.longitud = longitud;
    }

    public Ahorcado(String palabraSecreta, int jugadasMaximas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public String getJugadasMaximas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

