package interfaces.teoria.metodospordefecto;

public interface Mover {
    void pasoAdelante();

    void girarIzquierda();

    void girarDerecha();

    default void darselaVuelta() {
        girarIzquierda();
        girarIzquierda();
    }
}
