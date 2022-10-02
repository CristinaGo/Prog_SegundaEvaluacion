package empresaempleadocliente;

import java.util.ArrayList;

public class Directivo extends Empleado{
    private int categoría;
    ArrayList<Empleado> empleados = new ArrayList<>();


    public Directivo(String nombre, int edad, float sueldoBruto, int categoría) {
        super(nombre, edad, sueldoBruto);
        this.categoría = categoría;
    }

    public void setCategoria(int categoría, float sueldo){
        this.categoría = categoría;
        this.setSueldoBruto(sueldo);
    }

    public void añadirEmpleado(Empleado e){
        empleados.add(e);
    }

    public void quitarEmpleado(Empleado e){
        empleados.remove(e);
    }

    @Override
    public String toString() {
        return "\nDirectivo:" +
                "\n* nombre: " + nombre + '\'' +
                "\n* Edad: " + Edad +
                "\n* sueldoBruto: " + getSueldoBruto() + "€" +
                "\n* sueldoNeto: " + calcularSueldoNeto() +  "€" +
                "\n* categoría: " + categoría +
                "\nEmpleados a su cargo: " +
                "\n**************************************" + "\n" + empleados;
    }

    @Override
    public void mostrarDatos() {
        //super.mostrarDatos();
        System.out.println(toString());
    }




}
