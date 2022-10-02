package interfaces.ejercicios.ej12biblioteca;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("CREAMOS LIBRO");
        Libro libro1 = new Libro("L01", "La red purpura", 2017);
        System.out.println(libro1);
        System.out.println(libro1.getAño());
        System.out.println(libro1.getCodigo());
        libro1.prestar();
        libro1.prestado();
        libro1.devolver();
        libro1.prestado();

        System.out.println("\nCREAMOS REVISTA");
        Revista revista1 = new Revista("R01", "Computer hoy", 2022, 205);
        System.out.println(revista1);
        System.out.println(revista1.getAño());
        System.out.println(revista1.getCodigo());

        System.out.println("Probamos el método cuentaPrestados");
        ArrayList<Libro> l = new ArrayList<>();
        l.add(libro1);
        Libro libro2 = new Libro("L02", "La red purpura", 2017);
        Libro libro3 = new Libro("L03", "La red purpura", 2017);
        Libro libro4 = new Libro("L04", "La red purpura", 2017);
        Libro libro5 = new Libro("L05", "La red purpura", 2017);
        Libro libro6 = new Libro("L06", "La red purpura", 2017);
        Libro libro7 = new Libro("L07", "La red purpura", 2017);
        libro1.prestar();
        libro3.prestar();
        libro7.prestar();

        l.add(libro2);
        l.add(libro3);
        l.add(libro4);
        l.add(libro5);
        l.add(libro6);
        l.add(libro7);

        int n = cuentaPrestados(l);
        System.out.println(n);

        System.out.println("Probamos el método publicacionesAnteriores");
        Revista revista2 = new Revista("R02", "Computer hoy", 2019, 205);

        ArrayList<Publicacion> p = new ArrayList<>();

        p.add(revista1);
        p.add(revista2);
        p.addAll(l);

        int nu = publicacionesAnteriores(p, 2020);
        System.out.println(nu);
    }

    public static int cuentaPrestados(ArrayList<Libro> libros) {
        int contador = 0;
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).prestado == true) {
                contador++;
            }
        }
        return contador;
    }

    public static int publicacionesAnteriores(ArrayList<Publicacion> publicaciones, int año) {
        int contador = 0;
        for (int i = 0; i < publicaciones.size(); i++) {
            if (publicaciones.get(i).año < año) {
                contador++;
            }
        }

        return contador;
    }
}
