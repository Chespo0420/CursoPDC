/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MAINS;

import Entidades.Pelicula;
import Servicios.PEliculaService;
import java.util.ArrayList;

/**
 *
 * @author Chespo
 */
public class PeliculaMain {

    public static void main(String[] args) {
        ArrayList<Pelicula> pelis = new ArrayList();

        PEliculaService pes = new PEliculaService();
        pes.cargarPelicula(pelis);
        pes.mostrarPelis(pelis);
        pes.duracionPelis(pelis);
        pes.ordenar(pelis);
    }

}
