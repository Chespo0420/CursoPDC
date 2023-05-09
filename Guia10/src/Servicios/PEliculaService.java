/*
• Mostrar en pantalla todas las películas.+
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package Servicios;

import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Chespo
 */
public class PEliculaService {

    public void cargarPelicula(ArrayList<Pelicula> pelis) {
        Scanner leer = new Scanner(System.in);
        do {

            Pelicula p1 = new Pelicula();
            System.out.println("Ingrese el Título de la Pelicula ");
            p1.setTitulo(leer.nextLine());
            System.out.println("Ingrese el Director de la Película");
            p1.setDirector(leer.nextLine());
            System.out.println("Ingrese la Duración de la Película(HS)");
            p1.setDuracion(leer.nextDouble());
            System.out.println("Quiere ingresar otra Pelicula? ingrese (S/N)");
            leer.nextLine();
            pelis.add(p1);
        } while (leer.nextLine().equalsIgnoreCase("s"));

    }

    public void mostrarPelis(ArrayList<Pelicula> pelis) {
        System.out.println(pelis);
    }

    public void duracionPelis(ArrayList<Pelicula> pelis) {
        boolean bandera=false;
        System.out.println("A continuacion las Peliculas de mayor duracion");
        for (Pelicula peli : pelis) {
            if (peli.getDuracion() > 1) {
                bandera = true;
                System.out.println("Pelicula: " + peli.getTitulo() + ", -Director: " + peli.getDirector() + ", -Duracion :" + peli.getDuracion());
            }
        }
        if(!bandera)
        System.out.println("No se encontro");
    }
    
    public static Comparator<Pelicula>compelis = new Comparator<Pelicula>(){
        
        @Override
        public int compare(Pelicula p1,Pelicula p2){
            return p1.getDuracion().compareTo(p2.getDuracion());
        }
    }; 

    public void ordenar(ArrayList<Pelicula>pelis){
        Collections.sort(pelis,compelis);
        /*Collections.reverse(pelis);*/
        System.out.println("pelis: "+pelis);
    }
    public void ordenarTitulo(ArrayList<Pelicula>pelis){
        
    }
 }