/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Identidades;

import java.util.Scanner;

/**
 *
 * @author Chespo
 */
public class Rectangulo {
    
    private int base;
    private int altura;
    
    public Rectangulo(){
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
 public void CrearRectangulo(){
     Scanner leer = new Scanner(System.in);
     System.out.println("Ingresar La Base del Rectangulo : ");
     this.setBase(leer.nextInt());
     System.out.println("Ingresar La Altura del Rectangulo : ");
     this.setAltura(leer.nextInt());
 }
    
    public int CalcularSuperficie(){
    return (this.getBase() * this.getAltura());
    }

public int CalcularPerimetro(){
    return ((this.getAltura()+this.getBase())*2);
}


public void DibujarRectangulo(){
    for  (int i = 0; i < this.getAltura(); i++) {
        for (int j = 0;j < this.getBase(); j++) {
            if (i==0 || i==this.getAltura()-1){
                System.out.print(" * ");
            }
            else if(j==0 || j==this.getBase()-1) {
                System.out.print(" * ");
            }
            else{
                System.out.print("   ");
            }
        }
        System.out.println("  ");
    }
}

}