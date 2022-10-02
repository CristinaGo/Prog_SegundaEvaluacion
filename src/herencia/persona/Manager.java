package herencia.persona;

import java.time.LocalDate;

public class Manager extends Empleado {
    private boolean sonrisa;

    public Manager(String nombre, int añoNacimiento, String dirección, boolean sonrisa, LocalDate fechaContrato, double salario) {
        super(nombre, añoNacimiento, dirección, fechaContrato, salario);
        this.sonrisa = sonrisa;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "fechaContrato=" + fechaContrato +
                ", salario=" + salario +
                ", sonrisa=" + sonrisa +
                ", nombre='" + nombre + '\'' +
                ", añoNacimiento=" + añoNacimiento +
                ", dirección='" + dirección + '\'' +
                '}';
    }

    public void mostrarDatos() {
        System.out.println(toString());
    }
}
