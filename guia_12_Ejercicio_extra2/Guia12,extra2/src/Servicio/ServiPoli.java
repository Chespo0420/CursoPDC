package Servicio;

import Entidades.Polideportivo;
import java.util.Scanner;

public class ServiPoli {
    
    private Polideportivo poli;
    private Scanner leer = new Scanner(System.in);
    public void crearPoli(){
        
        poli = new Polideportivo();
        
        poli.calculo();
        
        System.out.println("Ingresa el nombre del polideportivo");
        poli.setNombre(leer.nextLine());
        
        String opc;
        
        do{
            System.out.println("El tipo de instalacion es techado ? S/N");
            opc = leer.next();
        
            if(opc.equalsIgnoreCase("s")){
               poli.setTipo(true);
            }else{
               poli.setTipo(false);
            }
        }while(!opc.equalsIgnoreCase("s") && !opc.equalsIgnoreCase("n"));
       
        
    }
    
}
