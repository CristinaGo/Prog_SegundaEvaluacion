package poo.ejercicios.ejercicio19;

public class Enumerados {
    enum Estaciones {
        PRIMAVERA,
        VERANO,
        OTOÑO,
        INVIERNO
    }

    enum PartesDia {
        MAÑANA,
        MEDIODÍA,
        TARDE,
        NOCHE
    }

    enum ComidasDia {
        DESAYUNO,
        ALMUERZO,
        MERIENDA,
        CENA
    }

    public static void main(String[] args) {
        Estaciones ahora = Estaciones.INVIERNO;
        PartesDia ahorita = PartesDia.TARDE;
        ComidasDia luego = ComidasDia.CENA;

        Estaciones[] estaciones = Estaciones.values();
        for (int i = 0; i < estaciones.length; i++) {
            System.out.println("Estación del año " + i + ": " + estaciones[i]);
        }
        PartesDia[] partesDia = PartesDia.values();
        for (int i = 0; i < partesDia.length; i++) {
            System.out.println("Parte del día " + i + ": " + partesDia[i]);
        }
        ComidasDia[] comidasDia = ComidasDia.values();
        for (int i = 0; i < comidasDia.length; i++) {
            System.out.println("Comidas del día " + i + ": " + comidasDia[i]);
        }
    }

}
