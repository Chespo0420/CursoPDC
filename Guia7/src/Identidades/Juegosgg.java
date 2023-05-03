/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Identidades;

import java.util.Scanner;

/**
 *
 * @author Chespo
 */
public class Juegosgg {
    int num1;
    int num2; 
    int intentos=0;
    
     public void iniciar_juego(){
         Scanner leer = new Scanner(System.in);  
         System.out.println("ingrese el numero oculto");
         num1= leer.nextInt();
         
         do{
             System.out.println("adivina el numero");
             num2= leer.nextInt();
             if(num1 != num2){
                 if(num1>num2){
                     System.out.println("el numero que buscas es mas alto");
                     intentos++;
                 }else{
                     System.out.println("el numero que buscas es mas bajo");
                     intentos++;
                 }
             }else{
                 System.out.println("Adivinaste el numero!");
                 intentos++;
                 break;
             }
             System.out.println("intentos: "+intentos); 
             
         }while(intentos < 10 || num1==num2);
}

   
}

