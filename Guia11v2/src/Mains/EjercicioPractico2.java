/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Mains;

import Identidades.Juego;
import Identidades.Revolver;
import Service.JuegoServicio;
import Service.JugadorServicio;
import Service.RevolverServicio;


public class EjercicioPractico2 {

    public static void main(String[] args) {
        
        Revolver rev = new Revolver();
        RevolverServicio revServ = new RevolverServicio();
        JugadorServicio jugServ = new JugadorServicio();
        Juego juego = new Juego();
        JuegoServicio juegServ = new JuegoServicio();
        
        juegServ.ronda(revServ, rev, jugServ, juego);
    }
}
