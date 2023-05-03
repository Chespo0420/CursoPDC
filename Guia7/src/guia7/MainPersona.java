/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7;

import Identidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Chespo
 */
public class MainPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        Persona p1 = new Persona();
        System.out.println("Ingrese El Nombre :");
        p1.nombre = leer.next();
        System.out.println("Ingrese El Apellido : ");
        p1.Apellido = leer.next();
        System.out.println("Ingrese La Edad : ");
        p1.Edad = leer.nextInt();
        System.out.println("Ingrese La Provincia : ");
        p1.Provincia = leer.next();
        
        System.out.println(p1);
        
        
    }

}
