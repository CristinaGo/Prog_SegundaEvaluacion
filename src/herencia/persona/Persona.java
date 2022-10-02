package herencia.persona;

public class Persona {
    //Ponemos los modificadores más "adecuados"
    protected String nombre;
    protected int añoNacimiento;
    protected String dirección;

    public Persona(String nombre, int añoNacimiento, String dirección) {
        this.nombre = nombre;
        this.añoNacimiento = añoNacimiento;
        this.dirección = dirección;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", añoNacimiento=" + añoNacimiento +
                ", dirección='" + dirección + '\'' +
                '}';
    }

    public void imprimeDatos() {
        System.out.println(toString());
    }
}
