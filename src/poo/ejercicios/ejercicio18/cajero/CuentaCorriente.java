package poo.ejercicios.ejercicio18.cajero;

public class CuentaCorriente {

    String DNI; //solo visible por clases del mismo paquete
    public String nombreTitular; //que sea publico para otras clases
    private float saldo; //porque pide que no sea visible para otras clases

    //Modificar la clase CuentaCorriente para que pueda disponer de un objeto Gestor.

    Gestor gestor;

    // Escribir los métodos necesarios.--> crear un constructor con esto y/o, si es necesario, crear getter y setter

    public Gestor getGestor() {
        return gestor;
    }

    public void setGestor(Gestor gestor) {
        this.gestor = gestor;
    }


    //Todas las cuentas corrientes con las que se va a trabajar pertenecen al mismo banco.
    // Añadir un atributo que almacene el nombre del banco (que es único) en la clase CuentaCorriente.

    static String banco = "International Java Bank";

    // Diseñar un método que permita recuperar y modificar el nombre del banco. --> getter y setter


    public static String getBanco() {

        return banco;
    }

    public static void setBanco(String banco) {

        CuentaCorriente.banco = banco;
    }
    // Crear una cuenta: se necesita el DNI y nombre del titular. El saldo inicial será 0.

    public CuentaCorriente(String DNI, String nombreTitular) {
        this.DNI = DNI;
        this.nombreTitular = nombreTitular;
        this.saldo = 0; //el saldo inicial será 0
    }


    public CuentaCorriente(String DNI, float saldo) {
        this.DNI = DNI;
        this.saldo = saldo;
    }

    public CuentaCorriente(String DNI, String nombre, float saldo) {
        this.DNI = DNI;
        this.nombreTitular = nombre;
        this.saldo = saldo;
    }

    // como saldo es private para poder conocer el saldo desde otra clase necesito un getter


    public float getSaldo() {

        return saldo;
    }


    //Mostrar información

    public void mostrarInformacion() {
        System.out.println("Información de la cuenta:");
        System.out.println("*************************");
        System.out.println("Nombre:\t" + this.nombreTitular);
        System.out.println("DNI:\t" + this.DNI);
        System.out.println("Saldo:\t" + this.saldo + " euros.");
        System.out.println("Banco:\t" + banco);
        //añado la información del gestor
        //System.out.println("Gestor:\t" + this.gestor.nombre);//no funciona
    }

    // Sacar dinero: el método debe indicar si ha sido posible llevar a cabo la operación, si existe saldo suficiente.

    public void retirarDinero(float cantidad) {
        //vemos si tenemos saldo suficiente
        if (cantidad >= saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            saldo = saldo - cantidad;
            System.out.println("Operación realizada correctamente. Saldo actual: " + saldo);
        }

    }
    // Ingresar dinero: se incrementa el saldo.

    public void ingresarDinero(float cantidad) {
        saldo = saldo + cantidad;
        System.out.println("Operación realizada correctamente. Saldo actual: " + saldo);
    }


}
