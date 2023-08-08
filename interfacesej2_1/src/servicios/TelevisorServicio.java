package servicios;

import entidades.Televisor;
import java.util.Scanner;

public class TelevisorServicio extends ServicioElectrodomestico<Televisor>{

   public Televisor crearTelevisor(){
       
       Televisor televisor = crearElectrodomestico(new Televisor());
    
       System.out.println("ingrese las resolucion de el Televisor");
       televisor.setResolucion(new Scanner(System.in).nextInt());
       System.out.println("tiene incorporado un sintetizador?");
       televisor.setSintonizador(leer.nextBoolean());
       return televisor;
   }

}