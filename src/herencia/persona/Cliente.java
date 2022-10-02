package herencia.persona;

public class Cliente extends Persona {

    private long numContrato;
    private boolean clienteOro;

    public Cliente(String nombre, int añoNacimiento, String dirección, long numContrato, boolean clienteOro) {
        super(nombre, añoNacimiento, dirección);
        this.numContrato = numContrato;
        this.clienteOro = clienteOro;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "numContrato=" + numContrato +
                ", clienteOro=" + clienteOro +
                ", nombre='" + nombre + '\'' +
                ", añoNacimiento=" + añoNacimiento +
                ", dirección='" + dirección + '\'' +
                '}';
    }

    public void mostrarDatos() {
        System.out.println(toString());
    }
}


