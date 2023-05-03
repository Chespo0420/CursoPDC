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
public class EjercicioPractico6 {

    /**
     * @param args the command line arguments
     */

        public static void main(String[] args) {
        int[][] cuadrado = new int[3][3]; // Inicializamos una matriz 3x3
        
        Scanner leer = new Scanner(System.in);
        
        // Pedimos al usuario que introduzca los valores
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Introduce el número en la fila " + (i+1) + " y columna " + (j+1) + ": ");
                cuadrado[i][j] = leer.nextInt();
                
                // Comprobamos que el número introducido está entre 1 y 9
                if (cuadrado[i][j] < 1 || cuadrado[i][j] > 9) {
                    System.out.println("Número incorrecto. Introduce un número entre 1 y 9.");
                    j--; // Volvemos a pedir el número de la misma columna
                }
            }
        }
        
        // Calcular la suma de la primera fila para comparar con el resto de filas, columnas y diagonales
        int suma = cuadrado[0][0] + cuadrado[0][1] + cuadrado[0][2];
        
        // Comprueba si todas las filas tienen la misma suma que la primera fila
        boolean filas = true;
        for (int i = 1; i < 3; i++) {
            int sumaFila = cuadrado[i][0] + cuadrado[i][1] + cuadrado[i][2];
            if (sumaFila != suma) {
                filas = false;
                break;
            }
        }
        
        // Comprueba si todas las columnas tienen la misma suma que la primera fila
        boolean columnas = true;
        for (int j = 0; j < 3; j++) {
            int sumaColumna = cuadrado[0][j] + cuadrado[1][j] + cuadrado[2][j];
            if (sumaColumna != suma) {
                columnas = false;
                break;
            }
        }
        
        // Comprueba si la diagonal principal tiene la misma suma que la primera fila
        boolean diagonalPrincipal = cuadrado[0][0] + cuadrado[1][1] + cuadrado[2][2] == suma;
        
        // Comprueba si la diagonal secundaria tiene la misma suma que la primera fila
        boolean diagonalSecundaria = cuadrado[0][2] + cuadrado[1][1] + cuadrado[2][0] == suma;
        
        // Comprueba si el cuadrado es mágico
        if (filas && columnas && diagonalPrincipal && diagonalSecundaria) {
            System.out.println("El cuadrado es mágico.");
        } else {
            System.out.println("El cuadrado no es mágico.");
        }
        
    }

}
    
    

