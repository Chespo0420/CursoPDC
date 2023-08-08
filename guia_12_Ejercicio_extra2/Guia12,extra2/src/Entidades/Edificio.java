package Entidades;

import java.util.Scanner;

public abstract class Edificio {
    
    protected Double ancho;
    protected Double alto;
    protected Double largo;
    private Scanner leer = new Scanner(System.in);
    public Edificio() {
    }
    
    
    
    public Edificio(Double ancho, Double alto, Double largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    public Double getAlto() {
        return alto;
    }

    public void setAlto(Double alto) {
        this.alto = alto;
    }

    public Double getLargo() {
        return largo;
    }

    public void setLargo(Double largo) {
        this.largo = largo;
    }
    
    public abstract void calcularSuperficie();
    
    public abstract void calcularVolumen();
    
    public void calculo(){
        
        System.out.println("Ingresa el alto en metros del edificio");
        this.setAlto(leer.nextDouble());
        
        System.out.println("Ingresa el ancho en metros del edificio");
        this.setAncho(leer.nextDouble());
        
        System.out.println("Ingresa el largo en metros del edificio");
        this.setLargo(leer.nextDouble());
    }

}
