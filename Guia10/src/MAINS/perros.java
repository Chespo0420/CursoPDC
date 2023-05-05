/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MAINS;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Chespo
 */
public class perros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        


        Scanner leer = new Scanner(System.in);
        ArrayList<String> Mascota = new ArrayList<>();
        String raza;
        boolean salir;

        do {
            System.out.println("Ingrese la raza del perro: ");
            raza = leer.nextLine();
            Mascota.add(raza);

            System.out.println("Desea ingresar otra raza? -S/N- ");
            String newRaza = leer.next();
            leer.nextLine();

            if (newRaza.equalsIgnoreCase("S")) {
                salir = false;
            } else {
                System.out.println(Mascota);
                salir = true;
            }
        } while (!salir);

        System.out.println("");
        System.out.println("Perro a borrar:");
        String perro = JOptionPane.showInputDialog("Perro a Eliminar");
        //String perro = leer.nextLine();
        for (String string : Mascota) {
            if (string.equals(perro)) {
                Mascota.remove(perro);
            }
        }
        System.out.println("");
        System.out.println("perro eliminado: " + perro);
        System.out.println(Mascota);
    }
}
    
    

