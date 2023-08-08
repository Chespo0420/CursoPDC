/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Identidades.Revolver;


public class RevolverServicio {

    public void llenarRevolver(Revolver rev) {
        rev.setPosicionActual((int) (Math.random() * 6 + 1));
        rev.setPosicionDisparo((int) (Math.random() * 6 + 1));
        System.out.println("Revolver cargado!");
    }

    public boolean disparar(Revolver rev) {
        boolean disparo = false;
        if (rev.getPosicionActual() == rev.getPosicionDisparo()) {
            disparo = true;
            System.out.println("PIUM PIUM!");
        }
        return disparo;
    }

    public void siguienteDisparo(Revolver rev) {
        int disparo = rev.getPosicionActual();
        if (disparo != 6) {
            disparo++;
        } else {
            disparo = 1;
        }
        rev.setPosicionActual(disparo);
    }

    public void info(Revolver rev) {
        System.out.println("Posicion actual: " + rev.getPosicionActual());
        System.out.println("Posicion de la bala: " + rev.getPosicionDisparo());
    }
}
