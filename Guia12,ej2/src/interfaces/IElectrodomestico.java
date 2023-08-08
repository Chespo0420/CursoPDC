/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author Chespo
 */
import entidades.Electrodomestico;

public interface IElectrodomestico{
   //  void comprobarConsumoEnergetico(String letra); //los metodos en una interface no pueden tener cuerpo, es decir no se utilizan llaves
    
    /**
     * comprueba que la letra es correcta, sino es correcta usara la letra F por
     * defecto. Este método se debe invocar al crear el objeto y no será
     * visible.
     *
     * @param letra
     */
    void comprobarConsumoEnergetico(String letra);

    /**
     * comprueba que el color es correcto, y si no lo es, usa el color blanco
     * por defecto. Los colores disponibles para los electrodomésticos son
     * blanco, negro, rojo, azul y gris. No importa si el nombre está en
     * mayúsculas o en minúsculas. Este método se invocará al crear el objeto y
     * no será visible.
     *
     * @param color
     */
    void comprobarColor(String color);

    /**
     * le pide la información al usuario y llena el electrodoméstico, también
     * llama los métodos para comprobar el color y el consumo.Al precio se le
       da un valor base de $1000.
     * @param electrodomestico
     * @return 
     */
    Electrodomestico crearElectrodomestico(Electrodomestico electrodomestico);

    /**
     * según el consumo energético y su tamaño, aumentará el valor del precio.
     * Esta es la lista de precios:
     */
    void precioFinal();

}
