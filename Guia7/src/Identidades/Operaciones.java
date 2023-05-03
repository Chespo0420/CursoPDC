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
public class Operaciones {
    private int numero1;
    private int numero2;

    public Operaciones() {
    }

    public Operaciones(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public void crearOperacion() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar numero 1");
        this.setNumero1(leer.nextInt());
        System.out.println("Ingresar numero 2");
        this.setNumero2(leer.nextInt());
    }

    public int sumar() {
        return this.getNumero1() + this.getNumero2();
    }

    public int restar() {
        return this.getNumero1() - this.getNumero2();
    }

    public int multiplicar() {
        if (this.getNumero1() == 0 || this.getNumero2() == 0) {
            System.out.println("Error");
            return 0;
        } else {
            return this.getNumero1() * this.getNumero2();
        }
    }

    public int dividir() {
        if (this.getNumero1() == 0 || this.getNumero2() == 0) {
            System.out.println("Error");
            return 0;
        } else {
            return this.getNumero1() / this.getNumero2();
        }
    }
}
