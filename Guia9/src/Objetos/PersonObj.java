/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import java.util.Date;

/**
 *
 * @author Chespo
 */
public class PersonObj {
    private String Nombre;
    private Date Fecha;
    
    
    public PersonObj(){
        
    }

    public PersonObj(String Nombre, Date Fecha) {
        this.Nombre = Nombre;
        this.Fecha = Fecha;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

   
    
    
    
}
