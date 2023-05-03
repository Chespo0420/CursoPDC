/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Objetos.NIF;
import java.util.Scanner;

/**
 *
 * @author clavs
 */
public class NIFService {

    Scanner leer = new Scanner(System.in);
    NIF nif1 = new NIF();
    String[] tabla = { "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E" };

    public void crearNIF() {
        System.out.println("Ingresar DNI:");
        nif1.setDni(leer.nextLong());

        int valor = (int) (nif1.getDni() % 23);
        nif1.setLetra(tabla[valor]);

    }
    
    public void mostrarNIF(){
        System.out.println("NIF = " + nif1.getDni() + "-" + nif1.getLetra());
    }
}
