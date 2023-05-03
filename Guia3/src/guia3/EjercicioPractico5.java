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
public class EjercicioPractico5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int limite,suma=0,numero;
        Scanner leer= new Scanner (System.in);
        
        System.out.println("por favolr in grese un numero limite");
        limite= leer.nextInt();
        
        do{
            System.out.println("ingrese un numero");
            numero=leer.nextInt();
            suma=suma+numero;
            
        }while(suma<limite);
        
        System.out.println(suma);
    }
    
}
