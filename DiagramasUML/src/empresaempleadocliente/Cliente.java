package empresaempleadocliente;

public class Cliente extends Persona{
    private String telefono;

    public Cliente(String nombre, int edad, String telefono) {
        super(nombre, edad);
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "telefono='" + telefono + '\'' +
                ", nombre='" + nombre + '\'' +
                ", Edad=" + Edad +
                '}';
    }

    public void mostrarDatos(){

        System.out.println(toString());
    }
}
