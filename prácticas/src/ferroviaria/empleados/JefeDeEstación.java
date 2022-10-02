package ferroviaria.empleados;

import java.time.LocalDate;

/**
 * Práctica Clases y Objetos
 * @author Cristina Gómez Campos
 */

public class JefeDeEstación {
    private String nombre;
    private String DNI;
    private LocalDate fechaNombramiento;
    public static int jefe;

    public JefeDeEstación(String nombre, String DNI, LocalDate fechaNombramiento) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.fechaNombramiento = fechaNombramiento;
        jefe++;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public LocalDate getFechaNombramiento() {
        return fechaNombramiento;
    }

    public void setFechaNombramiento(LocalDate fechaNombramiento) {
        this.fechaNombramiento = fechaNombramiento;
    }

    @Override
    public String toString() {
        return "JefeDeEstación{" +
                "nombre='" + nombre + '\'' +
                ", DNI='" + DNI + '\'' +
                ", fechaNombramiento='" + fechaNombramiento + '\'' +
                '}';
    }

    public void imprimirDatos(){
        System.out.println(toString());
    }
}
