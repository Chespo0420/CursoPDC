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
public class EjercicioPractico4v2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matriz = new int[4][4];
        
        rellenarMattriz(matriz, 4);
        mostrarMattriz(matriz,4);
        matrizTraspuesta(matriz,4);
    }
    Scanner leer = new Scanner(System.in);
    public static void rellenarMattriz( int[][] matriz, int tamanio) {
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                matriz[i][j] = (int) (Math.random()*10)+1;   
            }
        }
    }
    
    public static void mostrarMattriz( int[][] matriz,int tamanio) {
        System.out.println("MATRIZ");
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                System.out.print(" " + matriz[i][j]);
            }
            System.out.println("");
        }
    }
    
    public static void matrizTraspuesta( int[][] matriz, int tamanio) {
        System.out.println("MATRIZ TRASPUESTA");
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                System.out.print(" " + matriz[j][i]);
            }
            System.out.println("");
        }
    }
}
