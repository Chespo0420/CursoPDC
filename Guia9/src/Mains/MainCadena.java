/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mains;

import Objetos.Cadena;
import Service.CadenaServicio;

/**
 *
 * @author Chespo
 */
public class MainCadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CadenaServicio cs= new CadenaServicio();
        Cadena cadena = new Cadena("Hola");
        cs.mostrarVocales(cadena);
        cs.invertirFrase(cadena);
        cs.vecesRepetido(cadena);
        cs.compararLongitud(cadena);
        cs.unirFrases(cadena);
        cs.reemplazar(cadena);
        cs.contiene(cadena);
        
    }
    
}
