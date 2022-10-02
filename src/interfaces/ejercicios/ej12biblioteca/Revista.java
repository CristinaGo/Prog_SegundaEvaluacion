package interfaces.ejercicios.ej12biblioteca;

public class Revista extends Publicacion {

    int número;

    public Revista(String codigo, String titulo, int año, int número) {
        super(codigo, titulo, año);
        this.número = número;
    }


    @Override
    public String toString() {
        return "Revista{" +
                "codigo='" + codigo + '\'' +
                ", titulo='" + titulo + '\'' +
                ", año=" + año +
                ", número=" + número +
                '}';
    }

    public int getAño() {
        return año;
    }

    public String getCodigo() {
        return codigo;
    }

}
