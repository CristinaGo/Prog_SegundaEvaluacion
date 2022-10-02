package interfaces.ejercicios.ej12biblioteca;

public class Libro extends Publicacion implements Prestable {

    boolean prestado;


    public Libro(String codigo, String titulo, int año) {
        super(codigo, titulo, año);
        this.prestado = false;
    }


    @Override
    public String toString() {
        return "Libro{" +
                "prestado=" + prestado +
                ", codigo='" + codigo + '\'' +
                ", titulo='" + titulo + '\'' +
                ", año=" + año +
                '}';
    }

    public int getAño() {
        return año;
    }

    public String getCodigo() {
        return codigo;
    }

    @Override
    public void prestar() {
        this.prestado = true;
    }

    @Override
    public void devolver() {
        this.prestado = false;
    }

    @Override
    public void prestado() {
        if (prestado) {
            System.out.println("Está prestado");
        } else {
            System.out.println("No está prestado");
        }
    }
}
