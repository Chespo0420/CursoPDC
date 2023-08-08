package Entidades;

public class EdificioOficinas extends Edificio {
    
    private int numOficinas;
    private int cantPersonasOfici;
    private int numPisos;

    public EdificioOficinas() {
        
    }

    public EdificioOficinas(int numOficinas, int cantPersonasOfici, int numPisos, Double ancho, Double alto, Double largo) {
        super(ancho, alto, largo);
        this.numOficinas = numOficinas;
        this.cantPersonasOfici = cantPersonasOfici;
        this.numPisos = numPisos;
    }

    public int getNumOficinas() {
        return numOficinas;
    }

    public void setNumOficinas(int numOficinas) {
        this.numOficinas = numOficinas;
    }

    public int getCantPersonasOfici() {
        return cantPersonasOfici;
    }

    public void setCantPersonasOfici(int cantPersonasOfici) {
        this.cantPersonasOfici = cantPersonasOfici;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }
    
    

    @Override
    public void calcularSuperficie() {
        System.out.println("La superficie es: " + (this.ancho*this.largo));
    }

    @Override
    public void calcularVolumen() {
        System.out.println("El volumen es: " + (this.ancho * this.largo * this.alto));
    }
    
    @Override
    public void calculo(){
        System.out.println("Ingresa el edificio");
        super.calculo();
        System.out.println("El alto es: " + this.alto + "\n"
                + "El ancho es: " + this.ancho + "\n"
                + "El largo es: " + this.largo);
    }
    

}
