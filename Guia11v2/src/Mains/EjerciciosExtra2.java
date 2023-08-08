/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Mains;

import Identidades.Cine;
import Service.CineService;


public class EjerciciosExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CineService serv = new CineService();
        Cine cine = serv.crearCine();
        serv.crearEspectadores(cine);
        serv.mostrar(cine);
    }
    
}
