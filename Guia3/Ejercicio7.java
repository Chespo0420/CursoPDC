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
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tipoMotor;
         Scanner leer= new Scanner (System.in);
        
        
        System.out.println("ingrese el tipo de bomba que necesita");
        System.out.println("1- tipo A ");
        System.out.println("2- tipo B");
        System.out.println("3- tipo C");
        System.out.println("4- tipo D");
        
        tipoMotor= leer.nextInt();
        
        switch(tipoMotor){
            case 1:{
                System.out.println("La bomba es una bomba de agua");    
            break;
            }
            case 2:{
                System.out.println("La bomba es una bomba de gasolina"); 
            break;
            }
            case 3:{
                System.out.println("La bomba es una bomba de hormigon"); 
            break;
            }
            case 4:{
                System.out.println("La bomba es una bomba de pasta alimenticia"); 
            break;
            }
            default:{
                System.out.println("No existe un valor válido para tipo de bomba");
            break;
            }
        }
    
}
}