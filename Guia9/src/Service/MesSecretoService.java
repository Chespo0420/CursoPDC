/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Objetos.MesSecreto;

/**
 *
 * @author Chespo
 */
public class MesSecretoService {
     MesSecreto mes = new MesSecreto();

    public void crearMes() {
        String[] meses = new String[12];
        meses[0] = "enero";
        meses[1] = "febrero";
        meses[2] = "marzo";
        meses[3] = "abril";
        meses[4] = "mayo";
        meses[5] = "junio";
        meses[6] = "julio";
        meses[7] = "agosto";
        meses[8] = "septiembre";
        meses[9] = "octubre";
        meses[10] = "noviembre";
        meses[11] = "diciembre";
        mes.setMeses(meses);
    }
    
    public boolean comprobador(String entrada, int random){ 
        String[] mesSecreto = mes.getMeses();
        return entrada.equalsIgnoreCase(mesSecreto[random]);
    }
}
