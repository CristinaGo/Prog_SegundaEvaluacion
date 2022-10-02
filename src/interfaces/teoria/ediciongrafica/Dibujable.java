package interfaces.teoria.ediciongrafica;

/**
 * creamos una interfaz con métodos abstractos
 */

public interface Dibujable {

    public void dibujarRecta();

    public void dibujarCurva();

    public void dibujarLibre();

    private void digoHola() {
        System.out.println("Hola");
    }
}
