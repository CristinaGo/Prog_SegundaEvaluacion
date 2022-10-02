package herencia.persona;

import java.time.LocalDate;

public class Empleado extends Persona {
    protected LocalDate fechaContrato;
    protected double salario;

    public Empleado(String nombre, int añoNacimiento, String dirección, LocalDate fechaContrato, double salario) {
        super(nombre, añoNacimiento, dirección);
        this.fechaContrato = fechaContrato;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "fechaContrato=" + fechaContrato +
                ", salario=" + salario +
                ", nombre='" + nombre + '\'' +
                ", añoNacimiento=" + añoNacimiento +
                ", dirección='" + dirección + '\'' +
                '}';
    }

    public void mostrarDatos() {
        System.out.println(toString());
    }

    ;
}
