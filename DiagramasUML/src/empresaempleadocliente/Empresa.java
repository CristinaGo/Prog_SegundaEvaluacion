package empresaempleadocliente;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    ArrayList<Empleado> empleados = new ArrayList<>();
    ArrayList<Cliente> clientes = new ArrayList<>();


    public Empresa(String nombre){
        this.nombre = nombre;
    }
    public void añadirEmpleado(Empleado e){
        empleados.add(e);
    }

    public void quitarEmpleado(Empleado e){
        empleados.remove(e);
    }

    public void añadirCliente(Cliente c){
        clientes.add(c);
    }

    public void quitarCliente(Cliente c){
        clientes.remove(c);
    }

     public void mostrarEmpleados(){
         System.out.println("Empleado de la empresa " + nombre);
         System.out.println("*******************************");
         for (Empleado elem : empleados) {
             System.out.println(elem.nombre);
         }
     }
    public void mostrarCliente(){
        System.out.println("Cliente de la empresa " + nombre);
        System.out.println("*******************************");
        for (Cliente elem : clientes) {
            System.out.println(elem.nombre);
        }
    }
}
