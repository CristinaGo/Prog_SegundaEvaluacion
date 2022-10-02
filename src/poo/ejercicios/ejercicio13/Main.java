package poo.ejercicios.ejercicio13;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //creamos objetos de tipo libro

        Libro libro1 = new Libro("El asesinato de Pitágoras", 2013, new String[]{"Marcos Chicot"});

        // queremos saber el titulo

        //System.out.println(libro1.titulo); --> no funciona porque es privado
        System.out.println(libro1.getTitulo());

        //queremos cambiar el titulo

        libro1.setTitulo("Los besos");
        System.out.println(libro1.getTitulo());

        //vemos los autores
        System.out.println(Arrays.toString(libro1.getAutores()));

        //cambiamos el autor

        libro1.setAutores(new String[]{"Manuel Vilas", "El Bananito"});
        System.out.println(Arrays.toString(libro1.getAutores()));

    }
}
