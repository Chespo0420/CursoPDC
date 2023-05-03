/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mains;

import Service.MesSecretoService;
import java.util.Scanner;

/**
 *
 * @author Chespo
 */
public class MesSecretoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        MesSecretoService mes = new MesSecretoService();
        mes.crearMes();
        String entrada;
        System.out.println("Adivine el mes secreto!");
        int random = (int) (Math.random() * 12);
        
        do{
            
            entrada = leer.nextLine();
            
            if(!mes.comprobador(entrada, random)){
                System.out.println("Incorrecto! Intentelo de nuevo");
            } else {
                System.out.println("Correcto!");
            }
            
        }while(!mes.comprobador(entrada, random));
        
    }

    
}