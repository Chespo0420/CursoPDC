/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Chespo
 */
public class FechaService {
    Scanner leer = new Scanner(System.in);

    public Date fechaNacimiento() {
        System.out.println("Ingresar fecha de nacimiento:");
        System.out.println("Dia: ");
        int dia = leer.nextInt();
        System.out.println("Mes: ");
        int mes = leer.nextInt();
        System.out.println("Año: ");
        int anio = leer.nextInt();
        Date fecha = new Date(anio - 1900, mes - 1, dia);
        return fecha;
    }
    
    public Date fechaActual(){
        Date fecha = new Date();
        return fecha;
    }
    
    public int diferencia(Date fechaNac, Date fechaAct){
        return fechaAct.getYear() - fechaNac.getYear();
    }
}
