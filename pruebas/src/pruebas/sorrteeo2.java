/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.util.Scanner;

/**
 *
 * @author Chespo
 */
public class sorrteeo2 {

    /**
     * @param args the command line arguments
     */

        public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[] nombres = new String[32];
        for (int i = 0; i < 31; i++) {
            System.out.println("nombres");
            nombres[i] = leer.nextLine(); 
        }
        int num = (int)(Math.random()*32);
        System.out.println("nombre: "+nombres[num]);
    }
    }
    

