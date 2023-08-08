/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Lavadora;

/**
 *
 * @author Chespo
 */
public class LavadoraServicio extends ServicioElectrodomestico {

    public Lavadora crearLavadora() {
        Lavadora lavadora = (Lavadora) crearElectrodomestico(new Lavadora());
        System.out.println("ingrese la capacidad de carga de la lavadora");
        lavadora.setCarga(leer.nextInt());
        return lavadora;
    }
}
