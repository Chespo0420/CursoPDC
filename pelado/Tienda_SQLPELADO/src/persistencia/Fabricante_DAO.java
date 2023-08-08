/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import entidades.Producto;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Kyouma
 */
public class Fabricante_DAO extends DAO {

    public List<String> mostrarProducto() throws Exception {
        List<String> nombreProducto = new ArrayList<>();

        try {
            String sql = "SELECT nombre FROM tienda.producto";
            consultarBase(sql);

            while (resultado.next()) {
                Producto producto = new Producto();
                producto.setNombre(resultado.getString("nombre"));
                nombreProducto.add(producto.getNombre());
            }
            return nombreProducto;

        } catch (Exception e) {
            desconectarBase();
            throw e;
        }

    }

    
    public ArrayList<Producto> Nom_precio() throws Exception {
        ArrayList<Producto> nombreProducto = new ArrayList<>();

        try {
            String sql = "SELECT nombre, precio FROM tienda.producto";
            consultarBase(sql);

            while (resultado.next()) {
                Producto producto = new Producto();
                producto.setNombre(resultado.getString("nombre"));
                producto.setPrecio(resultado.getDouble("precio"));
                nombreProducto.add(producto);

            }
            return nombreProducto;

        } catch (Exception e) {
            desconectarBase();
            throw e;
        }

    }
    public List<Double> mostrarPrecio() throws Exception {
        List<Double> nombreProducto = new ArrayList<>();

        try {
            String sql = "select precio from producto where precio between 120 and 202 ORDER BY precio ASC;";
            consultarBase(sql);

            while (resultado.next()) {
                Producto producto = new Producto();
                producto.setPrecio(resultado.getDouble("precio"));
                nombreProducto.add(producto.getPrecio());
            }
            return nombreProducto;

        } catch (Exception e) {
            desconectarBase();
            throw e;
        }

    }
    
    public List<String> mostrarPortatil() throws Exception {
        List<String> nombreProducto = new ArrayList<>();

        try {
            String sql = "select nombre from producto where nombre LIKE 'portatil%';";
            consultarBase(sql);

            while (resultado.next()) {
                Producto producto = new Producto();
                producto.setNombre(resultado.getString("nombre"));
                nombreProducto.add(producto.getNombre());
            }
            return nombreProducto;

        } catch (Exception e) {
            desconectarBase();
            throw e;
        }

    }
    public ArrayList<Producto> Nom_precioo() throws Exception {
        ArrayList<Producto> nombreProducto = new ArrayList<>();

        try {
            String sql = "select nombre, precio from producto order by precio ASC;";
            consultarBase(sql);

            while (resultado.next()) {
                Producto producto = new Producto();
                producto.setNombre(resultado.getString("nombre"));
                producto.setPrecio(resultado.getDouble("precio"));
                nombreProducto.add(producto);

            }
            return nombreProducto;

        } catch (Exception e) {
            desconectarBase();
            throw e;
        }

    }
    
    public void guardarProducto(Producto producto) throws Exception {
        try{
            if(producto == null){
                 throw new Exception("Debe indicar el producto");
            }
            
             String sql = "INSERT INTO producto (nombre, precio, codigo_fabricante) "
                    + "VALUES ( '" + producto.getNombre() + "' , '" + producto.getPrecio() + "' ," + producto.getCodigo_fabricante() + " );";
             
             
            insertarModificarEliminar(sql);
        }catch (Exception e){
            //desconectarBase();
        throw e;
        }
    }
    
    

}

