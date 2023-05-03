/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Identidades;

import java.util.Scanner;

/**
 *
 * @author Chespo
 */
public class Circunferencia {

   
    private double radio;
  

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public Circunferencia() {

    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void crearCircunferencia() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el Radio");
        this.radio = leer.nextDouble();
    }

    public double CalcularArea() {
        double area = Math.PI * Math.pow(radio, 2);
        return area;
    }

 
    public double CalcularPerimetro() {
        double perimetro = 2 * Math.PI * radio;
        return perimetro;
    }

   
    private void setradio(String next) {

    }

 

}
