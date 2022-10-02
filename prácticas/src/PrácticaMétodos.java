import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Esta clase es la resolución de la práctica de métodos
 * @author Cristina Gómez Campos
 */

public class PrácticaMétodos {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        boolean continuar = true;
        do {
            int op = menu();
            resolverEjercicio(op);
            System.out.println("¿Quieres resolver otro? (s/n)");
            char respuesta = sc.next().toLowerCase().charAt(0);
            if (respuesta == 'n'){
                continuar = false;
            } else if (respuesta == 's') {
                continuar = true;
            }else {
                continuar = false;
            }
        } while (continuar == true);
    }

    private static int menu(){
        System.out.println("¿Qué ejercicio quieres resolver?(1-6)");
        int opción = sc.nextInt();
        sc.nextLine();
        return opción;
    }
    private static void resolverEjercicio(int numero){
        switch (numero){
            case 1:
                ejercicio1();
                break;
            case 2:
                ejercicio2();
                break;
            case 3:
                ejercicio3();
                break;
            case 4:
                ejercicio4();
                break;
            case 5:
                ejercicio5();
                break;
            case 6:
                ejercicio6();
                break;
            default:
                System.out.println("Opción incorrecta");
        }
    }

    private static void ejercicio1(){
        String enunciado = "Escribe un método de nombre determinarSigno que reciba un número entero y\ncompruebe si el número es negativo, positivo o cero.\nEl método debe devolver -1, 1 o 0, respectivamente.";
        System.out.println(enunciado);
        System.out.println("Introduce un número entero");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println(determinarSigno(n));
    }
    private static int determinarSigno(int numero){
        if (numero > 0){
            return 1;
        } else if (numero < 0){
            return -1;
        }else {
            return 0;
        }
    }

    private static void ejercicio2(){
        String enunciado = "Implementa el método sumaEnRango para calcular la suma de números enteros en el rango\nque va desde un número (inclusive) a otro (no inclusive) pasados como parámetro.";
        System.out.println(enunciado);
        System.out.println("Introduce el primer número");
        int num1 = sc.nextInt();
        System.out.println("Introduce el segundo número");
        int num2 = sc.nextInt();
        sc.nextLine();
        sumaEnRango(num1,num2);

    }

    public static void sumaEnRango(int num1, int num2){
        int suma = 0;
        for (int i = num1; i < num2 ; i++) {
            suma = suma + i;
        }
        System.out.println("La suma de enteros de " + num1 + " a " + num2 + " es igual a " + suma);
    }


    private static void ejercicio3(){
        String enunciado = "Dado un método que recibe un valor long y devuelve el valor máximo del tipo long menos el número dado:\n" +
                "public static long getMaxMenosValor(long val) { return Long.MAX_VALUE - val; }\n" +
                "Sobrecarga este método con un nuevo método que reciba un int y devuelva el valor máximo del tipo int menos el valor dado.\nEl tipo del valor retornado debe ser el mismo que el del parámetro.";
        System.out.println(enunciado);
        System.out.println("LLamada al primer método");
        System.out.println("==================");
        System.out.println("Introduce un valor");
        long v1 = sc.nextLong();
        System.out.println("Resultado: " + getMaxMenosValor(v1));
        System.out.println("LLamada al segundo método");
        System.out.println("==================");
        System.out.println("Introduce un valor");
        int v2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Resultado: " + getMaxMenosValor(v2));

    }
    public static long getMaxMenosValor(long val) {
        return Long.MAX_VALUE - val;
    }

    public static int getMaxMenosValor(int val){
        return Integer.MAX_VALUE - val;
    }

    private static void ejercicio4(){
        String enunciado = "Tenemos un método print(String arg).\nEl método devuelve el nombre y su argumento (entre comillas, porque es un String).\nPor ejemplo, pasando el argumento “test” print(\"test\")\nSobrecarga este método escribiendo un nuevo método con el mismo nombre y dos argumentos: un String y un entero.\nEl nuevo método debe imprimir el nombre y los dos parámetros.\nPor ejemplo: print(\"test\", 4)";
        System.out.println(enunciado);
        System.out.println("LLamada al primer método");
        System.out.println("==================");
        System.out.println("Cadena a pasar como argumento");
        String arg = sc.nextLine();
        System.out.println("\"" + print(arg) + "\"");
        System.out.println("LLamada al segundo método");
        System.out.println("==================");
        System.out.println("Cadena a pasar como argumento");
        String a = sc.nextLine();
        System.out.println("Número a pasar como argumento");
        int v = sc.nextInt();
        sc.nextLine();
        print(a,v);
    }

    public static String print(String arg){
        String cadena = new String(arg);
        return cadena;
    }
    public static void print(String a, int v){
        System.out.println("print(" +"\"" + a + "\", " + v + ")");
    }

    private static void ejercicio5(){
        String enunciado = "Escribe un método llamado sumarValorPorÍndice.\nEl método debe recibir un array de longs y sumar al elemento especificado por el índice el valor pasado.\nParámetros que recibe: un array de longs, el índice de un elemento (int) y el valor a sumar (long).\nEl método no devuelve ningún valor.\nLa siguiente invocación debería funcionar correctamente:\n" +
                "sumarValorPorÍndice(array, índice, valor);";
        System.out.println(enunciado);
        long[] a = new long[20];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100 + 1);
        }
        System.out.println("Array antes de sumar:" + Arrays.toString(a));
        int in = (int) (Math.random() * (19) + 1);
        System.out.println("Índice:" + in);
        int v = (int) (Math.random() * (100) + 1);

        System.out.println("Valor:" + v);
        sumarValorPorÍndice(a,in,v);
    }
    public static void sumarValorPorÍndice(long[] a,int in, int v){
        for (int i = 0; i < a.length; i++) {
            if(i == in){
                a[i] = a[i] + v;
            }
        }
        System.out.println("Array despúes de sumar:" + Arrays.toString(a));
    }

    private static void ejercicio6(){
        String enunciado = "Escribe un método llamado getPrimeroYÚltimo.\nEl método recibe un array de enteros y devolver otro array de enteros.\nEl array retornado debe contener dos elementos: el primero y el último de los elementos del array de entrada.";
        System.out.println(enunciado);
        int[] a = new int[20];
         getPrimeroYÚltimo(a);
    }

    public static int getPrimeroYÚltimo(int[] a){
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100 + 1);
        }
        System.out.println("Array de enteros: " + Arrays.toString(a));
        System.out.println("Resultado: [" + a[0] +","+ a[19] + "]");
        return a[0] & a[19];

    }

}
