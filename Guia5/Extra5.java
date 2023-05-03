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
public class Extra5 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese Tamaño Vector (FxC)");
    int f = leer.nextInt();
    int c = leer.nextInt();
    int cont = 0;
    int[][] matriz = new int[f][c];
       System.out.println("Matriz Generada :");
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
             matriz[i][j] = (int) (Math.random()*10);
                cont  += matriz[i][j];
                System.out.print(" "+matriz[i][j]+" ");
               
             }
            
             System.out.println(" ");
         }
       System.out.println("La suma de los números de la matriz es : "+cont);
        
        
        
    }
    
}
