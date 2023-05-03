package Mains;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Servicios.NIFService;

/**
 *
 * @author clavs
 */
public class EjerciciosExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NIFService nif = new NIFService();
        nif.crearNIF();
        nif.mostrarNIF();
    }
    
}
