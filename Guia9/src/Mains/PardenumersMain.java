/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mains;

import Objetos.Pardenumeros;
import Service.PardenumerosService;

/**
 *
 * @author Chespo
 */
public class PardenumersMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        PardenumerosService numserv = new PardenumerosService();
        Pardenumeros numero = numserv.rellenar();
        numserv.mostrarValores(numero);
        numserv.devolverMayor(numero);
        System.out.println("La Potencia del mayor valor de la clase elevado al menor número es : "+numserv.calcularPotencia(numero));
        System.out.println("La raiz cuadrada del numero Menor es : "+numserv.calcularRaiz(numero));
    }
    

}       
  