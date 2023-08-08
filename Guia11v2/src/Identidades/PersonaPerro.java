/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Identidades;

public class PersonaPerro {

    private String nombre;
    private String apellido;
    private int edad;
    private long documento;
    private Perrov2 perro;

    public PersonaPerro() {
    }

    public PersonaPerro(String nombre, String apellido, int edad, long documento, Perrov2 perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.perro = perro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }

    public Perrov2 getPerro() {
        return perro;
    }

    public void setPerro(Perrov2 perro) {
        this.perro = perro;
    }

}
