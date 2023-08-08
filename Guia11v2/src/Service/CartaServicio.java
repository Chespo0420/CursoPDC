/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Identidades.Carta;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class CartaServicio {

    Scanner leer = new Scanner(System.in);

    public void crearMazo(Carta card, List<Carta> mazo) {
        for (int i = 1; i < 13; i++) {
            if (i != 8 && i != 9) {
                card = new Carta(i, "espadas");
                mazo.add(card);
            }
        }
        for (int i = 1; i < 13; i++) {
            if (i != 8 && i != 9) {
                card = new Carta(i, "bastos");
                mazo.add(card);
            }
        }
        for (int i = 1; i < 13; i++) {
            if (i != 8 && i != 9) {
                card = new Carta(i, "oros");
                mazo.add(card);
            }
        }
        for (int i = 1; i < 13; i++) {
            if (i != 8 && i != 9) {
                card = new Carta(i, "copas");
                mazo.add(card);
            }
        }
    }

    public void barajar(List<Carta> mazo) {
        Collections.shuffle(mazo);
        System.out.println("Mazo mezclado!");
    }

    public void siguienteCarta(List<Carta> mazo, List<Carta> monton) {
        Carta card = mazo.get(0);
        System.out.println("Carta repartida: ");
        System.out.println(card.toString());
        monton.add(card);
        mazo.remove(0);
    }

    public void cartasDisponibles(List<Carta> mazo) {
        System.out.println("Quedan " + mazo.size() + " cartas en el mazo.");
    }

    public void darCartas(List<Carta> mazo, List<Carta> monton) {
        System.out.println("Ingrese la cantidad de cartas a dar:");
        int cartas = leer.nextInt();
        if (cartas <= mazo.size()) {
            System.out.println("Cartas dadas:");
            for (int i = 0; i < cartas; i++) {
                Carta card = mazo.get(0);
                System.out.println(card.toString());
                monton.add(card);
                mazo.remove(0);
            }
        } else {
            System.out.println("No hay suficientes cartas para dar.");
        }
    }
    
    public void cartasMonton(List<Carta> monton){
        if ( !monton.isEmpty()){
            System.out.println("Cartas en el monton:");
            for (int i = 0; i < monton.size(); i++) {
                Carta card = monton.get(i);
                System.out.println(card.toString());
            }
        } else {
            System.out.println("El monton esta vacío.");
        }
    }
    
    public void mostrarBaraja(List<Carta> mazo){
        if ( !mazo.isEmpty()){
            System.out.println("Cartas en el mazo:");
            for (int i = 0; i < mazo.size(); i++) {
                Carta card = mazo.get(i);
                System.out.println(card.toString());
            }
        } else {
            System.out.println("El monton esta vacío.");
        }
    }
    
}
