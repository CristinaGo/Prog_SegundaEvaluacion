package poo.ejercicios.ejercicio16.banco;

public class Main {
    public static void main(String[] args) {
        Usuario propietario = new Usuario("demo", "Ale", "Gómez");
        Cuenta c = new Cuenta("12547890", 1000, propietario);

        mostrarCuenta(c);
    }

    public static void mostrarCuenta(Cuenta cuenta) {
        System.out.println("Datos de la cuenta: ");
        System.out.println("********************");
        System.out.println("* Código:\t" + cuenta.getCódigo());
        System.out.println("* Balance:\t" + cuenta.getBalance());
        System.out.println("* Propietario del propietario");
        System.out.println("   Nombre: " + cuenta.getPropietario().getNombre());
        System.out.println("   Apellidos: " + cuenta.getPropietario().getApellidos());
    }
}
