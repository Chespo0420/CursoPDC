/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mains;

import Objetos.PersonObj;
import Service.PersonService;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Chespo
 */
public class PersonMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        PersonService persona = new PersonService();
        
        PersonObj pers = persona.crearPersona();
        
        persona.calcularEdad(pers);
        
        System.out.println("Ingresar fecha de nacimiento a comparar:");
        System.out.println("Dia:");
        int day = leer.nextInt();
        System.out.println("Mes:");
        int month = leer.nextInt();
        System.out.println("Año:");
        int year = leer.nextInt();
        Date fecha = new Date(year - 1900, month - 1, day);
        
        System.out.println("Es " + pers.getNombre() + " mayor que la fecha de nacimiento ingresada? = " + persona.menorQue(pers, fecha));
        
        persona.mostrarPersona(pers);
    }
    
    
}
