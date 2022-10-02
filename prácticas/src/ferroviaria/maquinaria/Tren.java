package ferroviaria.maquinaria;

import ferroviaria.empleados.Maquinista;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Práctica Clases y Objetos
 * @author Cristina Gómez Campos
 */

public class Tren {
    protected Locomotora locomotora;
    protected ArrayList<Vagon> vagones = new ArrayList<>(5);
    protected Maquinista maquinista;
    public static int tren;
    static Scanner sc = new Scanner(System.in);

    public Tren(Locomotora locomotora) {
        this.locomotora = locomotora;
        tren++;
    }

    public Tren(Locomotora locomotora, ArrayList<Vagon> vagones, Maquinista maquinista) {
        this.locomotora = locomotora;
        this.vagones = vagones;
        this.maquinista = maquinista;
        tren++;
    }

    public void añadirVagon(Vagon v){
        if (vagones.size() < 5) {
            vagones.add(v);
        } else if (vagones.size() == 5){
            System.out.println("No se puede añadir más vagones");
        }

    }
    public double cargaMaxima(){
        System.out.println("¿Cuál es la carga máxima?");
        double cM = sc.nextDouble();
        return cM;
    }


    public Mercancia mercancia(){
        System.out.println("¿Qué tipo de mercancía lleva?\n1.Perecedera.\n2.No perecedera.\n3.Frágil.\n4.Peligrosa.\n5.Dimensional.");
        int tipo = sc.nextInt();
        switch (tipo){
            case 1:
                return Mercancia.PERECEDERA;
            case 2:
                return Mercancia.NO_PERECEDERA;
            case 3:
                return Mercancia.FRÁGIL;
            case 4:
                return Mercancia.PELIGROSA;
            case 5:
                return Mercancia.DIMENSIONAL;
            default:
                return Mercancia.PERECEDERA;
        }

    }

    public void eliminarUltimoVagon(Vagon v){
        vagones.remove(v);
    }

    public void numeroVagones(){
        System.out.println("Nº de vagones: " + vagones.size());
    }

    public Locomotora getLocomotora() {
        return locomotora;
    }

    public void setLocomotora(Locomotora locomotora) {
        this.locomotora = locomotora;
    }

    public Maquinista getMaquinista() {
        return maquinista;
    }

    public void setMaquinista(Maquinista maquinista) {
        this.maquinista = maquinista;
    }

    @Override
    public String toString() {
        return "Tren{" +
                "locomotora=" + locomotora +
                ", vagones=" + vagones +
                ", maquinista=" + maquinista +
                '}';
    }


    public void imprimirDatos(){
        System.out.println(toString());
    }

}
