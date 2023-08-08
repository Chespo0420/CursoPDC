/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Chespo
 */
public class Caballo extends Animales{
    
    public Caballo(){}
    
    public Caballo(String nombre,String raza,int edad,String alimento){
        super(nombre, raza, edad, alimento);
    }
    
    @Override
    public void alimentar() {
        System.out.println("Mi Mascota "+nombre+", se alimenta de Pasto");
    }
    
}
