package poo.ejercicios.ejercicio18.cajero;

public class Gestor {
    //El nombre será público y
    public String nombre;
    // Un gestor, una vez asignado, no podrá cambiar su número de teléfono. Y todos el mundo podrá consultarlo.
    public final String telefono; //--> final sirve para hacer constantes. public porque todos puedes consultarlo
    // el importe máximo sólo será visible por clases que estén en el mismo paquete.
    float importeMaximo;


    //Un gestor tendrá siempre un nombre y un teléfono.
    // --> cada vez que creo un objeto gestor le tengo que dar esos valores
    // Si no se asigna, el importe máximo autorizado por operación será de 10000 euros.
    // --> dos constructores: uno con importemax y otro no

    public Gestor(String nombre, String telefono, float importeMaximo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.importeMaximo = importeMaximo;
    }

    public Gestor(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.importeMaximo = 10_000;
    }


}
