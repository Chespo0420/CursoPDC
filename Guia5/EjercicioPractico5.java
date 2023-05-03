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
public class EjercicioPractico5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese Tamaño de Matriz");
        int dimension;
        
        dimension = leer.nextInt();
        int[][] matriz = new int[dimension][dimension];
        System.out.println("MATRIZ");
        
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++){
            matriz[i][j] = leer.nextInt();
            }
            }
        
        
        
        
        
        VerMatriz(matriz,dimension);
        esAntisimetrica(matriz,dimension);
        
        if(esAntisimetrica(matriz,dimension)){
            System.out.println("es una matriz anticimetrica");
        }else{
            System.out.println("no es una matriz antisimetrica");
        }
    }
    private static void VerMatriz(int[][] matriz, int dimension) {
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.print(" "+matriz[i][j]+" ");
                
            }
            System.out.println(" ");
        } 
    }

    private static boolean esAntisimetrica(int[][] matriz, int dimension) {
            boolean bandera=true;
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                if(i!=j){
                    if(matriz[i][j]!=(matriz[j][i])*(-1)){
                        bandera=false;
                        break;
                    }
                    
                }
                
            }
          
        }
        
        return bandera;
    }
    }
    
    



    
