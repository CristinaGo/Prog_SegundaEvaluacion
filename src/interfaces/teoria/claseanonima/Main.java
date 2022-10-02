package interfaces.teoria.claseanonima;

public class Main {
    public static void main(String[] args) {
        Hablante hispanoHablante = new Hablante() {
            @Override
            public void decirHola() {
                System.out.println("¡Hola!");
            }

            @Override
            public void decirAdios() {
                System.out.println("¡Adiós!");
            }
        };

        hispanoHablante.decirHola();
        hispanoHablante.decirAdios();

        Hablante loro = new Hablante() {
            @Override
            public void decirHola() {
                System.out.println("Rosita");
            }

            @Override
            public void decirAdios() {
                System.out.println("Rosita");
            }
        };

        loro.decirHola();
        loro.decirAdios();
    }
}
