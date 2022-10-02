package poo.ejercicios.ejercicio17;

public class Médico {
    private String nombre;
    static int medico;

    public Médico(String nombre) {
        this.nombre = nombre;
        medico++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
