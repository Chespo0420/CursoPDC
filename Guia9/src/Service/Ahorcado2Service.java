/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Objetos.Ahorcado;

import java.util.Scanner;


/**
 *
 * @author Chespo
 */
public class Ahorcado2Service {
     Scanner leer = new Scanner(System.in);
    Ahorcado juego = new Ahorcado();

    public void crearJuego() {
        System.out.println("Ingrese la palabra secreta:");
        String palabra = leer.nextLine();
        juego.setLongitud(palabra.length());

        String[] game = new String[palabra.length()];

        for (int i = 0; i < palabra.length(); i++) {
            game[i] = palabra.substring(i, i + 1);
        }

        juego.setPalabra(game);
        juego.setLetrasEncontradas(0);
        System.out.println("Ingrese la cantidad de jugadas maximas:");
        juego.setIntentos(leer.nextInt());
    }

    public void mostrarLongitud() {
        System.out.println("La longitud de la palabra es de " + juego.getPalabra().length + " letras.");
    }

    public boolean buscarLetra(String letra, int i) {

        String[] game = juego.getPalabra();
        boolean encontrada = false;

        if (letra.equalsIgnoreCase(game[i])) {
            encontrada = true;
        }

        return encontrada;
    }

    public boolean encontradas(String letra) {
        boolean encontrada = false;
        for (int i = 0; i < juego.getPalabra().length; i++) {
            if (buscarLetra(letra, i)) {
                juego.setLetrasEncontradas(juego.getLetrasEncontradas() + 1);
                encontrada = true;
            }
        }
        if (!encontrada) {
            juego.setIntentos(juego.getIntentos() - 1);
        }
        System.out.println("Letras encontradas / faltantes: " + "(" + juego.getLetrasEncontradas() + " / " + (juego.getLongitud() - juego.getLetrasEncontradas()) + ")");
        intentos();
        return encontrada;
    }

    public void intentos() {
        System.out.println("Intentos restantes: " + juego.getIntentos());
    }

    public void juego() {

        System.out.println("Juego: Ahorcado!");
        crearJuego();
        leer.nextLine();

        do {
            System.out.println("Ingrese una letra:");
            String letra = leer.nextLine();
            if (encontradas(letra)) {
                System.out.println("La letra pertenece a la palabra!");
            } else {
                System.out.println("La letra NO pertenece a la palabra.");
            }

        } while (juego.getIntentos() != 0 && juego.getLetrasEncontradas() != juego.getLongitud());

        if (juego.getIntentos() == 0) {
            System.out.println("PERDISTE :(");
        } else {
            System.out.println("GANASTE :D!!!");
        }

    }

}
