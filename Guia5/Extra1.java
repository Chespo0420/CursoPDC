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
public class Extra1 {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
    Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n=leer.nextInt();
       int vector[] = new int[n];
       sumatoria(vector,n);
       
       
    }

    private static void sumatoria(int[] vector, int n) {
        int suma=0;
        Scanner leer= new Scanner(System.in);
        for (int i = 0; i < n; i++) {
           vector[i]=leer.nextInt();
        }
        for (int i = 0; i < n; i++) {
            suma+=vector[i];
        }
        System.out.println("La suma es igual: "+ suma);
        
    }
}