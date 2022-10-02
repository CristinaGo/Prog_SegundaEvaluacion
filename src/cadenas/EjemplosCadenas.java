package cadenas;

public class EjemplosCadenas {
    public static void main(String[] args) {
        String cadena = "Hola ¿Qué tal?";
        String cadena1 = "Y dijo: \"Vaya plan\"";
        String vacia = ""; // esta cadena está vacia, no confundir con " " que tiene un espacio ni con null
        System.out.println(cadena);
        System.out.println(cadena1);

        System.out.println(cadena.length());
        System.out.println(cadena.charAt(2));

        //Imprimir el ultimo caracter
        System.out.println(cadena.charAt(cadena.length() - 1));

        //Métodos
        System.out.println("***********Métodos**********");
        // compruebo si está vacía
        System.out.println("¿Cadena vacía?: " + cadena.isEmpty());
        System.out.println("¿Cadena vacía?: " + vacia.isEmpty());

        // comprueba si la cadena consiste en un espacio en blanco
        String blanco = " ";
        System.out.println("¿La cadena es un espacio en blanco? " + blanco.isBlank());

        // cambia la cadena a mayusculas
        System.out.println(cadena.toUpperCase());

        // cambia la cadena a minusculas
        System.out.println(cadena.toLowerCase());

        //comprueba el primer valor de la cadena
        System.out.println(cadena.startsWith("H"));

        //comprueba el ultimo valor de la cadena
        System.out.println(cadena.endsWith("?"));

        // comprueba si la cadena contiene hola
        System.out.println(cadena.contains("hola"));

        //Extraigo los caracteres del 4 al 6
        System.out.println(cadena.substring(3, 6));

        //cambia un caracter de la cadena por otro
        System.out.println(cadena.replace("a", "i"));

        //elimina espacios
        String espacios = "   aaa    ";
        System.out.println(espacios.length());
        espacios = espacios.trim();
        System.out.println(espacios.length());

        //Comparaciones de tipos primitivos
        String primera1 = "primera";
        String segunda1 = "segunda";

        String primera2 = "primera";
        String segunda2 = "SEGUNDA";

        System.out.println(primera1.equals(segunda1));//“primera”.equals(“segunda”)->false
        System.out.println(primera1.equals(primera2)); //“primera”.equals(“primera”)->true

        System.out.println(segunda1.equals(segunda2));//“segunda”.equals(“SEGUNDA”)->false
        System.out.println(segunda1.equalsIgnoreCase(segunda2)); // true
    }
}
