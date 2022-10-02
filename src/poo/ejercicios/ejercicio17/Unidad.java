package poo.ejercicios.ejercicio17;

public class Unidad {

    private String nombre;
    static int unidades;

    public Unidad(String nombre) {
        this.nombre = nombre;
        unidades++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
