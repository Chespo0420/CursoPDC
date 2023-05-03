/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7;

import Identidades.Cancion;

/**
 *
 * @author Chespo
 */
public class MainCancion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cancion C1 = new Cancion();
        C1.CrearCancion();
        System.out.println(C1.toString());
    }
    
}
