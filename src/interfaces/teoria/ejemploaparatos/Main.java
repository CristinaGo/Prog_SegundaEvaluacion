package interfaces.teoria.ejemploaparatos;

public class Main {
    public static void main(String[] args) {
        Kettle tetera = new Kettle("T01", 2);
        tetera.on();
        mostrarEstado(tetera);
        tetera.of();
        mostrarEstado(tetera);

    }

    //metodo estático para mostrar el estado
    public static void mostrarEstado(Kettle k) {
        if (k.on) {
            System.out.println("La tetera está encendida");
        } else {
            System.out.println("La tetera está apagada");
        }
    }
}
