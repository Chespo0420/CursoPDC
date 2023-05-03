package Identidades;

/**
 * @author Chespo420
 */
public class Persona {

    public String nombre;
    public String Apellido;
    public int Edad;
    public String Provincia;

    private Persona(String nombre, String Apellido, int Edad, String Provincia) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
        this.Provincia = Provincia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getProvincia() {
        return Provincia;
    }

    public void setProvincia(String Provincia) {
        this.Provincia = Provincia;
    }

    public Persona() {
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", Apellido=" + Apellido + ", Edad=" + Edad + ", Provincia=" + Provincia + '}';
    }

}
