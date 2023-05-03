/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7;

import Identidades.Rectangulo;

/**
 *
 * @author Chespo
 */
public class MainRectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo rec1 = new Rectangulo();
        rec1.CrearRectangulo();
        System.out.println("Superficie : " + rec1.CalcularSuperficie());
        System.out.println("Perímetro : " + rec1.CalcularPerimetro());
        System.out.println("Rectangulo : ");
        rec1.DibujarRectangulo();
    }

}
