package ferroviaria.empleados;

/**
 * Práctica Clases y Objetos
 * @author Cristina Gómez Campos
 */

public class Mecánico {
    private String nombre;
    private String teléfono;
    Especialidad especialidad;
    public static int mecanico;

    public Mecánico(String nombre, String teléfono, Especialidad especialidad) {
        this.nombre = nombre;
        this.teléfono = teléfono;
        this.especialidad = especialidad;
        mecanico++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTeléfono() {
        return teléfono;
    }

    public void setTeléfono(String teléfono) {
        this.teléfono = teléfono;
    }


    @Override
    public String toString() {
        return "Mecánico{" +
                "nombre='" + nombre + '\'' +
                ", teléfono='" + teléfono + '\'' +
                ", especialidad=" + especialidad +
                '}';
    }

    public void imprimirDatos(){
        System.out.println(toString());
    }
}

