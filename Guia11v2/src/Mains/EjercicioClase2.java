/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Mains;

import Identidades.Equipo;
import Identidades.JugadorFut;
import java.util.ArrayList;

public class EjercicioClase2 {

    public static void main(String[] args) {
        JugadorFut jugador1 = new JugadorFut();
        JugadorFut jugador2 = new JugadorFut();
        JugadorFut jugador3 = new JugadorFut();
        JugadorFut jugador4 = new JugadorFut();
        Equipo Egg = new Equipo();
        ArrayList<JugadorFut> jugadores = new ArrayList();

        jugador1.setApellido("Waigel");
        jugador1.setNombre("Nahuel");
        jugador1.setNumero(5);
        jugador1.setPosicion("Delantero");
        jugadores.add(jugador1);

        jugador2.setApellido("Cardozo");
        jugador2.setNombre("Samuel");
        jugador2.setNumero(6);
        jugador2.setPosicion("Mediocampista");
        jugadores.add(jugador2);

        jugador3.setApellido("Chespo");
        jugador3.setNombre("gg");
        jugador3.setNumero(8);
        jugador3.setPosicion("Arquero");
        jugadores.add(jugador3);

        jugador4.setApellido("ff");
        jugador4.setNombre("ff");
        jugador4.setNumero(4);
        jugador4.setPosicion("Defensora");
        jugadores.add(jugador4);
        
        Egg.setJugadores(jugadores);
        
        ArrayList<JugadorFut> equipoEgg = new ArrayList(Egg.getJugadores());
        
        for (int i = 0; i < equipoEgg.size(); i++) {
            JugadorFut integrante = equipoEgg.get(i);
            System.out.println("Jugador #" + (i+1));
            System.out.println("Nombre: " + integrante.getNombre());
            System.out.println("Apellido: " + integrante.getApellido());
            System.out.println("Numero: " + integrante.getNumero());
            System.out.println("Posicion: " + integrante.getPosicion());
            System.out.println(" ");
        }
    }
}
