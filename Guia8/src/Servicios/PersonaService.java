/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Servicios.Persona;
import java.util.Scanner;

/**
 *
 * @author clavs
 */
public class PersonaService {

    Persona per = new Persona();
    Scanner leer = new Scanner(System.in);

    public boolean esMayorDeEdad() {

        boolean mayorDeEdad;

        if (per.getEdad() < 18) {
            System.out.println("La persona es menor de edad.");
            mayorDeEdad = false;
        } else {
            System.out.println("La persona es mayor de edad.");
            mayorDeEdad = true;
        }

        return mayorDeEdad;
    }

    public void crearPersona() {
        System.out.println("Ingrese el nombre de la persona:");
        per.setNombre(leer.nextLine());
        System.out.println("Ingrese la edad:");
        per.setEdad(leer.nextInt());
        System.out.println("Ingrese el sexo (Hombre = H; Mujer = M; Otro = O):");
        leer.skip("\n");
        per.setSexo(leer.nextLine());

        while (!per.getSexo().equalsIgnoreCase("H") && !per.getSexo().equalsIgnoreCase("M") && !per.getSexo().equalsIgnoreCase("O")) {
            System.out.println("VALOR INVALIDO. Intente nuevamente.");
            per.setSexo(leer.nextLine());
        }

        System.out.println("Ingrese el peso:");
        per.setPeso(leer.nextDouble());
        System.out.println("Ingrese la altura:");
        per.setAltura(leer.nextDouble());
    }

    public int calcularIMC() {

        double imc = per.getPeso() / ((per.getAltura() / 100) * (per.getAltura() / 100));
        int pesoIdeal = 0;

        if (imc < 20) {
            pesoIdeal = -1;
        }
        if (imc >= 20 && imc <= 25) {
            pesoIdeal = 0;
        }
        if (imc > 25) {
            pesoIdeal = 1;
        }

        return pesoIdeal;
    }
}
