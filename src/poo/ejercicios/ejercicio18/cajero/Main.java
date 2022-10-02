package poo.ejercicios.ejercicio18.cajero;

public class Main {
    public static void main(String[] args) {
        //Escribe un programa que compruebe el funcionamiento de ambos métodos.
        //Creamos objetos con el primer constructor
        CuentaCorriente cc1 = new CuentaCorriente("11111111A", 1000);
        // Vamos a ver si lo hemos creado bien mostrando los datos
        cc1.mostrarInformacion();
        System.out.println();
        // Probamos a crear un objeto con el segundo constructor
        CuentaCorriente cc2 = new CuentaCorriente("22222222B", "B.Blazquez", 1000);
        cc2.mostrarInformacion();

        //Escribe un programa para comprobar la visibilidad de los atributos.
        System.out.println(cc1.nombreTitular); //ok, visible, es public
        System.out.println(cc1.DNI); //ok, visible, es default package
        //System.out.println(cc1.saldo); no es visible de otra clase, ni siquiera en el mismo paquete
        System.out.println(cc1.getSaldo());

        //Quiero ver el banco de todas las cuentas
        System.out.println(CuentaCorriente.banco);// tengo que invocarlo desde otra clase con el nombre de la clase a la que pertenece
        System.out.println(); //--> salto de línea

        // Probamos el constructor con nombre, dni y saldo 0.
        CuentaCorriente cc3 = new CuentaCorriente("33333333C", "C.Calvo");
        cc3.mostrarInformacion();
        System.out.println();

        //Probamos el método retirar dinero.
        cc1.retirarDinero(1500);
        System.out.println();
        cc1.retirarDinero(750);
        System.out.println();
        cc1.ingresarDinero(5000);

        //vamos a probar los dos constructores de gestor: creamos dos gestores, uno con cada uno

        Gestor g1 = new Gestor("G.Gonzalez", "123456987", 100_000);

        //Para ver los valores de sus atributos, como no henos creado un método para ello, lo hacemos aquí "a mano"
        System.out.println("\nDatos del primer gestor: " + g1.nombre + " (" + g1.telefono + ") Importe máximo: " + g1.importeMaximo);

        Gestor g2 = new Gestor("G. García", "789654123");

        //Para ver los valores de sus atributos, como no henos creado un método para ello, lo hacemos aquí "a mano"
        System.out.println("\nDatos del segundo gestor: " + g2.nombre + " (" + g2.telefono + ") Importe máximo: " + g2.importeMaximo);

        //Vamos a probar que no podemos cambiar el teléfono.

        g1.nombre = "H. Hernandez";
        //g1.telefono = "5555555"; // no deja porque es final, una vez asignado el valor no cambia

        //Vamos a asignar un gestor a cada una de las cuentas que tenemos
        cc1.setGestor(g1);
        cc1.mostrarInformacion();
        cc2.setGestor(g2);
        cc2.mostrarInformacion();
        cc3.setGestor(g2);
        cc3.mostrarInformacion();

    }
}
