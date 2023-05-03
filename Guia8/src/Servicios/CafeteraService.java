/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Objetos.Cafetera;
import java.util.Scanner;

/**
 *
 * @author clavs
 */
public class CafeteraService {

    Scanner leer = new Scanner(System.in);
    Cafetera nespresso = new Cafetera();

    public void setearCafetera() {
        System.out.println("Ingrese la capacidad maxima de su cafetera:");
        nespresso.setCapacidadMaxima(leer.nextInt());
    }

    public void llenarCafetera() {
        System.out.println("Cafetera llena!");
        nespresso.setCafeActual(nespresso.getCapacidadMaxima());
    }

    public void servirTaza() {

        System.out.println("Ingrese la capacidad de la taza:");
        int taza = leer.nextInt();

        if (taza > nespresso.getCafeActual()) {
            System.out.println("No hay cafe suficiente para llenar la taza.");
            System.out.println("Se llenaron " + nespresso.getCafeActual() + "ml de " + taza + "ml");
            nespresso.setCafeActual(0);
        } else {
            System.out.println("Taza llena!");
            nespresso.setCafeActual(nespresso.getCafeActual() - taza);
        }
    }

    public void vaciarCafetera() {
        System.out.println("Cafetera vaciada.");
        nespresso.setCafeActual(0);
    }
    
    public void agregarCafe(){
        System.out.println("Ingrese la cantidad de cafe a agregar:");
        int cafe = leer.nextInt();
        System.out.println("Cafe agregado!");
        nespresso.setCafeActual(nespresso.getCafeActual() + cafe);
    }
}
