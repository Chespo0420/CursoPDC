package servicios;

import entidades.Electrodomestico;
import interfaces.IElectrodomestico;
import java.util.Scanner;

public abstract class ServicioElectrodomestico<T extends Electrodomestico> implements IElectrodomestico<T> {

    Scanner leer = new Scanner(System.in);

    @Override
    public void comprobarConsumoEnergetico(String letra) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void comprobarColor(String color) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public T crearElectrodomestico(T t) {
        System.out.println("ingrese color");
        t.setColor(leer.next());
        System.out.println("ingrese peso");
        t.setPeso(leer.nextInt());
        System.out.println("ingrese tipo de consumo electrico");
        t.setConsumoEnergetico(leer.next());
        System.out.println("ingrese precio");
        t.setPrecio(leer.nextInt());
        System.out.println("Genial usted a creado un electrodomestico de tipo "+t.getClass().getSimpleName());
        return t;
    }

    @Override
    public void precioFinal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
