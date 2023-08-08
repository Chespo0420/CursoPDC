
package Mains;

import Identidades.Carta;
import Service.CartaServicio;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EjercicioPractico3 {

   
    public static void main(String[] args) {
        Carta card = new Carta();
        List<Carta> mazo = new ArrayList();
        List<Carta> monton = new ArrayList();
        CartaServicio serv = new CartaServicio();
        Scanner leer = new Scanner(System.in);

        boolean salir = false;

        System.out.println("MAZO DE CARTAS XD");
        serv.crearMazo(card, mazo);

        do {
            System.out.println(" 1- Barajar mazo.");
            System.out.println(" 2- Siguiente carta.");
            System.out.println(" 3- Ver cantidad de cartas disponibles.");
            System.out.println(" 4- Dar cartas.");
            System.out.println(" 5- Ver cartas del monton.");
            System.out.println(" 6- Ver cartas del mazo.");
            System.out.println(" 7- Salir.");
            int eleccion = leer.nextInt();

            switch (eleccion) {
                case 1 :
                    serv.barajar(mazo);
                case 2 :
                    serv.siguienteCarta(mazo, monton);
                case 3 :
                    serv.cartasDisponibles(mazo);
                case 4 :
                    serv.darCartas(mazo, monton);
                case 5 :
                    serv.cartasMonton(monton);
                case 6 :
                    serv.mostrarBaraja(mazo);
                case 7 :
                    salir = true;
                default :
                    System.out.println("La opcion ingresada no es valida.");
            }

        } while (!salir);
    }
}
