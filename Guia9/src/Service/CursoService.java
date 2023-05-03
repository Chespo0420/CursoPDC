/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Objetos.Curso;
import java.util.Scanner;

/**
 *
 * @author Chespo
 */
public class CursoService {
    
Scanner leer = new Scanner(System.in);
    Curso curso = new Curso();
    
    public void cargarAlumnos() {
        String[] alumnos = curso.getAlumnos();
        System.out.println("Nombre de los alumnos:");
        leer.nextLine();
        for (int i = 0; i < 5; i++) {
            System.out.println("Alumno #" + (i + 1));
            alumnos[i] = leer.nextLine();
        }
        curso.setAlumnos(alumnos);
    }
    
    public void crearCurso(){
        System.out.println("Rellene los siguientes datos para crear un curso:");
        System.out.println("Nombre del curso:");
        curso.setNombreCurso(leer.nextLine());
        System.out.println("Horas por dia de clase:");
        curso.setCantidadHorasPorDia(leer.nextInt());
        System.out.println("Dias de clase por semana:");
        curso.setCantidadDiasPorSemana(leer.nextInt());
        System.out.println("Turno (Tarde/Mañana):");
        leer.nextLine();
        curso.setTurno(leer.nextLine());
        System.out.println("Precio por hora de curso:");
        curso.setPrecioPorHora(leer.nextInt());
        cargarAlumnos();
    }
    
    public void calcularGananciasSemana(){
        int ganancia = ((curso.getCantidadHorasPorDia() * curso.getPrecioPorHora()) * 5) * curso.getCantidadDiasPorSemana();
        System.out.println("Las ganancias semanales del curso son de $" + ganancia);
    }
}

