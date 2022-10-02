package poo.edificio;

public class Edificio {


    int numPlantas;
    double area;
    int año;


    public Edificio(int numPlantas, double area, int año) {
        this.numPlantas = numPlantas;
        this.area = area;
        this.año = año;
    }

    public void imprimeDatos() {
        System.out.println("Edificio:" + this.numPlantas + " plantas" + this.area + " m2; año de construcción : " + this.año);

    }
}
