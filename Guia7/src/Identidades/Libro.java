
package Identidades;

import java.util.Scanner;

/**
 *
 * @author Chespo
 */
public class Libro {
    Scanner leer = new Scanner(System.in);
    public String ISBN;
    public String Titulo;
    public String Autor;
    public int Paginas;

    public Libro(String ISBN, String Titulo, String Autor, int Paginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Paginas = Paginas;
    }

    public Libro() {
        
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getPaginas() {
        return Paginas;
    }

    public void setPaginas(int Paginas) {
        this.Paginas = Paginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", Titulo=" + Titulo + ", Autor=" + Autor + ", Paginas=" + Paginas + '}';
    }
    
    public void CrearLibro (){
        
        System.out.println("Ingrese El ISBN :");
        this.setISBN(leer.next());
        System.out.println("Ingrese El Titulo : ");
        this.setTitulo(leer.next());
        System.out.println("Ingrese El Autor : ");
        this.setAutor(leer.next());
        System.out.println("Ingrese Total de Paginas : ");
        this.setPaginas(leer.nextInt());
    }
    
public void Mostrar(){
    System.out.println(this.toString());
    
}  
}
