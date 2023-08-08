/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Mains;

import Identidades.DNI;
import Identidades.PersonaD;


public class EjercicioGuia1 {

    public static void main(String[] args) {
        PersonaD p1 = new PersonaD();
        DNI dni = new DNI();
        
        dni.setNumero(42782184);
        dni.setSerie("F-");
        p1.setApellido("Waigel");
        p1.setNombre("Nahuel");
        p1.setDni(dni);
        dni = p1.getDni();
        System.out.println("Apellido: " + p1.getApellido());
        System.out.println("Nombre: " + p1.getNombre());
        System.out.println("DNI: " + dni.getSerie() + dni.getNumero());
    }
}
