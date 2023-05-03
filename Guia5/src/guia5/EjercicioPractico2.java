/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

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
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del vector:");
        int tamanio = leer.nextInt();
                
        int[] vector = new int[tamanio];
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random()*10)+1;
        }
        
        System.out.println("VECTOR");
        for (int elemento: vector) {
            System.out.print( " " + elemento);
        }
        System.out.println("");
        
        System.out.print("Ingrese un numero a buscar en el vector: ");
        int num = leer.nextInt();
        
        
        String posiciones = " ";
        int contPos = 0;
        
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == num) {
                posiciones = posiciones + (i+1) + " ";
                contPos += 1;
            }
        }
        
        
        if (contPos >= 1) {
            System.out.println("El numero se encontró en las posiciones " 
                + posiciones);
        } else {
            System.out.println("El numero no se encontro");
        }
        
        if (contPos > 1) {
            System.out.println("El numero se encontro repetido");
        }

    }
    
}
