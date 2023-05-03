/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado a otra moneda, 
estas pueden ser a dólares, yenes o libras. La función tendrá como parámetros, la cantidad de euros y la moneda a convertir 
que será una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).

El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

 */
package Guia4;

import java.util.Scanner;


public class Ejercicio3 {


    public static void main(String[] args) {
        Scanner leer  = new Scanner(System.in);
        
        System.out.println("Ingresar el monto que desea convertir");
        double num = leer.nextDouble();
        System.out.println("Elegir a que moneda desea cambiar");
        System.out.println("1. Libras");
        System.out.println("2. Dolares");
        System.out.println("3. Yenes");
        int opcion = leer.nextInt();
        
        cambio(num, opcion);
        
    }
      
        public static double libras(double num) {
        double libras = num * 0.86;
        return libras;           
    }
        
        public static double dolar(double num) {
        double dolar = num * 1.28611;
        return dolar;           
    }
        public static double yenes(double num) {
        double yenes = num * 129.852;
        return yenes;           
    }
        
        public static void cambio(double num, int opcion) {
            switch (opcion) {
                case 1 :
                    System.out.println(num + " euros es igual a " + libras(num) + " libras");
                    break;
                case 2 :
                    System.out.println(num + " euros es igual a " + dolar(num) + " dolares");
                    break;
                case 3 :
                    System.out.println(num + " euros es igual a " + yenes(num) + " yenes");
                    break;
                    
            }
            
    }
}