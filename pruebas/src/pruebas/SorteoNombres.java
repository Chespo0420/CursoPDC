/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.util.Scanner;

/**
 *
 * @author Chespo
 */
public class SorteoNombres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
          System.out.println("Ingrese cantidad de Participantes");
        int nombre = leer.nextInt();
        int x = (int) ((Math.random() * nombre) + 1);
        String cadena[] = new String[nombre];
      
        leer.nextLine();

        for (int i = 0; i < nombre; i++) {
            System.out.println("Nombre/s : ");
            cadena[i] = leer.nextLine();

        }
        System.out.println("LISTADO : ");
        for (int i = 0; i < nombre; i++) {

            System.out.println(i + 1 + ": " + cadena[i]);
        }

        System.out.println("Nombre Sorteado : " + cadena[x]);

    }

}
