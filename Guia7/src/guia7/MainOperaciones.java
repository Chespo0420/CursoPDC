/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7;

import Identidades.Operaciones;

/**
 *
 * @author Chespo
 */
public class MainOperaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operaciones operacion = new Operaciones();
        operacion.crearOperacion();
        System.out.println("Suma: "+ operacion.sumar());
        System.out.println("Resta: "+ operacion.restar());
        System.out.println("Multiplicacion: "+ operacion.multiplicar());
        System.out.println("Dividir: "+ operacion.dividir());
    }
    
}
