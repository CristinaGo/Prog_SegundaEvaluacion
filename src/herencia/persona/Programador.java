package herencia.persona;

import java.time.LocalDate;
import java.util.ArrayList;

public class Programador extends Empleado {
    ArrayList<String> lenguajes = new ArrayList<>();

    public Programador(String nombre, int añoNacimiento, String dirección, ArrayList<String> lenguajes, LocalDate fechaNacimiento, double salario) {
        super(nombre, añoNacimiento, dirección, fechaNacimiento, salario);
        this.lenguajes = lenguajes;
    }

    @Override
    public String toString() {
        return "Programador{" +
                "fechaContrato=" + fechaContrato +
                ", salario=" + salario +
                ", nombre='" + nombre + '\'' +
                ", añoNacimiento=" + añoNacimiento +
                ", dirección='" + dirección + '\'' +
                ", lenguajes=" + lenguajes +
                '}';
    }

    public void mostrarDatos() {
        System.out.println(toString());
    }
}
