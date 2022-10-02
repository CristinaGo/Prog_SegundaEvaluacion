package herencia.ejemplo3;

public class Gato extends Mamiferos {


    @Override
    public String saludar() {
        return "Miau";
    }

    public String saluda(int n) {
        String cadena = "miau";
        for (int i = 0; i < n; i++) {
            cadena = cadena + " " + "miau ";

        }
        return cadena;
    }
}
