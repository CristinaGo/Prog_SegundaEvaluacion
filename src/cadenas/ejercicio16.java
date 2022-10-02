package cadenas;


import java.util.Scanner;

public class ejercicio16 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String lista = crearLista();
        boolean salir = false;
        do {
            int op = menu();
            lista = ejecutarOpción(op, lista);
            System.out.println("¿Quieres salir? (s/n)");
            char respuesta = sc.next().toLowerCase().charAt(0);
            if (respuesta == 's') {
                salir = true;
            } else {
                salir = false;
            }
        } while (salir == false);
    }

    /**
     * Pide las palabras que se van añadiendo a la lista y devuelve el String que contiene todas ellas
     *
     * @return lista la lista de palabras
     */
    public static String crearLista() {
        String lista = "";
        String palabra;
        do {
            System.out.println("Introduce la lista de palabras (0 para salir):");
            palabra = sc.next();
            if (!palabra.equals("0")) {
                lista = lista + palabra + " ";
            }
            System.out.println(lista);

        } while (!palabra.equals("0"));


        return lista;
    }

    /**
     * Despliega un menu con varias opciones
     *
     * @return opción la opción elegida
     */
    public static int menu() {
        System.out.println("Elige una de las siguientes opciones:\n1.Añadir\n2.Contar\n3.Modificar\n4.Eliminar\n5.Mostrar");
        int opción = sc.nextInt();
        sc.nextLine();
        return opción;
    }

    /**
     * Ejecuta la opción elegida en el menú
     *
     * @param número opción elegida
     * @param cadena lista de palabras
     * @return cadena resultante de ejecutar la opción elegida
     */
    public static String ejecutarOpción(int número, String cadena) {
        switch (número) {
            case 1:
                cadena = añadir(cadena);
                break;
            case 2:
                contar(cadena);
                break;
            case 3:
                cadena = modificar(cadena);
                break;
            case 4:
                cadena = eliminar(cadena);
                break;
            case 5:
                mostrar(cadena);
                break;
            default:
                System.out.println("Opción incorrecta");
        }
        return cadena;

    }

    /**
     * Añade una palabra a la lista.
     *
     * @param cadena lista de palabras
     * @return cadena resultante después de añadir otra palabra
     */
    public static String añadir(String cadena) {
        System.out.println("Palabra a añadir: ");
        String palabra = sc.nextLine();
        cadena = cadena + palabra + " ";
        return cadena;
    }

    /**
     * Cuenta las palabras que tiene la lista
     *
     * @param cadena lista de palabras
     */
    public static void contar(String cadena) {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == ' ') {
                contador++;
            }
        }
        System.out.println("Hay " + contador + " palabras en la lista.");
    }

    /**
     * Sustituye una palabra por otra
     *
     * @param cadena lista de palabras
     * @return cadena lista resultante después de modificar la cadena
     */
    public static String modificar(String cadena) {
        System.out.println("¿Qué palabra quieres sustituir?");
        String palabraOld = sc.nextLine();
        System.out.println("¿Por qué palabra quieres reemplazarla?");
        String palabraNew = sc.nextLine();
        cadena = cadena.replace(palabraOld, palabraNew);
        return cadena;
    }

    /**
     * Elimina una palabra de la lista
     *
     * @param cadena lista de palabras
     * @return cadena lista de palabras después de eliminar una
     */
    public static String eliminar(String cadena) {
        System.out.println("¿Qué palabra quieres eliminar?");
        String palabra = sc.next();
        cadena = cadena.replace(palabra + " ", "");
        return cadena;
    }

    /**
     * Muestra la lista de palabras
     *
     * @param cadena lista de palabras
     */
    public static void mostrar(String cadena) {
        System.out.println(cadena);

    }


}
