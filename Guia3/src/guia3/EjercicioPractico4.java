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
public class EjercicioPractico4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        String frase;
        Scanner leer= new Scanner (System.in);
        
        System.out.println("ingrese una frase de 8 caracteres");
        frase= leer.nextLine();
        
        if(frase.length()==8){
            System.out.println("correcto");
        }else{
            System.out.println("incorrecto");
        }
    }
    
}
