/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MAINS;

import Servicios.TiendaService;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Chespo
 */
public class TiendaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        HashMap<String, Double> producto = new HashMap();
        int resp;
        String confi = "n";
        TiendaService shop = new TiendaService();
        do {

            System.out.println("Ingrese la opcion deseada:");
            System.out.println("1)Agregar un producto");
            System.out.println("2)Modificar el precio de algun producto");
            System.out.println("3)Eliminar producto");
            System.out.println("4)Mostrar productos");
            System.out.println("5)Salir");
            resp = leer.nextInt();

            switch (resp) {
                case 1:
                    shop.CrearProducto(producto);

                    break;
                case 2:
                    shop.ModificarPrecio(producto);
                    break;
                case 3:
                    shop.EliminarProducto(producto);
                    break;
                case 4:
                    shop.MostrarProductos(producto);
                    break;
                case 5:
                    System.out.println("Esta seguro de salir del programa? (s/n)");
                    confi = leer.next();
                    break;
            }

        } while (!confi.equalsIgnoreCase("s"));
                
        
    }
    
}
