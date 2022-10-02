package herencia.persona;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Pepa", 2000, "Melancolía 3");

        persona1.imprimeDatos();

        Cliente cliente1 = new Cliente("Jose", 2001, "Fantasía 2", 456789, true);

        cliente1.mostrarDatos();

        Empleado empleado1 = new Empleado("Lara", 2001, "Marejada 4", LocalDate.of(2005, 05, 21), 1500);

        empleado1.mostrarDatos();

        ArrayList<String> lenguajes = new ArrayList<>();
        lenguajes.add("Java");
        lenguajes.add("Javascript");
        lenguajes.add("PHP");
        Programador programador1 = new Programador("Tecla", 1987, "Que pena,17", lenguajes, LocalDate.of(2023, 9, 1), 2500);
        programador1.mostrarDatos();

        Manager jefe = new Manager("Boss", 2020, "La pena, 23", true, LocalDate.of(2021, 05, 02), 3000);
        jefe.mostrarDatos();
    }


}
