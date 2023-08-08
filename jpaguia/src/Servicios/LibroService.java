/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Libro;
import Entidades.Autor;
import Entidades.Editorial;
import Persistencia.ControlP;
import Persistencia.LibroJpaController;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.Scanner;

public class LibroService {

    private LibroJpaController ljc = new LibroJpaController();
    private AutorService auserv = new AutorService();
    private EditorialService editserv = new EditorialService();

    public LibroService() {
    }
//// private Long isbn;
//    private String titulo;
//    private Integer anio;
//    private Integer ejemplares;
//    private Integer ejemplaresPrestados;
//    private Integer ejemplaresRestantes;
//    private boolean alta;//

    public void crearLibro() throws NonexistentEntityException {
        Scanner leer = new Scanner(System.in);
        Libro libro = new Libro();

        System.out.println("ISBN:");
        libro.setIsbn(leer.nextLong());
        System.out.println("Titulo");
        libro.setTitulo(leer.next());
        System.out.println("Año");
        libro.setAnio(leer.nextInt());
        System.out.println("Ejemplares");
        libro.setEjemplares(leer.nextInt());
        System.out.println("Ejemplares Prestados");
        libro.setEjemplaresPrestados(leer.nextInt());
        System.out.println("Ejemplares Restantes");
        libro.setEjemplaresRestantes(leer.nextInt());
        System.out.println("Alta:");
        libro.setAlta(leer.nextBoolean());
        

        System.out.println("-------------------------------");
        System.out.println("Ingrese el Autor del libro:");
        System.out.println("¿El autor ya esta cargado?");
        String rta = leer.next();
        if (rta.equalsIgnoreCase("si")) {
            System.out.println("Ingrese ID del autor");
            libro.setAutor(auserv.obtenerAutor(leer.nextInt()));

        } else {
            System.out.println("Crear autor:");
            Autor autorNuevo = auserv.crearAutor();
            libro.setAutor(autorNuevo);
        }

//        System.out.println("Autor");
//        libro.setAutor(auserv.crearAutor(leer.next()));
        System.out.println("-------------------------------");
        System.out.println("Ingrese la Editorial del Libro");
        System.out.println("La Editorial ya esta cargada?");
        String rta2 = leer.next();
        if (rta2.equalsIgnoreCase("si")) {
            System.out.println("Ingrese ID de la Editorial");
            libro.setEditorial(editserv.obtenerEditorial(leer.nextInt()));

        } else {
            System.out.println("Crear Editorial:");
            Editorial editorialnueva = editserv.crearEditorial();
            libro.setEditorial(editorialnueva);
            
        }
        ljc.create(libro);

    }

    public void editarLibro(Libro libro) throws NonexistentEntityException {
        try {
            ljc.edit(libro);
        } catch (Exception ex) {
            
        }
    }

    public void eliminarLibro(Integer id) throws NonexistentEntityException {
        try {
            ljc.destroy(id);
        } catch (NonexistentEntityException ex) {
            
        }
    }

    public Libro obtenerLibro(Integer id) throws NonexistentEntityException {

        return ljc.findLibro(id);
    }

    public List<Libro> obtenerTodosLosLibros() throws NonexistentEntityException {
        return ljc.findLibroEntities();
    }

    public int contarLibros() throws NonexistentEntityException {
        return ljc.getLibroCount();
    }

}
