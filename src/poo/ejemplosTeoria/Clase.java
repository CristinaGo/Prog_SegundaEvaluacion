package poo.ejemplosTeoria;

import java.util.Date;

public class Clase {
    public static Date ultimaCreada;
    public static int contadorDeObjetos;

    public Clase() {
        ultimaCreada = new Date();
        contadorDeObjetos++;
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println(Clase.contadorDeObjetos);

        Clase c1 = new Clase();
        System.out.println(Clase.contadorDeObjetos);

        Clase c2 = new Clase();
        System.out.println(Clase.contadorDeObjetos);
    }
}
