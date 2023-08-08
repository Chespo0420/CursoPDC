/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12eje04formasgeometricas;

import Entidades.Circulo;
import Entidades.Rectangulo;


public class Guia12Eje04FormasGeometricas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Circulo circ = new Circulo(5);
        Rectangulo rec = new Rectangulo(7, 3);

        System.out.println("Area circulo: " + circ.calcularArea());
        System.out.println("Perimetro circulo: " + circ.calcularPerimetro());
        System.out.println("Area rectangulo: " + rec.calcularArea());
        System.out.println("Perimetro rectangulo: " + rec.calcularPerimetro());

    }

}
