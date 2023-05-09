/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Tienda;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Chespo
 */
public class TiendaService {

    public void CrearProducto(HashMap<String, Double> producto) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        do {
            Tienda tienda = new Tienda();
            System.out.println("Ingrese un Articulo");
            tienda.setArticulo(leer.next());
            System.out.println("Ingrese su Precio");
            tienda.setPrecio(leer.nextDouble());
            producto.put(tienda.getArticulo(), tienda.getPrecio());
            System.out.println("Quiere ingresar otro Producto? ingrese (S/N)");
            leer.nextLine();
        } while (leer.nextLine().equalsIgnoreCase("s"));

    }

    public void ModificarPrecio(HashMap<String, Double> producto) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el producto a Cambiar de Precio");
        String p1 = leer.next();
        if (producto.containsKey(p1)) {
            System.out.println("Ingrese el Precio Actual");
            Double pre1 = leer.nextDouble();
            producto.put(p1, pre1);
        } else {
            System.out.println("El producto Ingresado es inexistente");
        }
    }

    public void EliminarProducto(HashMap<String, Double> producto) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el producto a eliminar");
        String p1 = leer.next();
        if (producto.containsKey(p1)) {
            producto.remove(p1);
        } else {
            System.out.println("Producto Inexistente");
        }
    }

    public void MostrarProductos(HashMap<String, Double> producto) {
        for (String aux : producto.keySet()) {
            System.out.println(aux + " Precio : $ " + producto.get(aux));

        }
    }

}
