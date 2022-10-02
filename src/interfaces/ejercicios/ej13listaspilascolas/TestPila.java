package interfaces.ejercicios.ej13listaspilascolas;

public class TestPila {
    public static void main(String[] args) {

        System.out.println("Creamos pila");
        Pila p = new Pila();
        p.mostrar();
        System.out.println("Apilamos 5 números");
        for (int i = 0; i < 5; i++) {
            int numero = (int) (Math.random() * 100);
            p.apilar(numero);
        }
        p.mostrar();
        System.out.println("Probamos método desapilar");
        for (int i = 0; i < 5; i++) {
            System.out.println("Desapilando: " + p.desApilar());
            p.mostrar();
        }
        ;
    }
}
