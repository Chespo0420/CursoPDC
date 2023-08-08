/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Identidades.Cine;
import Identidades.Espectador;
import Identidades.Pelicula;
import Identidades.Sala;


public class CineService {

    public void crearEspectadores(Cine cine) {

        

        for (int i = 0; i < 40; i++) {
            boolean sentado = false;
            Espectador es = new Espectador(i);
            boolean[][] asientos = cine.getSala().get(0).getAsientos();
            if (es.getDinero() >= cine.getPrecio()) {
                if (es.getEdad() >= cine.getSala().get(0).getPelicula().getEdadMinima()) {
                    while (!sentado) {
                        int filas = (int) (Math.random() * 8);
                        int columnas = (int) (Math.random() * 6);
                        if (!asientos[filas][columnas]) {
                            sentado = true;
                            asientos[filas][columnas] = true;

                        }
                    }
                }
                cine.getSala().get(0).setAsientos(asientos);
            }
        }
    }

    public Sala crearSala(Cine cine) {
        boolean[][] asientos = new boolean[8][6];
        Pelicula peli = new Pelicula();
        Sala sala = new Sala(asientos, peli);
        return sala;
    }

    public Cine crearCine() {
        Cine cine = new Cine();
        Sala sala = crearSala(cine);
        cine.getSala().add(sala);
        return cine;
    }

    public void mostrar(Cine cine) {

        boolean[][] a = cine.getSala().get(0).getAsientos();
        System.out.println("CINEEEEEEE");
        
        for (int i = 7; i >= 0; i--) {
            for (int j = 0; j < 6; j++) {
                switch (j) {
                    case 1 : {
                        System.out.print("  |  ");
                        if (a[i][j]) {
                            System.out.print((i + 1) + "A" + "X");
                        } else {
                            System.out.print((i + 1) + "A" + " ");
                        }
                        System.out.print("  |  ");
                    }
                    case 2 : {
                        System.out.print("  |  ");
                        if (a[i][j]) {
                            System.out.print((i + 1) + "B" + "X");
                        } else {
                            System.out.print((i + 1) + "B" + " ");
                        }
                        System.out.print("  |  ");
                    }
                    case 3 : {
                        System.out.print("  |  ");
                        if (a[i][j]) {
                            System.out.print((i + 1) + "C" + "X");
                        } else {
                            System.out.print((i + 1) + "C" + " ");
                        }
                        System.out.print("  |  ");
                    }
                    case 4 : {
                        System.out.print("  |  ");
                        if (a[i][j]) {
                            System.out.print((i + 1) + "D" + "X");
                        } else {
                            System.out.print((i + 1) + "D" + " ");
                        }
                        System.out.print("  |  ");
                    }
                    case 5 : {
                        System.out.print("  |  ");
                        if (a[i][j]) {
                            System.out.print((i + 1) + "E" + "X");
                        } else {
                            System.out.print((i + 1) + "E" + " ");
                        }
                        System.out.print("  |  ");
                    }
                    case 6 : {
                        System.out.print("  |  ");
                        if (a[i][j]) {
                            System.out.print((i + 1) + "F" + "X");
                        } else {
                            System.out.print((i + 1) + "F" + " ");
                        }
                        System.out.print("  |  ");
                    }
                }
            }
            System.out.println("");
        }
    }
}
