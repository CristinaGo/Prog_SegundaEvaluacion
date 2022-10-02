package interfaces.ejercicios.ej12biblioteca;

public abstract class Publicacion {
    String codigo;
    String titulo;
    int año;

    public Publicacion(String codigo, String titulo, int año) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.año = año;
    }


}
