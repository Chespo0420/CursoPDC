/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Objetos.Raices;
import java.util.Scanner;

/**
 *
 * @author clavs
 */
public class RaicesService {

    Scanner leer = new Scanner(System.in);
    Raices raiz = new Raices();

    public void llenarEcuacion(){
        System.out.println("Ingrese los valores de a, b y c:");
        System.out.println("A:");
        raiz.setA(leer.nextDouble());
        System.out.println("B:");
        raiz.setB(leer.nextDouble());
        System.out.println("C:");
        raiz.setC(leer.nextDouble());
    }
    
    public double getDiscriminate() {
        return (Math.pow(raiz.getB(), 2)) - 4 * raiz.getA() * raiz.getC();
    }

    public boolean tieneRaices() {
        double discriminate = getDiscriminate();
        boolean es = false;
        if (discriminate >= 0) {
            es = true;
        }
        return es;
    }

    public boolean tieneRaiz() {
        double discriminate = getDiscriminate();
        boolean es = false;
        if (discriminate == 0) {
            es = true;
        }
        return es;
    }

    public void obtenerRaices() {
        boolean raices = tieneRaices(); 
        if (raices) {
            System.out.println("   Solucion #1:");
            System.out.println("   " + (-raiz.getB() + Math.sqrt((Math.pow(raiz.getB(), 2)) - (4 * raiz.getA() * raiz.getC()))) / (2 * raiz.getA()));
            System.out.println("   Solucion #2:");
            System.out.println("   " + (-raiz.getB() - Math.sqrt((Math.pow(raiz.getB(), 2)) - (4 * raiz.getA() * raiz.getC()))) / (2 * raiz.getA()));
        }
    }

    public void obtenerRaiz() {
        boolean raices = tieneRaiz(); 
        if (raices) {
            System.out.println("   Solucion:");
            System.out.println("   " + (-raiz.getB() + Math.sqrt((Math.pow(raiz.getB(), 2)) - (4 * raiz.getA() * raiz.getC()))) / (2 * raiz.getA()));
        }
    }

    public void calcular() {
        System.out.println("POSIBLES SOLUCIONES:");
        System.out.println(" - Tiene una solucion? = " + tieneRaiz());
        if(tieneRaiz()){
            obtenerRaiz();
        }
        System.out.println(" - Tiene dos soluciones? = " + tieneRaices());
        if(tieneRaices()){
            obtenerRaices();
        }
        if(!tieneRaiz() && !tieneRaices()){
            System.out.println("No hay posibles soluciones para la ecuacion.");
        }
    }
}
