/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Objetos.Cadena;
import java.util.Scanner;

/**
 *
 * @author Chespo
 */
public class CadenaServicio {
    Scanner leer = new Scanner(System.in);
    public void mostrarVocales(Cadena cadena) {
        int contador = 0;
        for (int i = 0; i < cadena.getLongitud(); i++) {

            switch (cadena.getFrase().substring(i, i + 1).toLowerCase()) {
                case "a":
                    contador++;
                    break;
                case "e":
                    contador++;
                    break;
                case "i":
                    contador++;
                    break;
                case "o":
                    contador++;
                    break;
                case "u":
                    contador++;
                    break;
            }

        }
        System.out.println(contador);
    }

    public void invertirFrase(Cadena cadena) {

        String invertida = "";
        for (int i = cadena.getLongitud() - 1; i >= 0; i--) {
            invertida += cadena.getFrase().substring(i, i + 1);
        }

        System.out.println(invertida);
    }

    public void vecesRepetido(Cadena cadena) {
        int contador = 0;
        String caracter;
        System.out.println("Ingrese un caracter para comparar");
        caracter = leer.nextLine().toLowerCase();

        for (int i = 0; i < cadena.getLongitud(); i++) {
            if (cadena.getFrase().substring(i, i + 1).toLowerCase().equals(caracter)) {
                contador++;
            }
        }
        System.out.println("La letra " + caracter + " " + "se repite "+ contador + " veces");

    }

   public void compararLongitud(Cadena cadena) {
        System.out.println("Ingrese una nueva frase para comparar");
        String nuevaFrase;
        nuevaFrase = leer.nextLine();
        if (cadena.getLongitud() == nuevaFrase.length()) {
            System.out.println("Las frases son de igual longitud");
        } else {
            System.out.println("Las frases no son de igual longitud");
        }
    }
    public void unirFrases(Cadena cadena){
        System.out.println("Ingrese una frase para unir");
        String nuevaFrase = leer.nextLine();
        String FraseFinal = nuevaFrase + cadena.getFrase();
        System.out.println(FraseFinal);
    }
    
    public void reemplazar(Cadena cadena){
        System.out.println("Ingrese una Letra para Reemplazar");
        String letra = leer.nextLine();
        String reemplazarLetra = cadena.getFrase().replaceAll("a", letra);
        System.out.println(reemplazarLetra);        
    } 
    
    public boolean contiene(Cadena cadena){
        System.out.println("Ingrese una letra para Comparar");
        String letra = leer.nextLine();
        boolean contieneLetra = false;
       
        if (cadena.getFrase().contains(letra.toLowerCase())){
            contieneLetra= true;
            System.out.println(contieneLetra);
            return contieneLetra;
        }else {
            contieneLetra = true;
            System.out.println(contieneLetra);
            return contieneLetra;
        }
        
    }
    
    
    
    
    
    
    
    
    
    
    
}
