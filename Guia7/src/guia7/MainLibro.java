
package guia7;

import Identidades.Libro;
import java.util.Scanner;


/**
 *
 * @author Chespo
 */
public class MainLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        
        Libro L1 = new Libro();
        
        L1.CrearLibro();
        L1.Mostrar();
       
    }
    
}


