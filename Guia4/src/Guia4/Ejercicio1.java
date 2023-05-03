/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre 
sumar, restar, multiplicar y dividir. La aplicación debe tener una función para 
cada operación matemática y deben devolver sus resultados para imprimirlos en el main. 
 */
package Guia4;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        
        System.out.println("Ingresar dos números enteros");
        
        
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();

        
        System.out.println("Elegir la operación que desea realizar");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        
        int opcion = leer.nextInt();
       
        switch(opcion){
            case 1:
                System.out.println("La suma es: "+sumar(num1,num2) );
                break;
            case 2:
                System.out.println("La resta es: "+restar(num1,num2) );
                break;
            case 3:
                System.out.println("El producto es: "+multiplicar(num1,num2) );
                break;
            case 4:
                System.out.println("El cociente es: "+dividir(num1,num2));    
                break;
        }
    }
        
    
    

    public static int sumar(int num1, int num2) {
        int suma;
        suma = num1 + num2;
        return suma;
    }

    public static int restar(int num1, int num2) {
        int resta;
        resta = num1 - num2;
        return resta;
    }

    public static int multiplicar(int num1, int num2) {
        int producto;
        producto = num1 * num2;
        return producto;
    }

    public static double dividir(int num1, int num2) {
        double cociente;
        cociente = num1/num2;
        return cociente;
    }
}