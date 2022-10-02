package examen2021;

public class Main {
    public static void main(String[] args) {
        Profesor pablo = new Profesor("0222336D", "Pablo");
        pablo.asignarTutoria();
        System.out.println(pablo.toString());

        Curso daw1 = new Curso(CicloFormativo.DAW, 1);
        daw1.setTutor(pablo);
        daw1.mostrarInformacionCurso();

        Alumno alu1 = new Alumno("58965832t", "Fermin");
        Alumno alu2 = new Alumno("78958562s", "Lara");
        alu1.matricular(daw1);
        alu2.matricular(daw1);
        alu1.convalidarAsignatura("FOL");
        alu1.mostrarAsignaturasMatriculadas();
        alu2.mostrarAsignaturasMatriculadas();
        daw1.mostrarPlazasDisponibles();
    }
}
