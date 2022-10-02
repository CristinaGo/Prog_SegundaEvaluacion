package arraylist;

import java.util.ArrayList;

public class EjemploArrayList {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>(); //creo arraylist sin tamaño
        //el tamaño va entre los paréntesis
        System.out.println("Tamaño del ArrayList:");
        System.out.println(nombres.size());
        System.out.println("Añadimos dos elemento");
        nombres.add("Justino");
        nombres.add("Helena");
        System.out.println(nombres.size());
        System.out.println(nombres);
        System.out.println("Añadimos un nombre en medio");
        nombres.add(1, "Joshua");
        System.out.println(nombres);
        nombres.add(0, "Laura");
        System.out.println(nombres);
        System.out.println("Imprimimos el que está en tercera posición");
        System.out.println(nombres.get(2));
        System.out.println("Sustituimos a Helena por Mario");
        nombres.set(3, "Mario");
        System.out.println(nombres);
        System.out.println("Quitamos a Justino");
        nombres.remove("Justino");
        System.out.println(nombres);
        System.out.println("Borramos todo");
        nombres.clear();
        System.out.println(nombres);

        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        for (int i = 3; i < 10; i++) {
            numeros.add(i);

        }
        System.out.println(numeros);
        System.out.println("Juntamos numeros con numeros2");
        ArrayList<Integer> numeros2 = new ArrayList<>();
        numeros2.add(100);
        numeros2.addAll(numeros);
        System.out.println(numeros);
        System.out.println(numeros2);
        System.out.println("Ver si está el número 13");
        System.out.println(numeros2.contains(13));
        System.out.println("Ver si está el número 100");
        System.out.println(numeros2.contains(100));

    }
}
