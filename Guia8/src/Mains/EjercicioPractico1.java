package Mains;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Servicios.CuentaBancariaService;
import java.util.Scanner;

/**
 *
 * @author clavs
 */
public class EjercicioPractico1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        CuentaBancariaService service = new CuentaBancariaService();
        boolean salir = false;
        int entrada;

        do {
            System.out.println("BANCO REGO");
            System.out.println("Que operacion desea realizar?");
            System.out.println("1 - Crear cuenta");
            System.out.println("2 - Ingresar dinero");
            System.out.println("3 - Retirar dinero");
            System.out.println("4 - Extraccion rapida");
            System.out.println("5 - Consultar saldo");
            System.out.println("6 - Consultar datos");
            System.out.println("7 - Salir");
            entrada = leer.nextInt();

            switch (entrada) {
                case 1:
                    service.crearCuenta();
                    break;
                case 2:
                    System.out.println("Ingrese el importe:");
                    service.ingresar(leer.nextInt());
                    break;
                case 3:
                    System.out.println("Ingrese el importe:");
                    service.retirar(leer.nextInt());
                    break;
                case 4:
                    service.extraccionRapida();
                    break;
                case 5:
                    System.out.println("Su saldo actual es: " + service.consultarSaldo());
                    break;
                case 6:
                    service.consultarDatos();
                    break;
                case 7:
                    salir = true;
                    break;
                default:
                    System.out.println("Valor ingresado invalido.");
            }

            leer.nextLine();

        } while (salir == false);
    }

}
