/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jpaguia;

import java.util.Scanner;
import Entidades.Autor;
import Entidades.Editorial;
import Entidades.Libro;
import Persistencia.ControlP;
import Servicios.AutorService;
import Servicios.EditorialService;
import Servicios.LibroService;
import Persistencia.exceptions.NonexistentEntityException;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Chespo
 */
public class Jpaguia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NonexistentEntityException {
        Scanner leer = new Scanner(System.in);
        ControlP cp = new ControlP();
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaguiaPU");
        
        LibroService libroService = new LibroService();
        AutorService autorService = new AutorService();
        EditorialService editorialService = new EditorialService();
        

        boolean salir = false;

        while (!salir) {
            System.out.println("Menú:");
            System.out.println("1. Crear autor");
            System.out.println("2. Editar autor");
            System.out.println("3. Eliminar autor");
            System.out.println("4. Obtener autor");
            System.out.println("5. Crear editorial");
            System.out.println("6. Editar editorial");
            System.out.println("7. Eliminar editorial");
            System.out.println("8. Obtener editorial");
            System.out.println("9. Crear libro");
            System.out.println("10. Editar libro");
            System.out.println("11. Eliminar libro");
            System.out.println("12. Obtener libro");
            System.out.println("0. Salir");

            System.out.print("Ingrese una opción: ");
            int opcion = leer.nextInt();

            switch (opcion) {
                case 0:
                    salir = true;
                    break;
                case 1:
                 
                    // Establecer los atributos del autor
                    try {
                        autorService.crearAutor();
                        System.out.println("Autor creado exitosamente.");
                    } catch (NonexistentEntityException e) {
                        System.out.println("Error al crear el autor.");
                    }
                    
                    break;
                case 2:
                    Autor autorEditar = new Autor();
                    // Establecer los atributos del autor a editar
                    try {
                        autorService.editarAutor(autorEditar);
                        System.out.println("Autor editado exitosamente.");
                    } catch (NonexistentEntityException e) {
                        System.out.println("Error al editar el autor.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el ID del autor a eliminar: ");
                    int idAutorEliminar = leer.nextInt();
                    try {
                        autorService.eliminarAutor(idAutorEliminar);
                        System.out.println("Autor eliminado exitosamente.");
                    } catch (NonexistentEntityException e) {
                        System.out.println("Error al eliminar el autor.");
                    }
                    break;
                case 4:
                    System.out.print("Ingrese el ID del autor a obtener: ");
                    int idAutorObtener = leer.nextInt();
                    try {
                        Autor autorObtenido = autorService.obtenerAutor(idAutorObtener);
                        // Hacer algo con el autor obtenido
                        System.out.println("Autor obtenido exitosamente.");
                    } catch (NonexistentEntityException e) {
                        System.out.println("Error al obtener el autor.");
                    }
                    break;
                case 5:
                    

                    try {
                        editorialService.crearEditorial();
                        System.out.println("Editorial creada exitosamente.");
                    } catch (NonexistentEntityException e) {
                        System.out.println("Error al crear la editorial.");
                    }
                    break;
                case 6:
                    Editorial editorialEditar = new Editorial();
                    // Establecer los atributos de la editorial a editar
                    try {
                        editorialService.editarEditorial(editorialEditar);
                        System.out.println("Editorial editada exitosamente.");
                    } catch (NonexistentEntityException e) {
                        System.out.println("Error al editar la editorial.");
                    }
                    break;
                case 7:
                    System.out.print("Ingrese el ID de la editorial a eliminar: ");
                    int idEditorialEliminar = leer.nextInt();
                    try {
                        editorialService.eliminarEditorial(idEditorialEliminar);
                        System.out.println("Editorial eliminada exitosamente.");
                    } catch (NonexistentEntityException e) {
                        System.out.println("Error al eliminar la editorial.");
                    }
                    break;
                case 8:
                    System.out.print("Ingrese el ID de la editorial a obtener: ");
                    int idEditorialObtener = leer.nextInt();
                    try {
                        Editorial editorialObtenida = editorialService.obtenerEditorial(idEditorialObtener);
                        // Hacer algo con la editorial obtenida
                        System.out.println(editorialObtenida.toString());
                        System.out.println("Editorial obtenida exitosamente.");
                    } catch (NonexistentEntityException e) {
                        System.out.println("Error al obtener la editorial.");
                    }
                    break;
                case 9:
            
                    try {
                        libroService.crearLibro();
                        System.out.println("Libro creado exitosamente.");
                    } catch (NonexistentEntityException e) {
                        System.out.println("Error al crear el libro.");
                    }
                    break;
                case 10:
                    Libro libroEditar = new Libro();
                    // Establecer los atributos del libro a editar
                    try {
                        libroService.editarLibro(libroEditar);
                        System.out.println("Libro editado exitosamente.");
                    } catch (NonexistentEntityException e) {
                        System.out.println("Error al editar el libro.");
                    }
                    break;
                case 11:
                    System.out.print("Ingrese el ID del libro a eliminar: ");
                    int idLibroEliminar = leer.nextInt();
                    try {
                        libroService.eliminarLibro(idLibroEliminar);
                        System.out.println("Libro eliminado exitosamente.");
                    } catch (NonexistentEntityException e) {
                        System.out.println("Error al eliminar el libro.");
                    }
                    break;
                case 12:
                    System.out.print("Ingrese el ID del libro a obtener: ");
                    int idLibroObtener = leer.nextInt();
                    try {
                        Libro libroObtenido = libroService.obtenerLibro(idLibroObtener);
                        // Hacer algo con el libro obtenido
                        System.out.println("Libro obtenido exitosamente.");
                        System.out.println(libroObtenido);
                    } catch (NonexistentEntityException e) {
                        System.out.println("Error al obtener el libro.");
                    }
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }
    }
}
