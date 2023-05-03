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
public class EjercicioPractico5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          /* Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número.
*/
   Scanner leer = new Scanner (System.in);
   int num ;
    System.out.println("ingrese un numero entero");
        num =leer.nextInt();
    System.out.println("el doble es = " + num*2 );
    System.out.println("el triple es = " + num*3 );
    System.out.println("la raiz cuadrada es = " + Math.sqrt(num));
    }
    
}
