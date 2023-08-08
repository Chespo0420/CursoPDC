package servicios;

import entidades.Producto;
import java.util.Scanner;
import persistencia.Fabricante_DAO;

/**
 *
 * @author Kyouma
 */
public class Producto_Servicio {
Fabricante_DAO fabricante_DAO = new Fabricante_DAO();

    public void Nombre_Producto() throws Exception {

        System.out.print("Nombre Productos: " + fabricante_DAO.mostrarProducto());
    }

    
    public void Nom_precio() throws Exception {
        System.out.print("Nombre, precio: " + fabricante_DAO.Nom_precio());
    }
    
    public void mostrarPrecio() throws Exception {
       System.out.print("Nombre Productos: " + fabricante_DAO.mostrarPrecio());
    }
    
    public void mostrarPortatil() throws Exception {
        System.out.print("Nombre Productos: " + fabricante_DAO.mostrarPortatil());
    }
    
    public void Nom_precioo() throws Exception {
        System.out.print("Nombre, precio: " + fabricante_DAO.Nom_precioo());
    }
    
    
     public void crearProducto() throws Exception {
        Scanner leer = new Scanner(System.in);
        Producto producto1 = new Producto();

        try {
            System.out.println("Ingrese un nombre de producto");
            producto1.setNombre(leer.next());
            
            if(producto1.getNombre() == null){  
                throw new Exception("Debe indicar el nombre");
            }
            
            System.out.println("Ingrese un precio de producto");
            producto1.setPrecio(leer.nextDouble());
            
            if(producto1.getPrecio() == 0){     
                throw new Exception("Debe indicar el precio");
            }
            
            System.out.println("Ingrese un codigo_fabricante de producto");
            producto1.setCodigo_fabricante(leer.nextInt());
            
            if(producto1.getCodigo_fabricante() == 0){   
                throw new Exception("Debe indicar el codigo_fabricante");
            }
            fabricante_DAO.guardarProducto(producto1);
            

        } catch (Exception e) {            
            throw e;
            
        }

    }
}
