package examen2021;

import java.util.ArrayList;

public class Curso {
    Grado grado;
    CicloFormativo ciclo;
    int año;
    Horario horario;
    int plazasDisponibles;
    ArrayList<Asignatura> asignaturasCurso = new ArrayList<>();
    private Profesor tutor;
    ArrayList<Alumno> alumnosMatriculados = new ArrayList<>();

    public String getTutor() {
        return tutor.getNombre();
    }

    public void setTutor(Profesor tutor) {
        this.tutor = tutor;
    }

    public void mostrarPlazasDisponibles() {
        System.out.println("Plazas disponibles: " + plazasDisponibles);
    }

    public Curso(CicloFormativo ciclo, int año) {
        this.ciclo = ciclo;
        this.año = año;
        if (ciclo.equals(CicloFormativo.SMR)) {
            grado = Grado.MEDIO;
            horario = Horario.MAÑANA;
        } else {
            grado = Grado.SUPERIOR;
            horario = Horario.TARDE;
        }

        if (grado.equals(Grado.MEDIO)) {
            if (año == 1) {
                Asignatura mme = new Asignatura("MME", 7);
                asignaturasCurso.add(mme);
                Asignatura ap = new Asignatura("AP", 7);
                asignaturasCurso.add(ap);
                Asignatura som = new Asignatura("SOM", 5);
                asignaturasCurso.add(som);
                Asignatura rl = new Asignatura("RL", 7);
                asignaturasCurso.add(rl);
                Asignatura fol = new Asignatura("FOL", 3);
                asignaturasCurso.add(fol);
            } else {
                Asignatura sr = new Asignatura("SR", 6);
                asignaturasCurso.add(sr);
                Asignatura sor = new Asignatura("SOR", 6);
                asignaturasCurso.add(sor);
                Asignatura si = new Asignatura("SI", 6);
                asignaturasCurso.add(si);
                Asignatura aw = new Asignatura("AW", 7);
                asignaturasCurso.add(aw);
                Asignatura eie = new Asignatura("EIE", 3);
                asignaturasCurso.add(eie);
            }
        } else {
            if (año == 1) {
                Asignatura p = new Asignatura("P", 8);
                asignaturasCurso.add(p);
                Asignatura bbdd = new Asignatura("BBDD", 6);
                asignaturasCurso.add(bbdd);
                Asignatura lm = new Asignatura("SOM", 4);
                asignaturasCurso.add(lm);
                Asignatura si = new Asignatura("SI", 6);
                asignaturasCurso.add(si);
                Asignatura fol = new Asignatura("FOL", 3);
                asignaturasCurso.add(fol);
                Asignatura ed = new Asignatura("ED", 3);
                asignaturasCurso.add(ed);
            } else {

            }
        }

        if (año == 1) {
            plazasDisponibles = 30;

        } else {
            plazasDisponibles = 20;
        }


    }

    @Override
    public String toString() {
        return "Curso: " +
                "\ngrado = " + grado +
                "\nciclo = " + ciclo +
                "\naño = " + año +
                "\nhorario = " + horario +
                "\nplazasDisponibles = " + plazasDisponibles +
                "\nasignaturasCurso = " + asignaturasCurso +
                "\ntutor = " + tutor +
                "\nalumnosMatriculados = " + alumnosMatriculados;
    }

    public void mostrarInformacionCurso() {
        System.out.println(toString());
    }


}
