
package Guia4;

import java.util.Scanner;

public class EjercicioGuia {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresar una frase");
        String frase = leer.nextLine();
        
        int cantidadCaracteres = frase.length();
        
        for (int i = 0; i < cantidadCaracteres; i++) {
            
            switch (frase.substring(i,i+1)){
                case "a":
                    System.out.print("@");
                    break;
                case "e":
                    System.out.print("#");
                    break;
                case "i":
                    System.out.print("$");
                    break;
                case "o":
                    System.out.print("%"); 
                    break;
                case "u":
                    System.out.print("*");
                    break;
                default:
                    System.out.print(frase.substring(i,i+1));
                    break;
            }
        }      
    }
    
}