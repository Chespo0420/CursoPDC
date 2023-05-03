/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas ingresadas por teclado e 
indique si son mayores o menores de edad. Después de cada persona, el programa debe preguntarle al usuario si quiere seguir 
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
package Guia4;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean flag = true;
        
        do {
            leer.nextLine();
            System.out.println("Ingresar nombre y edad");
            String nombre = leer.nextLine();
            int edad = leer.nextInt();
            
            mayorMenorEdad ( nombre,  edad);
   
            System.out.println("Desea seguir mostrando personas? s/n");
            String opcion = leer.next();
            if (opcion.equals("n")) {
                flag=false;
            }
            
        } while (flag!=false);
        
        
    }
    
    public static void mayorMenorEdad (String nombre, int edad){
    
        if (edad>=18) {
            System.out.println(nombre + " es mayor de edad");   
        } else {
            System.out.println(nombre + " es menor de edad");
        }
  
    }
    
}
