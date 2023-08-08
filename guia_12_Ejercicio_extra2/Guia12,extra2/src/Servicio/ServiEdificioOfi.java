package Servicio;

import Entidades.EdificioOficinas;
import java.util.ArrayList;
import java.util.Scanner;

public class ServiEdificioOfi {
    
    private EdificioOficinas edificioOficinas;
    private Scanner leer = new Scanner(System.in);
    private ArrayList<Integer> piso = new ArrayList();
    
    
    public void crearEdificio(){
        
        edificioOficinas = new EdificioOficinas();
        
        edificioOficinas.calculo();
        
        System.out.println("Cuantos pisos tiene el edificio?");
        edificioOficinas.setNumPisos(leer.nextInt());
        
        int ofiTotal = 0;
        int aux ;
        int cantPerso = 0;
        
        for (int i = 0; i < edificioOficinas.getNumPisos(); i++) {
            
            do{
                System.out.println("Cuantas oficinas hay en el piso " + i);
                aux = leer.nextInt();
                ofiTotal += aux;
            }while(aux <=0 );
            
            do{
                System.out.println("Cuantas personas entran en cada oficina?");
                cantPerso = leer.nextInt();
                cantPerso = cantPerso*aux;
                piso.add(cantPerso);
                
            }while(cantPerso <= 0);
            
            
        }
        
        edificioOficinas.setNumOficinas(ofiTotal);
        
    }
    
    public void cantPersonas(){
        String aux = "Pisos del edificio: \n";
        int aux2 = 0;
        int aux3 = 0;
        for (Integer p : piso) {
            aux += "Piso: "+ aux2 + " " + p + " Personas \n";
            aux2++;
            aux3 += p;
        }
        aux += "Cantidad de personas que entran en todo el edificio: " + aux3;
    }

}
