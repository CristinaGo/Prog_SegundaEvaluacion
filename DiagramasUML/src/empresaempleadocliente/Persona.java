package empresaempleadocliente;

public abstract class Persona {
    protected String nombre;
    protected int Edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        Edad = edad;
    }

    public void mostrarDatos(){

        System.out.println(toString());
    }
}
