package interfaces.ejercicios.ej13listaspilascolas;

public class Pila {
    Lista pila;

    public Pila() {
        this.pila = new Lista();
    }

    public void apilar(Integer elemento) {
        pila.insertarAlFinal(elemento);
    }

    public Integer desApilar() {
        Integer cima = pila.getElemento(pila.numeroElementos() - 1);
        pila.eliminarElemento(pila.numeroElementos() - 1);
        return cima;
    }

    public void mostrar() {
        pila.mostrarElementos();
    }
}
