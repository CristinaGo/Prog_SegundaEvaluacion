package poo.ejercicios.ejercicio17;

public class Caballero {

    private String nombre;
    static int caballero;

    public Caballero(String nombre) {
        this.nombre = nombre;
        caballero++;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
