/*
 * Desarrollar una clase Cancion con los siguientes atributos: título y autor. 
Se deberá definir además dos constructores: uno vacío que inicializa el título 
y el autor a cadenas vacías y otro que reciba como parámetros el título y el autor de la canción. 
Se deberán además definir los métodos getters y setters correspondientes.

 */
package Identidades;

import java.util.Scanner;

/**
 *
 * @author Chespo
 */
public class Cancion {
    private String Autor;
    private String Titulo;
 public Cancion(){
        
    }
    public Cancion(String Autor, String Titulo) {
        this.Autor = Autor;
        this.Titulo = Titulo;
    }
   public void CrearCancion(){
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese el Nombre de La Cancion ");
       this.setTitulo(leer.nextLine());
       System.out.println("Ingrese el Nombre del Autor ");
       this.setAutor(leer.nextLine());
       
   }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    @Override
    public String toString() {
        return "Cancion{" + "Autor=" + Autor + ", Titulo=" + Titulo + '}';
    }
    
    
    
    
}
