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
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num,suma=0,cont=0;
        boolean bandera=false;
        Scanner leer= new Scanner (System.in);
         
        do{
        
            System.out.println("ingrese un numero");
            num=leer.nextInt();
            cont++;
            
            if(num>0){
                suma=suma+num;
            }
            
            if(num==0){
                System.out.println("se capturo un 0");
                bandera =true;
            }
        
        }while(bandera || cont!=20) ;
        
        System.out.println("la suma de los numero es: "+suma);
    }
 
}

  