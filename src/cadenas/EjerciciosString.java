package cadenas;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class EjerciciosString {
    // Declaramos aquí el Scanner con la palabra clave static, para que se pueda utilizar el objeto sc en toda la clase
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Todos los ejercicios menos el 16 piden una cadena de texto por teclado
        // La pedimos aquí mismo, y después le pasaremos la cadena al método como parámetro
        System.out.println("Introduce una cadena de texto: ");
        String cadena = sc.nextLine();


        //ejercicio01(cadena); // entre paréntesis tengo que poner una variable String
        //ejercicio02(cadena);
        //ejercicio03(cadena);
        //ejercicio04(cadena);
        //ejercicio05(cadena);
        //ejercicio06(cadena);
        //ejercicio07(cadena);
        ejercicio08(cadena);
        //ejercicio09(cadena);
        //ejercicio10(cadena);
        //ejercicio11(cadena);
        //ejercicio12(cadena);
        //ejercicio13(cadena);
        //ejercicio14(cadena);
        //ejercicio15(cadena);
        // Escribir aquí un menú en que preguntamos al usuario qué ejercicio quiere realizar
        // A continuación según la opción elegida se invoca al método correspondiente al ejercicio seleccionado

    }

    public static void ejercicio01(String cad) {
        /*
        Ejercicio 1
        Escribir por pantalla cada carácter de una cadena introducida por teclado.
         */
        // la cadena entra por parámetro (entre los paréntesis)
        System.out.println("\nEjercicio 1");
        System.out.println("===========");
        for (int i = 0; i < cad.length(); i++) {
            System.out.print("'" + cad.charAt(i) + "'");
        }
    }

    public static void ejercicio02(String cadena) {
        /*
        Ejercicio 2
        Realizar un programa que comprueba si una cadena leída por teclado comienza por una
        subcadena introducida por teclado.
         */
        System.out.println("\nEjercicio 2");
        System.out.println("===========");
        System.out.println("Introduce ahora la subcadena:");
        String subcadena = sc.nextLine();
        System.out.println(cadena.startsWith(subcadena)); // "Esto es todo".startsWith("Esto no"); --> true
    }

    public static void ejercicio03(String cadena) {
        /*
        Ejercicio 3
        Reemplazar caracteres: escribe un programa que lea una cadena de texto y reemplace
        todas las ocurrencias de la letra ‘a’ con la letra ‘b’. A continuación debe imprimir la cadena
        resultante.
         */
        System.out.println("\nEjercicio 3");
        System.out.println("===========");
        cadena = cadena.replace("a", "i");
        System.out.println(cadena);
    }


    public static void ejercicio04(String cadena) {
        /*
        Ejercicio 4
        Comprobar si termina con...: escribe un programa que lea el nombre de una ciudad y
        compruebe si el nombre termina con “burgo”. El programa debe imprimir true o false.
         */
        System.out.println("\nEjercicio 4");
        System.out.println("===========");
        boolean resultado = cadena.endsWith("burgo");
        System.out.println(resultado);

    }

    public static void ejercicio05(String cadena) {
        /*
        Ejercicio 5
        Comprobar si comienza con... ignorando mayúsculas y minúsculas: escribe un programa
        que compruebe si una cadena dada comienza por “J”, sin que tenga en cuenta si está en
        mayúsculas o minúsculas. El programa debe imprimir true o false.
         */
        System.out.println("\nEjercicio 5");
        System.out.println("===========");
        String primeraletra = cadena.substring(0, 1);
        boolean empiezaPorJ = primeraletra.equalsIgnoreCase("j");
        System.out.println(empiezaPorJ);

        //Forma más resumida
        //System.out.println(cadena.substring(0,1).equalsIgnoreCase("j"));

    }

    public static void ejercicio06(String cadena) {
        /*
        Ejercicio 6
        Comparar cadenas ignorando los espacios en blanco: escribe un programa que lea dos
        cadenas y las compare sin tener en cuenta los espacios en blanco. El programa debería
        imprimir true si son iguales, false en caso contrario.
         */
        System.out.println("\nEjercicio 6");
        System.out.println("===========");
        System.out.println("Introduce otra cadena de texto: ");
        String cadena2 = sc.nextLine();
        String cadena1SinEspacios = cadena.replace(" ", "");
        String cadena2SinEspacios = cadena2.replace(" ", "");
        System.out.println(cadena1SinEspacios.equals(cadena2SinEspacios));
    }

    public static void ejercicio07(String cadena) {
        /*
        Ejercicio 7
        Extraer una subcadena: escribe un programa que lea una cadena y dos números enteros
        para indicar los límites inferior y superior respectivamente de un rango dentro de las
        posiciones de los caracteres de la cadena. Imprime la subcadena indicada por el rango: a)
        suponiendo que ambos números siempres son mayores o iguales a 0 y menores que la
        longitud de la cadena; b) Validando que sucede a).
         */
        System.out.println("\nEjercicio 7");
        System.out.println("===========");

        int inf, sup;
        do {
            System.out.println("Introduce primer número del rango");
            inf = sc.nextInt();
            System.out.println("Introduce último número del rango");
            sup = sc.nextInt();
            if (inf < 0 || sup > cadena.length() || inf > cadena.length() || sup < 0) {
                System.out.println("Datos incorrectos, vuelvelos a introducir");
            }
        } while (inf < 0 || sup > cadena.length() || inf > cadena.length() || sup < 0);
        String subcadena = cadena.substring(inf - 1, sup);
        System.out.println(subcadena);

    }

    public static void ejercicio08(String cadena) {
        /*
        Ejercicio 8
        Si tenemos una cadena con un nombre y apellidos, realizar un programa que muestre las
        iniciales en mayúsculas.
         */
        System.out.println("\nEjercicio 8");
        System.out.println("===========");
        //truco: nombre y apellidos están separados por espacios
        String[] trozos = cadena.split(" ");
        //System.out.println(Arrays.toString(trozos));
        //imprimir el primer caracter de cada elemento del array
        for (int i = 0; i < trozos.length; i++) {
            System.out.print(trozos[i].substring(0, 1).toUpperCase());

        }

    }

    public static void ejercicio09(String cadena) {
        /*
        Ejercicio 9
        Realizar un programa que, dada una cadena de caracteres, genere otra cadena resultado de
        invertir la primera.
         */
        System.out.println("\nEjercicio 9");
        System.out.println("===========");
        String inversa = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            inversa = inversa + cadena.charAt(i);
            System.out.println(inversa);
        }
    }

    public static void ejercicio10(String cadena) {
        /*
        Ejercicio 10
        Pide una cadena y dos caracteres por teclado (valida que sea un carácter), sustituye la
        aparición del primer carácter en la cadena por el segundo carácter
         */
        System.out.println("\nEjercicio 10");
        System.out.println("===========");
        //pedir dos caracteres
        System.out.println("Introduce el primer caracter");
        char c1 = sc.nextLine().charAt(0);
        System.out.println("Introduce el segundo caracter");
        char c2 = sc.nextLine().charAt(0);

        //como el replace no lo puedo utilizar porque reemplaza todos
        // y no puedo hacer una sustitucion directa en la cadena
        // lo que voy a ahcer es convertir el string en un array de caracteres
        char[] caracteres = new char[cadena.length()];

        //rellenamos el array con caracteres
        for (int i = 0; i < caracteres.length; i++) {
            caracteres[i] = cadena.charAt(i);
        }

        //ahora ya tengo un array de caracteres y se ouede hacer sustituciones concretas
        //ahora busco la primera paricion del caracter c1
        for (int i = 0; i < caracteres.length; i++) {
            if (caracteres[i] == c1) {
                caracteres[i] = c2;
                break;
            }

        }
        // System.out.println(Arrays.toString(caracteres));
        //imprimirlo no en forma de array
        for (char caracter : caracteres) {
            System.out.print(caracter);

        }

    }

    public static void ejercicio11(String cadena) {
        /*
        Ejercicio 11
        Realizar un programa que lea una cadena por teclado y convierta las mayúsculas a
        minúsculas y viceversa.
         */
        System.out.println("\nEjercicio 11");
        System.out.println("===========");
        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isLowerCase(cadena.charAt(i))) {
                System.out.print(Character.toUpperCase(cadena.charAt(i)));
            } else {
                System.out.print(Character.toLowerCase(cadena.charAt(i)));
            }
        }
    }

    public static void ejercicio12(String cadena) {
        /*
        Ejercicio 12
        Realizar un programa que compruebe si una cadena contiene una subcadena. Las dos
        cadenas se introducen por teclado.
         */
        System.out.println("\nEjercicio 12");
        System.out.println("===========");
        System.out.println("Introduce una subcadena de texto:");
        String subcadena = sc.nextLine();
        System.out.println(cadena.contains(subcadena));


    }

    public static void ejercicio13(String cadena) {
        /*
        Ejercicio 13
        Introducir una cadena de caracteres e indicar si es un palíndromo. Una palabra palíndroma
        es aquella que se lee igual adelante que atrás.
         */
        //La profe lo hizo diferente con varios método --> mirar
        System.out.println("\nEjercicio 13");
        System.out.println("===========");
        //quito espacios
        String cadenaSinEspacios = cadena.replace(" ", "");
        // otra cadena pero invertida
        String inversa = "";
        for (int i = cadenaSinEspacios.length() - 1; i >= 0; i--) {
            inversa = inversa + cadenaSinEspacios.charAt(i);
        }
        //System.out.println(inversa);
        //comparo
        if (cadenaSinEspacios.equalsIgnoreCase(inversa)) {
            System.out.println("Es un palíndromo");
        } else {
            System.out.println("No es un palíndromo");
        }
    }

    public static void ejercicio14(String cadena) {
        /*
        Ejercicio 14
        Suponiendo que hemos introducido una cadena por teclado que representa una frase
        (palabras separadas por espacios), realiza un programa que cuente cuántas palabras tiene
         */
        System.out.println("\nEjercicio 14");
        System.out.println("===========");
        String[] palabra = cadena.split(" ");
        System.out.println("La cadena contiene " + palabra.length + " palabras");
    }

    public static void ejercicio15(String cadena) {
        /*
        Ejercicio 15
        Pide una cadena y un carácter por teclado y muestra cuantas veces aparece el carácter en la
        cadena.
         */
        System.out.println("\nEjercicio 15");
        System.out.println("===========");
        System.out.println("Introduce el caracter");
        String caracter = sc.nextLine().substring(0, 1);
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.substring(i, i + 1).equals(caracter)) {
                contador++;
            }

        }
        System.out.println("El carácter " + caracter + " aparece " + contador + " veces.");

    }

}
