package metodos;

import java.util.Arrays;

public class TeoriaMetodos {
    public static void main(String[] args) {
        int a = 3, b = 2, h = 5;
        getVolumen(a, b, h);
        System.out.println("Dale " + calcularSemillas(400, 5) + "g de semillas.");
        contarSemillas(400, 5);

        int p = calcularSemillas(400, 5);
        System.out.println(p);
        añadirSemillas(p);
        System.out.println(p);

        int[] números = {1, 5, 3, 2, 4};
        System.out.println(Arrays.toString(números));
        ordenarArray(números);
        System.out.println(Arrays.toString(números));

        imprimirNotas("María", 7, 8, 5, 9, 9);
        imprimirNotas("Julián", 7, 7, 8);
        imprimirNotas("Pastora", 7, 7, 8, 5);
    }

    public static void imprimirNotas(String nombre, int... notas) {
        System.out.println("Se han introducido " + notas.length + " notas");
        System.out.println("Notas de " + nombre + ": " + Arrays.toString(notas));
    }

    public static void ordenarArray(int[] a) {
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }

    private static void getVolumen(int a, int b, int h) {
    }

    public static int calcularSemillas(int pesoLoro, int edadLoro) {
        int semillas = pesoLoro / 5 + edadLoro;
        return semillas;
    }

    public static void contarSemillas(int pesoLoro, int edadLoro) {
        System.out.println("Tienes que dar a tu loro " + (pesoLoro / 5 + edadLoro) + "g de semillas al día.");
    }

    public static void añadirSemillas(int porción) {
        porción += 50;
        System.out.println("La porción incrementada es " + porción);
    }
}

