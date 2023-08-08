package Entidades;

public class Polideportivo extends Edificio {
    
    private String nombre;
    private boolean tipo;

    public Polideportivo() {
    }
    
    
    
    public Polideportivo(String nombre, boolean tipo, Double ancho, Double alto, Double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }
    

    @Override
    public void calcularSuperficie() {
        System.out.println("La superficie  del Poli es: " + this.ancho * this.largo);
    }

    @Override
    public void calcularVolumen() {
        System.out.println("El volumen del Poli es: " + this.alto * this.largo * this.ancho);
    }
    
    @Override
    public void calculo(){
        System.out.println("Ingresa el polideportivo");
        super.calculo();
        System.out.println("El alto es: " + this.alto + "\n"
                + "El ancho es: " + this.ancho + "\n"
                + "El largo es: " + this.largo);
    }
    

}
