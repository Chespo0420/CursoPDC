/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Mains;

import entidades.Animales;
import entidades.Caballo;
import entidades.Gato;
import entidades.Perro;

/**
 *
 * @author Chespo
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Animales perro1 = new Perro("L,Lawliet","Alienigena",1,"Carnivoro");
        perro1.alimentar();
        System.out.println(perro1);
        
        Animales gato1 = new Gato("Ryuk","NegroLiso",2,"Carnivoro");
        gato1.alimentar();
        System.out.println(gato1);
        
        
        Animales gato2 = new Gato("Rem","NegroPomposo",1,"Carnivoro");
        gato2.alimentar();
        System.out.println(gato2);
        
        Animales caballo1 = new Caballo("SPARK","Fino",15,"Carnivoro");
        caballo1.alimentar();
        System.out.println(caballo1);
    }
    
}
