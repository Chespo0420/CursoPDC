/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Mains;

import Identidades.Perrov2;

import Identidades.PersonaPerro;



public class EjerciciosExtra1 {

   
    public static void main(String[] args) {

        PersonaPerro p1 = new PersonaPerro();
        PersonaPerro p2 = new PersonaPerro();
       /* PersonaPerro p3 = new PersonaPerro();
        PersonaPerro p4 = new PersonaPerro();*/
        Perrov2 perro1 = new Perrov2();
        Perrov2 perro2 = new Perrov2();
        /*Perrov2 perro3 = new Perrov2();
        Perrov2 perro4 = new Perrov2();*/
        
        p1.setNombre("Nahuel");
        p1.setApellido("Waigel");
        p1.setDocumento(42782184);
        p1.setEdad(23);

        p2.setNombre("Androide-1");
        p2.setApellido("GG");
        p2.setDocumento(1001001111);
        p2.setEdad(16);

        perro1.setNombr("Perroide-1");
        perro1.setRaza("Sin raza");
        perro1.setTamanio(62);
        perro1.setEdad(6);

        perro2.setNombr("Perroide-2");
        perro2.setRaza("FF");
        perro2.setTamanio(35);
        perro2.setEdad(1);

        int puntosPers1Perr1 = 0;
        int puntosPers1Perr2 = 0;
        int puntosPers2Perr1 = 0;
        int puntosPers2Perr2 = 0;


        if (perro1.getRaza().equalsIgnoreCase("GG")) {
            puntosPers1Perr1++;
        }
        if (perro2.getRaza().equalsIgnoreCase("GG")) {
            puntosPers1Perr2++;
        }
  
        if (perro1.getRaza().equalsIgnoreCase("FF")) {
            puntosPers2Perr1++;
        }
        if (perro2.getRaza().equalsIgnoreCase("FF")) {
            puntosPers2Perr2++;
        }


        if (perro1.getTamanio() < 100) {
            puntosPers1Perr1++;
        }
        if (perro2.getTamanio() < 100) {
            puntosPers1Perr2++;
        }

        if (perro1.getTamanio() > 100) {
            puntosPers2Perr1++;
        }
        if (perro2.getTamanio() > 100) {
            puntosPers2Perr2++;
        }

      
        if (perro1.getEdad() < 3) {
            puntosPers1Perr1++;
        }
        if (perro2.getEdad() < 3) {
            puntosPers1Perr2++;
        }
   
        if (perro1.getEdad() > 3) {
            puntosPers2Perr1++;
        }
        if (perro2.getEdad() > 3) {
            puntosPers2Perr2++;
        }

    
        boolean perro1Adoptado = false;
        boolean perro2Adoptado = false;

        if (puntosPers1Perr1 > puntosPers1Perr2) {
            p1.setPerro(perro1);
            perro1Adoptado = true;
        } else {
            p1.setPerro(perro2);
            perro2Adoptado = true;
        }

    
        if (puntosPers2Perr1 > puntosPers2Perr2 && !perro1Adoptado) {
            p2.setPerro(perro1);
        } else if (puntosPers2Perr2 >= 2 && !perro2Adoptado) {
            p2.setPerro(perro2);
        }

        System.out.println("Persona #1: ");
        System.out.println("Nombre : " + p1.getNombre());
        System.out.println("Apellido : " + p1.getApellido());
        System.out.println("Documento : " + p1.getDocumento());
        System.out.println("Edad : " + p1.getEdad());
        Perrov2 aux1 = p1.getPerro();
        System.out.println("Perro adoptado: " + aux1.getNombr());

        System.out.println("Persona #2: ");
        System.out.println("Nombre : " + p2.getNombre());
        System.out.println("Apellido : " + p2.getApellido());
        System.out.println("Documento : " + p2.getDocumento());
        System.out.println("Edad : " + p2.getEdad());
        Perrov2 aux2 = p2.getPerro();
        System.out.println("Perro adoptado: " + aux2.getNombr());
    }

}
