/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Identidades.Juego;
import Identidades.JugadorV;
import Identidades.Revolver;
import java.util.ArrayList;
import java.util.Scanner;


public class JuegoServicio {
    
    Scanner leer = new Scanner(System.in);
    
    public void llenarJuego(ArrayList<JugadorV> jugadores, Revolver rev){
        Juego juego = new Juego();
        juego.setJugadores(jugadores);
        juego.setRev(rev);
    }
    
    public void ronda(RevolverServicio revServ, Revolver rev, JugadorServicio jugServ, Juego juego){
        
        JugadorV j1 = new JugadorV(1, "Nahuel", true);
        JugadorV j2 = new JugadorV(2, "Maxi", true);
        JugadorV j3 = new JugadorV(3, "Lucas", true);
        JugadorV j4 = new JugadorV(4, "Santiago", true);
        JugadorV j5 = new JugadorV(5, "Carlos", true);
        JugadorV j6 = new JugadorV(6, "Ramiro", true);
        Juego entrada = new Juego();
        ArrayList<JugadorV> j = entrada.getJugadores();
        j.add(j1);
        j.add(j2);
        j.add(j3);
        j.add(j4);
        j.add(j5);
        j.add(j6);
        entrada.setJugadores(juego.getJugadores());
        
        llenarJuego(juego.getJugadores(), rev);
        
        revServ.llenarRevolver(rev); 
        int contador = 0;
        JugadorV player;
        System.out.println("Comienza el juego O_o !!!");
        do{
            System.out.println("Juega el Jugador " + j.get(contador).getNombre() + " #" + j.get(contador).getId());
            player = j.get(contador);
            contador++;
            revServ.info(rev);
            leer.nextLine();
        }while(!jugServ.disparo(rev, revServ, player));
        
        
    }
}
