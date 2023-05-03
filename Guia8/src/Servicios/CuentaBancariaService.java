/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Objetos.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author clavs
 */
public class CuentaBancariaService {

    Scanner leer = new Scanner(System.in);
    CuentaBancaria cuenta1 = new CuentaBancaria();

    public void crearCuenta() {

        System.out.println("Ingrese el numero de cuenta:");
        int num = leer.nextInt();
        cuenta1.setNumeroDeCuenta(num);

        System.out.println("Ingrese su DNI:");
        long dni = leer.nextInt();
        cuenta1.setDni(dni);

        System.out.println("Ingrese el saldo actual de la cuenta:");
        int saldo = leer.nextInt();
        cuenta1.setSaldoActual(saldo);

    }

    public void ingresar(int dinero) {
        cuenta1.setSaldoActual(cuenta1.getSaldoActual() + dinero);
    }

    public void retirar(int dinero) {

        if (cuenta1.getSaldoActual() - dinero <= 0) {
            cuenta1.setSaldoActual(0);
        } else {
            cuenta1.setSaldoActual(cuenta1.getSaldoActual() - dinero);
        }

    }

    public void extraccionRapida() {

        System.out.println("Puede retirar hasta un 20% del dinero, cuanto desea retirar?");
        int dinero = leer.nextInt();

        if (dinero <= cuenta1.getSaldoActual() * 0.20) {
            cuenta1.setSaldoActual(cuenta1.getSaldoActual() - dinero);
        } else {
            System.out.println("No se puede retirar mas del 20%");
        }

    }

    public int consultarSaldo() {
        return cuenta1.getSaldoActual();
    }

    public void consultarDatos() {
        System.out.println("Numero de cuenta: " + cuenta1.getNumeroDeCuenta());
        System.out.println("DNI del usuario: " + cuenta1.getDni());
        System.out.println("Saldo actual: " + cuenta1.getSaldoActual());
    }
}
