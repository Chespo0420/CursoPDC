package servicios;

import entidades.Lavadora;

public class LavadoraServicio extends ServicioElectrodomestico<Lavadora> {

    public Lavadora crearLavadora() {
       Lavadora lavadora = crearElectrodomestico(new Lavadora());
        System.out.println("ingrese capacida");
        lavadora.setCarga(leer.nextInt());
       return lavadora;
    }


}
