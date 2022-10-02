package empresaempleadocliente;



public class Main {
    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("E.Estévez", 18);
        Empleado empleado2 = new Empleado("J.Juárez", 30, 30000);
        Empleado empleado3 = new Empleado("M.Martínez", 40, 36000);

        System.out.println("*** Creamos tres empleados y mostramos sus datos ***");
        System.out.println("****************************************************");
        empleado1.mostrarDatos();
        empleado2.mostrarDatos();
        empleado3.mostrarDatos();

        System.out.println("\nSube el sueldo del primero a 15.000");
        System.out.println("****************************************************");
        empleado1.setSueldoBruto(15000);
        empleado1.mostrarDatos();

        System.out.println("\n Creamos dos clientes y mostramos sus datos");
        System.out.println("****************************************************");
        Cliente cliente1 = new Cliente("J.Jorge", 40, "123457845");
        Cliente cliente2 = new Cliente("S.Suarez", 38, "987563212");
        cliente1.mostrarDatos();
        cliente2.mostrarDatos();

        System.out.println("\n Creamos un directivo y mostramos sus datos");
        System.out.println("****************************************************");
        Directivo jefe = new Directivo("N. Navarro", 50, 4000, 3);
        jefe.añadirEmpleado(empleado1);
        jefe.añadirEmpleado(empleado2);
        jefe.añadirEmpleado(empleado3);
        jefe.mostrarDatos();

        System.out.println("\n*** Ponemos este directivo como jefe de todos los empleados");
        System.out.println("*************************************************************");
        /*empleado1.setDirectivo(jefe);
        empleado2.setDirectivo(jefe);
        empleado3.setDirectivo(jefe);
        empleado1.mostrarDatos();*/

        System.out.println("\n Creamos otro directivo y mostramos sus datos");
        System.out.println("****************************************************");
        Directivo jefe2 = new Directivo("O. Ortiz", 28, 3000, 5);
        jefe.quitarEmpleado(empleado1);
        jefe.mostrarDatos();
        jefe2.añadirEmpleado(empleado1);
        jefe2.mostrarDatos();

        System.out.println("\n Creamos una empresa");
        System.out.println("****************************************************");
        Empresa lcc = new Empresa("lcc");
        lcc.añadirEmpleado(empleado1);
        lcc.añadirEmpleado(empleado2);
        lcc.añadirEmpleado(empleado3);
        lcc.añadirEmpleado(jefe);
        lcc.añadirEmpleado(jefe2);
        lcc.mostrarEmpleados();
        lcc.añadirCliente(cliente1);
        lcc.añadirCliente(cliente2);
        lcc.mostrarCliente();

        System.out.println("****************************************************");
        lcc.quitarCliente(cliente2);
        lcc.quitarEmpleado(empleado2);
        lcc.mostrarCliente();
        lcc.mostrarEmpleados();

    }
}
