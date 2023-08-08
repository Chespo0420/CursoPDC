/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Libro;
import Entidades.Autor;
import Entidades.Editorial;
import Persistencia.AutorJpaController;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.Scanner;

public class AutorService {

    private AutorJpaController ajc = new AutorJpaController();

    public AutorService() {
    }

    public Autor crearAutor() throws NonexistentEntityException {
        Scanner leer = new Scanner(System.in);
        Autor autor = new Autor();
        System.out.println("Nombre del Autor:");
        autor.setNombre(leer.next());
        System.out.println("Alta:");
        autor.setAlta(leer.nextBoolean());
        ajc.create(autor);
        return autor;
        
    }

    public void editarAutor(Autor autor) throws NonexistentEntityException {
        try {
            ajc.edit(autor);
        } catch (Exception ex) {
           
        }
    }

    public void eliminarAutor(Integer id) throws NonexistentEntityException {
        try {
            ajc.destroy(id);
        } catch (NonexistentEntityException ex) {
            
        }
    }

    public Autor obtenerAutor(Integer id) throws NonexistentEntityException {
        return ajc.findAutor(id);
    }

}
