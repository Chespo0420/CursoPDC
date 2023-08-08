/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Identidades.JugadorV;
import Identidades.Revolver;


public class JugadorServicio {
    
    public boolean disparo(Revolver rev, RevolverServicio revServ, JugadorV jugador){
        
        boolean muerto = false;
        if(revServ.disparar(rev)){
            muerto = true;
            jugador.setVivo(false);
        }
        
        revServ.siguienteDisparo(rev);
        
        return muerto;
    }
}
