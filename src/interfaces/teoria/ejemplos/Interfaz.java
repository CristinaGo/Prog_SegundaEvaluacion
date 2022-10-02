package interfaces.teoria.ejemplos;

public interface Interfaz {
    public final int CONSTANTE = 0;
    //String nombre; no puede tener parametros

    public void metodoAbstracto();

    default void métodoPorDefecto() {
        // estos métodos van implementados
        System.out.println("método por defecto");
        metodoPrivado();
    }

    private void metodoPrivado() {
        System.out.println("Interfaz: método privado");
    }

    static void metodoEstatico() {

        System.out.println("método estático");
    }

}
