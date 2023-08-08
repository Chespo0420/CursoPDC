/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Televisor;
import java.util.Scanner;

/**
 *
 * @author Chespo
 */
public class TelevisorServicio extends ServicioElectrodomestico {

    public Televisor crearTelevisor() {

        Televisor televisor = (Televisor) crearElectrodomestico(new Televisor());

        System.out.println("ingrese las resolucion de el Televisor");
        televisor.setResolucion(new Scanner(System.in).nextInt());
        System.out.println("tiene incorporado un sintetizador?");
        televisor.setSintonizador(leer.nextBoolean());
        return televisor;
    }

}
