package poo.enumerados;

public class Main {
    public static void main(String[] args) {
        //para utlizarlos, los declaramos como un objeto o una variable más

        Estado a = Estado.ACTIVO;

        // métodos que se pueden utlizar
        System.out.println("Métodos enumerados: ");
        System.out.println("********************");
        // recuperar el valor concreto de una variable enumerado
        System.out.println("name(): " + a.name());
        //values() --> podemos guardar todos los valores de un enumerado en un array
        Estado[] estados = Estado.values(); //--> entonces este array lo puedes recorrer con un for
        for (int i = 0; i < estados.length; i++) {
            System.out.println("Valor " + i + ": " + estados[i]);
        }
        //para ver si es igual
        if (a.equals(Estado.ACTIVO)) {
            System.out.println("Estás activo");
        }
    }
}
