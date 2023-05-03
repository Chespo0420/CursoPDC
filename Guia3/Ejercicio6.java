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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1,num2;
        Scanner leer= new Scanner (System.in);
        
        System.out.println("ingresde un numero");
        num1= leer.nextInt();
        System.out.println("ingresde otro numero");
        num2= leer.nextInt();
        
        if(num1>25 && num2>25){
            System.out.println("ambos numero son mayores a 25");
        }else if(num1>25){
            System.out.println("el primer numero es mayor a 25");
        }else if(num2>25){
            System.out.println("el segundo numero es mayor a 25");
        }else{
            System.out.println("ningun numero es mayor a 25");
    }
    
    }
}
