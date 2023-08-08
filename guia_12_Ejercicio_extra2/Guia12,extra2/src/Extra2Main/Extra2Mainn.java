package Extra2Main;

import Entidades.Edificio;
import Servicio.ServiEdificioOfi;
import Servicio.ServiPoli;
import java.util.ArrayList;


public class Extra2Mainn {

    
    public static void main(String[] args) {
        
        ArrayList<Object> edificaciones = new ArrayList();
        
        ServiEdificioOfi ofi1 = new ServiEdificioOfi();
        ofi1.crearEdificio();
        
        ServiEdificioOfi ofi2 = new ServiEdificioOfi();  
        ofi2.crearEdificio();
        
        ServiPoli poli1 = new ServiPoli();
        poli1.crearPoli();
        
        ServiPoli poli2 = new ServiPoli();
        poli2.crearPoli();
        
        edificaciones.add(ofi1);
        edificaciones.add(ofi2);
        edificaciones.add(poli1);
        edificaciones.add(poli2);
      
        
    }

   

}
