import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Ahorcado {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        char[] palabra = crearPalabraSecreta();

        int intentos = 6;
        pintarAhorcado(intentos);

        char[] adivinadas = new char[palabra.length];
        Arrays.fill(adivinadas, '_');
        System.out.println(Arrays.toString(adivinadas));
       /*
        for (int i = 0; i < adivinadas.length; i++) {
            adivinadas[i] = '_';
        }
        */
        System.out.println("****************** JUGADOR 2 ******************");
        System.out.println("***********************************************");
        do {
            System.out.print("Adivinar: ");
            for (int i = 0; i < adivinadas.length; i++) {
                System.out.println(adivinadas[1]);
            }
            System.out.println();

            char letra = sc.next().toLowerCase().charAt(0);
            boolean esta = false;
            for (int i = 0; i < palabra.length; i++) {
                if (palabra[i] == letra){
                    adivinadas[i] = letra;
                    esta = true;
                }
            }
            //System.out.println(Arrays.toString(adivinadas));
            if (!esta){
                intentos--;
                System.out.println(intentos);
                pintarAhorcado(intentos);
            }

            if (Arrays.equals(palabra, adivinadas)){
                System.out.println("¡¡¡GANASTE!!!");
                break;
            }

        }while (intentos > 0);
    }

    public static char[] crearPalabraSecreta() {
        System.out.println("****************** JUGADOR 1 ******************");
        System.out.println("***********************************************");
        System.out.println("Introduce la palabra a averiguar");
        String palabra = sc.next();

        char[] adivinar = palabra.toCharArray();
        System.out.println(Arrays.toString(adivinar));
        return adivinar;
    }

    public static void pintarAhorcado(int intentos) {
        switch (intentos) {
            case 0:
                System.out.println("+---+");
                System.out.println("|   |");
                System.out.println("|   0");
                System.out.println("|  -|-");
                System.out.println("|  /\\");
                System.out.println("|     ");
                System.out.println("=========");
                System.out.println("----- PERDISTE -------");
                break;
            case 1:
                System.out.println("+---+");
                System.out.println("|   |");
                System.out.println("|   0");
                System.out.println("|  -|-");
                System.out.println("|     ");
                System.out.println("|     ");
                System.out.println("=========");
                break;
            case 2:
                System.out.println("+---+");
                System.out.println("|   |");
                System.out.println("|   0");
                System.out.println("|  -|");
                System.out.println("|     ");
                System.out.println("|     ");
                System.out.println("=========");
                break;
            case 3:
                System.out.println("+---+");
                System.out.println("|   |");
                System.out.println("|   0");
                System.out.println("|   |-");
                System.out.println("|     ");
                System.out.println("|     ");
                System.out.println("=========");
                break;
            case 4:
                System.out.println("+---+");
                System.out.println("|   |");
                System.out.println("|   0");
                System.out.println("|   |");
                System.out.println("|     ");
                System.out.println("|     ");
                System.out.println("=========");
                break;
            case 5:
                System.out.println("+---+");
                System.out.println("|   |");
                System.out.println("|   0");
                System.out.println("|    ");
                System.out.println("|     ");
                System.out.println("|     ");
                System.out.println("=========");
                break;
            case 6:
                System.out.println("+---+");
                System.out.println("|   |");
                System.out.println("|    ");
                System.out.println("|    ");
                System.out.println("|     ");
                System.out.println("|     ");
                System.out.println("=========");
                break;
        }
    }
}
