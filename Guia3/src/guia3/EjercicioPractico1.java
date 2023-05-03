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
public class EjercicioPractico1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        Scanner leer= new Scanner (System.in);
        
        System.out.println("ingrese un numero");
        num=leer.nextInt();
        
        if(num % 2==0){
            System.out.println("el numero ingresado es par");
        }else{
            System.out.println("el numero ingresado es impar");
        }
    }
    
}
