/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7;

import Identidades.Circunferencia;

/**
 *
 * @author Chespo
 */
public class MainCircunferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Circunferencia circu = new Circunferencia();
        circu.crearCircunferencia();
        System.out.println("Perimetro: "+circu.CalcularPerimetro());
        System.out.println("Area: "+circu.CalcularArea());
        
    }
    
}
