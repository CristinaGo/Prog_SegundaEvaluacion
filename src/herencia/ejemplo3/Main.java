package herencia.ejemplo3;

public class Main {
    public static void main(String[] args) {
        Mamiferos m = new Mamiferos();
        System.out.println(m.saludar());

        Gato g = new Gato();
        System.out.println(g.saludar());
        System.out.println(g.saluda(5));

        Humano h = new Humano();
        System.out.println(h.saludar());
    }
}
