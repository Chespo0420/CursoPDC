/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Objetos.PersonObj;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Chespo
 */
public class PersonService {

        Scanner leer = new Scanner(System.in);
    PersonObj persona = new PersonObj();
    
    public PersonObj crearPersona(){
        System.out.println("Ingresar nombre:");
        persona.setNombre(leer.nextLine());
        System.out.println("Ingresar fecha de nacimiento:");
        System.out.println("Dia:");
        int day = leer.nextInt();
        System.out.println("Mes:");
        int month = leer.nextInt();
        System.out.println("Año:");
        int year = leer.nextInt();
        Date fecha = new Date(year - 1900, month - 1, day);
        persona.setFecha(fecha);
        return persona;
    }
    
    public void calcularEdad(PersonObj persona){
        Date fechaActual = new Date();
        Date fechaNacimiento = persona.getFecha();
        System.out.println("La edad de " + persona.getNombre() + " es de " + (fechaActual.getYear() - fechaNacimiento.getYear()) + " años." );
    }
    
    public boolean menorQue(PersonObj persona, Date fecha){
        Date edadPersona = persona.getFecha();
        boolean esMenor = false;
        switch(edadPersona.compareTo(fecha)){
            case -1:
                esMenor = true;
                break;
            case 0:
                esMenor = false;
                break;
            case 1:
                esMenor = false;
                break;       
        }
        return esMenor;
    }
    
    public void mostrarPersona(PersonObj persona){
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Fecha de nacimiento: " + persona.getFecha());
    }
}
