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
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
           Scanner leer= new Scanner (System.in);
           
          
          for(int i=0;i<4;i++){
              num=leer.nextInt();
              for(int j=0;j<num;j++){
              System.err.print("*");
              
              }
              
              System.err.println("");
              
          }
    }
    
}
