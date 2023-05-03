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
public class Extra4 {


    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese Nombre del Alumno");
        
        
    int a = 10, n = 4, cont = 0;
    double []notafinal=new double[10];
    String[]alumnos=new String[10];
    int[][] matriz = new int[a][n];
    for (int i = 0; i <10;i++){
       alumnos[i]=leer.next();
    }
       System.out.println("Matriz Generada :");
        for (int i = 0; i < a; i++) {
            
            System.out.println("Ingrese los nombres de los Alumnos : ");
            
            System.out.println("|ALUMNO|-----NOTAS-----|-----PROMEDIO-------|");
            System.out.print("|"+(alumnos[i])+"|");
            for (int j = 0; j < n; j++) {
             matriz[i][j] = (int) (Math.random()*10+1);
                cont  += matriz[i][j];
                System.out.print("");
                System.out.print(" "+matriz[i][j]+" ");
               
                System.out.print("|");
             
            notafinal[i]=(matriz[i][0])*0.10+(matriz[i][1])*0.15+(matriz[i][2])*0.25+(matriz[i][3])*0.50;
            
               
             }
            
              System.out.println("Gral:"+(double)(cont/4)+" || Real:"+(notafinal[i]));
              
              cont=0;
             System.out.println(" ");
         }
       /*System.out.println("La suma de los números de la matriz es : "+cont);*/
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
