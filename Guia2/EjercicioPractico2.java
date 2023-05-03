/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2;

import java.util.Scanner;

/**
 *
 * @author Chespo
 */
public class EjercicioPractico2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          /*  Escribir un programa que pida tu nombre, lo guarde en una variable y lo
muestre por pantalla.
*/
      Scanner leer = new Scanner(System.in);
       String nombre ;
        System.out.println("ingrese su nombre");
        nombre = leer.next() ;
        System.out.println( "su nombre es : "+ nombre);
    }
    
}
