package poo.ejercicios.ejercicio17;

public class General {

    private String nombre;
    static int general;

    public General(String nombre) {
        this.nombre = nombre;
        general++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
