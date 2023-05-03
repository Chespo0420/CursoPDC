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
public class EjercicioPractico1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         /* Escribir un programa que pida dos números enteros por teclado y calcule
la suma de los dos. El programa deberá después mostrar el resultado de
la suma
*/
       Scanner leer= new Scanner(System.in);
       int numero1 , numero2 ;
        System.out.println(" ingrese dos numeros ");
        numero1= leer.nextInt() ;
        numero2= leer.nextInt() ;
       int suma = numero1 + numero2 ;
        System.out.println("la suma es = "+ suma);
    }
    
}
