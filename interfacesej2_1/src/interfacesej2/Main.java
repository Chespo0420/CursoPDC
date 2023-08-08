package interfacesej2;

import servicios.LavadoraServicio;
import servicios.TelevisorServicio;

public class Main {

    public static void main(String[] args) {

        LavadoraServicio lavadoraServicio = new LavadoraServicio();
        System.out.println(lavadoraServicio.crearLavadora());
        
        TelevisorServicio televisorServicio = new TelevisorServicio();
        System.out.println(televisorServicio.crearTelevisor());
    }
    
    
    
}
