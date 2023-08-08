/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Chespo
 */
public class Animales {
    protected String nombre;
    protected String raza;
    protected int edad;
    protected String alimento;

    public Animales() {
    }

    
    public Animales(String nombre, String raza, int edad, String alimento) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.alimento = alimento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
    
    public void alimentar(){
        System.out.println("Mi mascota es : "+nombre+" "+" Y me alimento de : "+alimento);
    }

    @Override
    public String toString() {
        return "Animales{" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", alimento=" + alimento + '}';
    }
    
    
    
    
}
