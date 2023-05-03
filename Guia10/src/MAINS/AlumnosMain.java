/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MAINS;

import Entidades.Alumno;
import Servicios.AlumnosService;
import java.util.ArrayList;







/**
 *
 * @author Chespo
 */
public class AlumnosMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Alumno> alumno = new ArrayList();
        AlumnosService as = new AlumnosService();
        as.crearAlumno(alumno);
        as.notaFinal(alumno);
        
        
    }

}
