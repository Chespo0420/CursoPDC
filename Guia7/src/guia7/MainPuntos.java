/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7;

import Identidades.Puntos;

/**
 * @author Chespo
 */
public class MainPuntos {

   
    public static void main(String[] args) {
     
        Puntos PL = new Puntos();
        PL.CrearPuntos();
        System.out.println("La distancia entre ambos Puntos es de : "+PL.Distanica());
        
        
    }
    
}
