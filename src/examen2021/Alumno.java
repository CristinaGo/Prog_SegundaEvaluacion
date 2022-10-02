package examen2021;

import java.util.ArrayList;

public class Alumno extends Persona {

    Curso curso;
    ArrayList<Asignatura> asignaturasMatriculadas = new ArrayList<>();


    public Alumno(String dni, String nombre) {
        super(dni, nombre);
    }

    public void matricular(Curso curso) {
        this.curso = curso;
        this.asignaturasMatriculadas.addAll(curso.asignaturasCurso);
        curso.plazasDisponibles--;
        System.out.println("El alumno se ha matriculado correctamente.");
    }

    public void convalidarAsignatura(String nombreAsignatura) {
        for (int i = 0; i < asignaturasMatriculadas.size(); i++) {
            if (asignaturasMatriculadas.get(i).nombre.equals(nombreAsignatura)) {
                asignaturasMatriculadas.remove(i);
            }
        }
    }

    public void mostrarAsignaturasMatriculadas() {
        System.out.println("Asignaturas matriculadas por " + this.getNombre());
        System.out.println("=================================================");
        for (int i = 0; i < asignaturasMatriculadas.size(); i++) {
            System.out.println(asignaturasMatriculadas.get(i).nombre + " (" + asignaturasMatriculadas.get(i).horas + ")");
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
