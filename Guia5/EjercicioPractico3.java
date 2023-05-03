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
public class EjercicioPractico3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese el tamaño del vector: ");
        int tamanio = leer.nextInt();
        int uno = 0,dos = 0,tres = 0,cuatro = 0,cinco = 0;
        
        int[] vector = new int[tamanio];
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random()*99999)+1;
        }
        
        System.out.println("VECTOR");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(" " + vector[i]);
        }
        System.out.println("");
        
        
        for (int elemento: vector) {
            if ((elemento / 10000) < 10 && (elemento / 10000) >= 1 ) {
                cinco +=1;
            } else if ((elemento / 1000) < 10 && (elemento / 1000) >= 1 )  {
                cuatro += 1;
            } else if ((elemento / 100) < 10 && (elemento / 100) >= 1 ){
                tres += 1;
            } else if ((elemento / 10) < 10 && (elemento / 10) >= 1 ) {
                dos +=1;
            }else {
                uno += 1;
            }
        }
        
        System.out.println("CONTADORES");
        System.out.println("UNO: " + uno);
        System.out.println("DOS: " + dos);
        System.out.println("TRES: " + tres);
        System.out.println("CUATRO: " + cuatro);
        System.out.println("CINCO: " + cinco);
    }
    
}
