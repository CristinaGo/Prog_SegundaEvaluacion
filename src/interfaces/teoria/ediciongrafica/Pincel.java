package interfaces.teoria.ediciongrafica;

public class Pincel extends Herramienta implements Dibujable {
    public Pincel(int grosor, String color) {
        super(grosor, color);
    }

    @Override
    public void dibujarRecta() {
        System.out.println("recta lapiz");
    }

    @Override
    public void dibujarCurva() {
        System.out.println("curva lapiz");
    }

    @Override
    public void dibujarLibre() {
        System.out.println("libre lapiz");
    }
}
