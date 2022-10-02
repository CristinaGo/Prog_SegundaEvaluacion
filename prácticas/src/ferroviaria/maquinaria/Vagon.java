package ferroviaria.maquinaria;

import java.util.Scanner;

/**
 * Práctica Clases y Objetos
 * @author Cristina Gómez Campos
 */

public class Vagon {
    protected int id;
    protected double cargaMáxima;
    protected double cargaActual;
    protected Mercancia mercancía;
    public static int vagon;
    static Scanner sc = new Scanner(System.in);

    public Vagon(int id, double cargaMáxima, double cargaActual, Mercancia mercancía) {
        this.id = id;
        this.cargaMáxima = cargaMáxima;
        this.cargaActual = cargaActual;
        this.mercancía = mercancía;
        vagon++;
    }


    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCargaMáxima() {

        return cargaMáxima;
    }

    public void setCargaMáxima(double cargaMáxima) {

        this.cargaMáxima = cargaMáxima;
    }

    public double getCargaActual() {

        return cargaActual;
    }

    public void setCargaActual(double cargaActual) {

        this.cargaActual = cargaActual;
    }

    public Mercancia getMercancía() {
        return mercancía;
    }

    public void setMercancía(Mercancia mercancía) {
        this.mercancía = mercancía;
    }

    @Override
    public String toString() {
        return "Vagon{" +
                "id=" + id +
                ", cargaMáxima=" + cargaMáxima +
                ", cargaActual=" + cargaActual +
                ", mercancía=" + mercancía +
                '}';
    }

    public void imprimirDatos(){
        System.out.println(toString());
    }
}


