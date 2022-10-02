package interfaces.ejercicios.ej13listaspilascolas;

public class TestLista {
    public static void main(String[] args) {

        Lista l = new Lista();

        System.out.println("Prueba mostrar elementos");
        l.mostrarElementos();

        System.out.println("Prueba número elementos");
        System.out.println("Nº elementos: " + l.numeroElementos());

        System.out.println("Prueba añadir al final");
        l.insertarAlFinal(2);
        l.mostrarElementos();

        System.out.println("Prueba añadir al principio");
        l.insertarAlPrincipio(6);
        l.mostrarElementos();

        System.out.println("Prueba añadir en medio");
        l.insertarEnPosicion(1, 8);
        l.mostrarElementos();

        System.out.println("Prueba añadir lista");
        Lista lista2 = new Lista();
        for (int i = 0; i < 5; i++) {
            int numero = (int) (Math.random() * 100);
            lista2.insertarAlFinal(numero);
        }
        System.out.print("Lista a añadir: ");
        lista2.mostrarElementos();
        l.añadirLista(lista2);
        l.mostrarElementos();

        System.out.println("Prueba eliminar por índice");
        l.eliminarElemento(2);
        l.mostrarElementos();

        System.out.println("Prueba obtener elemento");
        Integer i = l.getElemento(4);
        System.out.println(i);

        System.out.println("Prueba obtener número");
        Integer e = l.buscarNumero(80);
        System.out.println(e);

        System.out.println("Nº elementos: " + l.numeroElementos());

        System.out.println("Obtenemos el último elemento de la lista");
        System.out.println(l.getElemento(l.numeroElementos() - 1));

        System.out.println("Prueba método concatena");
        Lista.concatena(l, lista2).mostrarElementos();

    }
}
