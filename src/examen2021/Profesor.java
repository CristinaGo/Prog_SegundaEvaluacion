package examen2021;

public class Profesor extends Persona {
    boolean tutor;

    public Profesor(String dni, String nombre) {
        super(dni, nombre);
    }

    public void asignarTutoria() {
        tutor = true;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
