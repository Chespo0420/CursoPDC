/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author Chespo
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int nota;
        Scanner leer= new Scanner (System.in);
        
        
        do{
            
        System.out.println("ingrese una nota");
        nota=leer.nextInt();
        
        }while (nota<0 || nota>10);
    }
}