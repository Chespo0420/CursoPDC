/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Objetos.Pardenumeros;

/**
 *
 * @author Chespo
 */
public class PardenumerosService {

    private double numeros;
    private double numMayor = 0;
    private double numMenor = 0;

    public Pardenumeros rellenar() {
        Pardenumeros numeros = new Pardenumeros();
        numeros.setNum1(Math.random() * 10);
        numeros.setNum2(Math.random() * 10);
        return numeros;
    }

    public void mostrarValores(Pardenumeros numero) {
        System.out.println("numero 1 = " + numero.getNum1());
        System.out.println("numero 2 = " + numero.getNum2());
    }

    public double devolverMayor(Pardenumeros numero) {

        if (numero.getNum1() > numero.getNum2()) {
            numMayor = numero.getNum1();
            numMenor = numero.getNum2();
            System.out.println("El mayor es: " + numero.getNum1());
        } else {
            numMayor = numero.getNum2();
            numMenor = numero.getNum1();
            System.out.println("El mayor es: " + numero.getNum2());
        }

        return numMayor;
    }

    public double calcularPotencia(Pardenumeros numero) {
        double mayor = Math.round(this.numMayor);
        double menor = Math.round(this.numMenor);

        return Math.pow(mayor, menor);

    }

    public double calcularRaiz(Pardenumeros numero) {
        double mayor = Math.abs(this.numMayor);
        double menor = Math.abs(this.numMenor);
        return Math.sqrt(menor);
    }

}
