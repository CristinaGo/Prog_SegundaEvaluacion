package interfaces.teoria.metodospordefecto;

public class Batman implements Mover {
    @Override
    public void pasoAdelante() {
        System.out.println("adelante");
    }

    @Override
    public void girarIzquierda() {
        System.out.println("inquierda");
    }

    @Override
    public void girarDerecha() {
        System.out.println("derecha");

    }

    @Override
    public void darselaVuelta() {
        //Mover.super.darseVuelta();
        girarDerecha();
        girarDerecha();
    }
}
