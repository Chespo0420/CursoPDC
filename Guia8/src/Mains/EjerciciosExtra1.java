package Mains;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Servicios.RaicesService;

/**
 *
 * @author clavs
 */
public class EjerciciosExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        RaicesService ecuacion = new RaicesService();
        ecuacion.llenarEcuacion();
        ecuacion.calcular();
        
    }
    
}
