package ferroviaria;

import ferroviaria.empleados.Especialidad;
import ferroviaria.empleados.JefeDeEstación;
import ferroviaria.empleados.Maquinista;
import ferroviaria.empleados.Mecánico;
import ferroviaria.maquinaria.Locomotora;
import ferroviaria.maquinaria.Tren;
import ferroviaria.maquinaria.Vagon;

import java.time.LocalDate;

/**
 * Práctica Clases y Objetos
 * @author Cristina Gómez Campos
 */

public class Main {
    public static void main(String[] args) {

        System.out.println("****************************************************************************\n");

        Maquinista maquinista1 = new Maquinista("Pepe","1234567F",1500,"1");
        System.out.println("Datos del maquinista " + maquinista1.getNombre());
        maquinista1.imprimirDatos();



        Maquinista maquinista2 = new Maquinista("Marta","4561237P",1800,"1");
        System.out.println("\nDatos del maquinista " + maquinista2.getNombre());
        maquinista2.imprimirDatos();

        System.out.println("\n****************************************************************************\n");

        Mecánico mecanico1 = new Mecánico("H.Hidraulico","789653214", Especialidad.HIDRÁULICA);
        System.out.println("Datos del mecánico " + mecanico1.getNombre());
        mecanico1.imprimirDatos();
        Mecánico mecanico2 = new Mecánico("F. Frenador","654123254", Especialidad.FRENOS);
        System.out.println("\nDatos del mecánico " + mecanico2.getNombre());
        mecanico1.imprimirDatos();
        Mecánico mecanico3 = new Mecánico("E.Electricista","689653214", Especialidad.ELECTRICIDAD);
        System.out.println("\nDatos del mecánico " + mecanico3.getNombre());
        mecanico1.imprimirDatos();
        Mecánico mecanico4 = new Mecánico("M. Motorista","659653214", Especialidad.MOTOR);
        System.out.println("\nDatos del mecánico " + mecanico4.getNombre());
        mecanico1.imprimirDatos();

        System.out.println("\n****************************************************************************\n");

        JefeDeEstación jefeEstacion1 = new JefeDeEstación("El Boss", "7894561S", LocalDate.of(1789,02,02));
        System.out.println("Datos del Jefe de Estación " + jefeEstacion1.getNombre());
        jefeEstacion1.imprimirDatos();

        System.out.println("\n****************************************************************************\n");

        Locomotora locomotora = new Locomotora("M3085","350",2020,mecanico1);
        System.out.println("Datos locomotora ");
        locomotora.imprimirDatos();

        System.out.println("\n****************************************************************************\n");

        Tren tren = new Tren(locomotora);
        System.out.println("Datos del tren");
        tren.imprimirDatos();

        System.out.println("\n****************************************************************************\n");
        System.out.println("Creamos vagones y los añadimos al tren");
        System.out.println("Creando vagon");
        Vagon vagon1 = new Vagon(1, tren.cargaMaxima(), 0,tren.mercancia());
        vagon1.imprimirDatos();
        tren.añadirVagon(vagon1);
        System.out.println("Creando vagon");
        Vagon vagon2 = new Vagon(2, tren.cargaMaxima(), 0,tren.mercancia());
        vagon2.imprimirDatos();
        tren.añadirVagon(vagon2);
        System.out.println("Creando vagon");
        Vagon vagon3 = new Vagon(3, tren.cargaMaxima(), 0,tren.mercancia());
        vagon3.imprimirDatos();
        tren.añadirVagon(vagon3);
        System.out.println("Creando vagon");
        Vagon vagon4 = new Vagon(4, tren.cargaMaxima(), 0,tren.mercancia());
        vagon4.imprimirDatos();
        tren.añadirVagon(vagon4);
        System.out.println("Creando vagon");
        Vagon vagon5 = new Vagon(5, tren.cargaMaxima(), 0,tren.mercancia());
        vagon5.imprimirDatos();
        tren.añadirVagon(vagon5);
        System.out.println("Creando vagon");
        Vagon vagon6 = new Vagon(6, tren.cargaMaxima(), 0,tren.mercancia());
        vagon6.imprimirDatos();
        tren.añadirVagon(vagon6);

        System.out.println("\n****************************************************************************\n");
        System.out.println("Datos del tren\n");
        tren.imprimirDatos();
        tren.numeroVagones();

        System.out.println("\n****************************************************************************\n");
        System.out.println("Quitar el último vagón\n");
        tren.eliminarUltimoVagon(vagon5);
        System.out.println("Datos del tren\n");
        tren.imprimirDatos();
        tren.numeroVagones();

        System.out.println("\n****************************************************************************\n");
        System.out.println("Asignamos maquinista\n");
        tren.setMaquinista(maquinista2);
        System.out.println("Datos del tren\n");
        tren.imprimirDatos();
        tren.numeroVagones();

        System.out.println("\n****************************************************************************\n");
        System.out.println("Mi estación se compone de");
        System.out.println(JefeDeEstación.jefe +" jefe de estación.");
        System.out.println(Maquinista.maquinista + " maquinistas.");
        System.out.println(Mecánico.mecanico + " mecánicos.");
        System.out.println(Locomotora.locomotora + " locomotoras.");
        System.out.println(Tren.tren + " trenes.");
    }
}
