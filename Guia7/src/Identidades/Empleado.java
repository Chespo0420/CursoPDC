/*
 Crea una clase "Empleado" que tenga atributos como "nombre"
, "edad" y "salario". Luego, crea un método "calcular_aumento
" que calcule el aumento salarial de un empleado en función de 
su edad y salario actual. El aumento salarial debe ser del 
10% si el empleado tiene más de 30 años 
o del 5% si tiene menos de 30 años.
 */
package Identidades;

import java.util.Scanner;

/**
 *
 * @author Chespo
 */
public class Empleado {


 
        Scanner leer = new Scanner(System.in);
    private String nombre;
    private int edad;
    private double salario;
    public double aumentoSalarial;
 public Empleado() {
        
    }
    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void calcular_aumento() {
        System.out.println("Ingrese el nombre ");
        this.nombre = leer.next();
        System.out.println("Ingrese la edad");
        this.edad = leer.nextInt();
        System.out.println("Ingrese el salario");
        this.salario = leer.nextDouble();

        if (edad > 30) {
            aumentoSalarial = salario + (salario * 0.1);
            System.out.println("Su salario es de " + aumentoSalarial);
        } else {
            aumentoSalarial = salario + (salario * 0.05);
            System.out.println("Su salario es de " + aumentoSalarial);
        }
    }
}

