/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Identidades;

import java.util.Scanner;

/**
 *
 * @author Chespo
 */
public class Cuenta {

    private int saldo, retiro;
    private String titular, opc;
    Scanner leer = new Scanner(System.in);

    public Cuenta() {

    }

    public Cuenta(int saldo, int retiro, String titular) {
        this.saldo = saldo;
        this.retiro = retiro;
        this.titular = titular;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Scanner getLeer() {
        return leer;
    }

    public int getRetiro() {
        return retiro;
    }

    public void setRetiro(int retiro) {
        this.retiro = retiro;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public void Retirar_Dinero() {
        System.out.println("Ingrese Nombre del Titular de la Cuenta");
        this.setTitular(leer.next());
        System.out.println("Cuanto dinero Tiene en la Cuenta");
        this.setSaldo(leer.nextInt());
        do {
            System.out.println("Cuanto dinero desea Retirar?");
            this.setRetiro(leer.nextInt());
            if (this.saldo >= this.retiro) {
                this.saldo -= this.retiro;
                System.out.println("Extraccion de : " + this.retiro + "$ Completada");
                System.out.println("su Nuevo Saldo es de  " + this.getSaldo());

            } else {
                System.out.println("Saldo Insuficiente");
                System.out.println("El Saldo  disponible  es de : " + saldo);
            }
            System.out.println("Desea hacer Otra Operacion?(S/N)");
            this.opc = leer.next();

            if (!opc.equalsIgnoreCase("S") && !opc.equalsIgnoreCase("N")) {
                do {
                    System.out.println("Ingrese una Opcion Valida (S o N)carajo!!!");
                    this.opc = leer.next();
                } while (!opc.equalsIgnoreCase("S") && !opc.equalsIgnoreCase("N"));
            }
        } while (!opc.equalsIgnoreCase("N"));
    }
}
