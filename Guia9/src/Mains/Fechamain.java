/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mains;

import Service.FechaService;
import java.util.Date;

/**
 *
 * @author Chespo
 */
public class Fechamain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FechaService fecha = new FechaService();
        
        Date fechaNacimiento = fecha.fechaNacimiento();
        System.out.println(fechaNacimiento);
        
        Date fechaActual = fecha.fechaActual();
        System.out.println(fechaActual);
        
        int diferencia = fecha.diferencia(fechaNacimiento, fechaActual);
        /*System.out.println("La diferencia de años entre ambas fechas es de " + diferencia + " años.");*/
        System.out.println("La edad del usuario es de : "+ diferencia + " años.");
}
};