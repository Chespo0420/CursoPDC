package Mains;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Servicios.PersonaService;
import java.util.Scanner;

/**
 *
 * @author clavs
 */
public class EjercicioPractico3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        PersonaService persona1 = new PersonaService();
        PersonaService persona2 = new PersonaService();
        PersonaService persona3 = new PersonaService();
        PersonaService persona4 = new PersonaService();

        System.out.println("Crear Persona #1:");
        persona1.crearPersona();
        System.out.println("Crear Persona #2:");
        persona2.crearPersona();
        System.out.println("Crear Persona #3:");
        persona3.crearPersona();
        System.out.println("Crear Persona #4:");
        persona4.crearPersona();

        int contadorBajoPeso = 0;
        int contadorPesoIdeal = 0;
        int contadorSobrePeso = 0;
        int mayorDeEdad = 0;

        System.out.println(" ");
        System.out.println("Calculos persona #1:");
        System.out.println("IMC:");
        switch (persona1.calcularIMC()) {
            case -1:
                System.out.println("La persona #1 esta por debajo de su peso ideal.");
                contadorBajoPeso++;
                break;
            case 0:
                System.out.println("La persona #1 esta en su peso ideal.");
                contadorPesoIdeal++;
                break;
            case 1:
                System.out.println("La persona #1 esta por encima de su peso ideal.");
                contadorSobrePeso++;
                break;
            default:
        }
        boolean per1edad = persona1.esMayorDeEdad();
        if (per1edad) {
            mayorDeEdad++;
        }

        System.out.println(" ");
        System.out.println("Calculos persona #2:");
        System.out.println("IMC:");
        switch (persona2.calcularIMC()) {
            case -1:
                System.out.println("La persona #2 esta por debajo de su peso ideal.");
                contadorBajoPeso++;
                break;
            case 0:
                System.out.println("La persona #2 esta en su peso ideal.");
                contadorPesoIdeal++;
                break;
            case 1:
                System.out.println("La persona #2 esta por encima de su peso ideal.");
                contadorSobrePeso++;
                break;
            default:
        }
        boolean per2edad = persona2.esMayorDeEdad();
        if (per2edad) {
            mayorDeEdad++;
        }

        System.out.println(" ");
        System.out.println("Calculos persona #3:");
        System.out.println("IMC:");
        switch (persona3.calcularIMC()) {
            case -1:
                System.out.println("La persona #3 esta por debajo de su peso ideal.");
                contadorBajoPeso++;
                break;
            case 0:
                System.out.println("La persona #3 esta en su peso ideal.");
                contadorPesoIdeal++;
                break;
            case 1:
                System.out.println("La persona #3 esta por encima de su peso ideal.");
                contadorSobrePeso++;
                break;
            default:
        }
        boolean per3edad = persona3.esMayorDeEdad();
        if (per3edad) {
            mayorDeEdad++;
        }

        System.out.println(" ");
        System.out.println("Calculos persona #4:");
        System.out.println("IMC:");
        switch (persona4.calcularIMC()) {
            case -1:
                System.out.println("La persona #4 esta por debajo de su peso ideal.");
                contadorBajoPeso++;
                break;
            case 0:
                System.out.println("La persona #4 esta en su peso ideal.");
                contadorPesoIdeal++;
                break;
            case 1:
                System.out.println("La persona #4 esta por encima de su peso ideal.");
                contadorSobrePeso++;
                break;
            default:
        }
        boolean per4edad = persona4.esMayorDeEdad();
        if (per4edad) {
            mayorDeEdad++;
        }

        System.out.println(" ");
        System.out.println("RESULTADOS:");
        System.out.println("Porcentaje de personas debajo de su peso ideal = " + contadorBajoPeso * 100 / 4 + "%");
        System.out.println("Porcentaje de personas con peso ideal = " + contadorPesoIdeal * 100 / 4 + "%");
        System.out.println("Porcentaje de personas por encima de su peso ideal = " + contadorSobrePeso * 100 / 4 + "%");
        System.out.println("Porcentaje de personas mayores de edad = " + mayorDeEdad * 100 / 4 + "%");
    }
}
