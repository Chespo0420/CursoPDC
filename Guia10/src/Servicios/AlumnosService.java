/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.ArrayList;
import java.util.Scanner;
import Entidades.Alumno;

/**
 *
 * @author Chespo
 */
public class AlumnosService {

    Scanner leer = new Scanner(System.in);

    ArrayList<Integer> nota = new ArrayList();
   

public void crearAlumno(ArrayList<Alumno> alumno) {
        
        boolean resp ;
        do {

            System.out.println("Ingrese el nombre del alumno ");
            String nombre = (leer.next());
           
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese las notas ");
                nota.add(leer.nextInt());

            }

            Alumno alumnos = new Alumno(nombre, nota);
            alumno.add(alumnos);
            System.out.println("Quiere ingresar otro alumno .? ingrese (S/N)");
            resp = leer.next().equals("s");

               
            
        }while (resp);
    }

    public void notaFinal(ArrayList<Alumno> alumno) {
        System.out.println("Ingrese el Nombre del Alumno para ver nota Final");
        String nombre = leer.next();
        for (Alumno alumno1 : alumno) {
            if (alumno1.getNombre().equals(nombre)) {
                ArrayList<Integer> nota = alumno1.getNota();
                double promedio = (nota.get(0) + nota.get(1) + nota.get(2)) / 3;
                System.out.println("El promedio del Alumno : " + nombre + " es: " + promedio);
            } else{
                System.out.println("No se encontro el nombre");
            
            }
        }
    }
}

