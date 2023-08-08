/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Libro;
import Entidades.Autor;
import Entidades.Editorial;
import Persistencia.EditorialJpaController;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.Scanner;

public class EditorialService {
    
    private EditorialJpaController ejc = new EditorialJpaController();

    public EditorialService() {
    }
    
    public Editorial crearEditorial() throws NonexistentEntityException{
         Scanner leer = new Scanner(System.in);
        Editorial editorial = new Editorial();
        System.out.println("Nombre de la Editorial:");
        editorial.setNombre(leer.next());
        System.out.println("Alta:");
        editorial.setAlta(leer.nextBoolean());
        ejc.create(editorial);
        return editorial;
    }
    
    public void editarEditorial(Editorial editorial) throws NonexistentEntityException{
        try {
            ejc.edit(editorial);
        } catch (Exception ex) {
            
        }
    }
    
    public void eliminarEditorial(Integer id) throws NonexistentEntityException{
        try {
            ejc.destroy(id);
        } catch (NonexistentEntityException ex) {

        }
    }
    
    public Editorial obtenerEditorial(Integer id)throws NonexistentEntityException {
        return ejc.findEditorial(id);
    }
    
    public List<Editorial> obtenerTodasLasEditoriales()throws NonexistentEntityException {
        return ejc.findEditorialEntities();
    }
    
    public int contarEditoriales()throws NonexistentEntityException{
        return ejc.getEditorialCount();
    }
    
    
    
}
