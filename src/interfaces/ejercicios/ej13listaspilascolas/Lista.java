package interfaces.ejercicios.ej13listaspilascolas;

import java.util.ArrayList;

public class Lista {
    ArrayList<Integer> lista;

    public Lista() {
        this.lista = new ArrayList<>();
    }

    //Obtener el número de elementos insertados en la lista.
    public int numeroElementos() {
        return lista.size();
    }

    //Insertar un número al final de la lista.
    public void insertarAlFinal(Integer elemento) {
        lista.add(elemento);
    }

    //Insertar un número al principio de la lista.
    public void insertarAlPrincipio(Integer elemento) {
        lista.add(0, elemento);
    }

    //Insertar un número en un lugar de la lista cuyo índice, se pasa como parámetro.
    public void insertarEnPosicion(int indice, Integer elemento) {
        lista.add(indice, elemento);
    }

    //Añadir al final de la lista los elementos de otra lista que se pasa como parámetro.
    public void añadirLista(Lista l) {
        lista.addAll(l.lista);

    }

    //Eliminar un elemento cuyo índice en la lista se pasa como parámetro.
    public void eliminarElemento(int indice) {
        lista.remove(indice);
    }

    //Obtener el elemento cuyo índice se pasa como parámetro.
    public Integer getElemento(int indice) {
        return lista.get(indice);
    }

    //Buscar un número en la lista, devolviendo el índice del primer lugar donde se encuentre. Si no está, devolverá -1.
    public int buscarNumero(Integer elemento) {
        return lista.indexOf(elemento);
    }

    //Mostrar los elementos de la lista por consola.
    public void mostrarElementos() {
        System.out.println(lista);
    }

    //Añadir un método estático
    public static Lista concatena(Lista l1, Lista l2) {
        Lista l = new Lista();
        l.añadirLista(l1);
        l.añadirLista(l2);
        return l;
    }
}
