package Mains;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Servicios.CafeteraService;
import java.util.Scanner;

/**
 *
 * @author clavs
 */
public class EjercicioPractico2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CafeteraService cafetera = new CafeteraService();
        Scanner leer = new Scanner(System.in);
        boolean salir = false;
        int entrada;

        do {
            System.out.println("NESPRESSO REGO");
            System.out.println("Que operacion desea realizar?");
            System.out.println("1 - Programar cafetera");
            System.out.println("2 - Llenar cafetera");
            System.out.println("3 - Servir taza");
            System.out.println("4 - Vaciar cafetera");
            System.out.println("5 - Agregar cafe");
            System.out.println("6 - Salir");
            entrada = leer.nextInt();

            switch (entrada) {
                case 1:
                    cafetera.setearCafetera();
                    break;
                case 2:
                    cafetera.llenarCafetera();
                    break;
                case 3:
                    cafetera.servirTaza();
                    break;
                case 4:
                    cafetera.vaciarCafetera();
                    break;
                case 5:
                    cafetera.agregarCafe();
                    break;
                case 6:
                    salir = true;
                    break;
                default:
                    System.out.println("Valor ingresado invalido.");
            }

            leer.nextLine();

        } while (salir == false);
    }

}
