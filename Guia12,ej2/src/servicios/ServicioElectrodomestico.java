/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

/**
 *
 * @author Chespo
 */
import entidades.Electrodomestico;
import interfaces.IElectrodomestico;
import java.util.Scanner;

public abstract class ServicioElectrodomestico implements IElectrodomestico {

    Scanner leer = new Scanner(System.in);

    @Override
    public void comprobarConsumoEnergetico(String letra) {
        letra.toLowerCase();
        int plus = 0;
        switch (letra) {
            case "a":
                System.out.println("Consumo $1000");
                plus = 1000;
                break;
            case "b":
                System.out.println("Consumo $800");
                plus = 800;
                break;
            case "c":
                System.out.println("Consumo $600");
                plus = 600;
                break;
            case "d":
                System.out.println("Consumo $500");
                plus = 500;
                break;
            case "e":
                System.out.println("Consumo $300");
                plus = 300;
                break;

            default:
                System.out.println("Consumo $100");
                plus = 100;
                break;
        }
    }

    @Override
    public void comprobarColor(String color) {
    }

    @Override
    public Electrodomestico crearElectrodomestico(Electrodomestico electrodomestico) {
        System.out.println("ingrese el color del electrodomestico");
        electrodomestico.setColor(leer.next());
        System.out.println("ingrese el peso del electrodomestico");
        electrodomestico.setPeso(leer.nextInt());
        System.out.println("ingrese el consumo electrico del electrodomestico");
        electrodomestico.setConsumoEnergetico(leer.next());
        System.out.println("ingres el precio del electrodomestico");
        electrodomestico.setPrecio(leer.nextInt());
        return electrodomestico;
    }

    @Override
    public void precioFinal() {

    }

}
