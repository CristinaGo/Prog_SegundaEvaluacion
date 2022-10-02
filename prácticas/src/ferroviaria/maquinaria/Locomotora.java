package ferroviaria.maquinaria;

import ferroviaria.empleados.Mecánico;

/**
 * Práctica Clases y Objetos
 * @author Cristina Gómez Campos
 */

public class Locomotora {
    protected String matrícula;
    protected String potencia;
    protected int antigüedad;
    protected Mecánico mecánico;
    public static int locomotora;

    public Locomotora(String matrícula, String potencia, int antigüedad, Mecánico mecánico) {
        this.matrícula = matrícula;
        this.potencia = potencia;
        this.antigüedad = antigüedad;
        this.mecánico = mecánico;
        locomotora++;
    }

    public String getMatrícula() {
        return matrícula;
    }

    public void setMatrícula(String matrícula) {
        this.matrícula = matrícula;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public int getAntigüedad() {
        return antigüedad;
    }

    public void setAntigüedad(int antigüedad) {
        this.antigüedad = antigüedad;
    }

    @Override
    public String toString() {
        return "Locomotora{" +
                "matrícula='" + matrícula + '\'' +
                ", potencia='" + potencia + '\'' +
                ", antigüedad=" + antigüedad +
                ", mecánico=" + mecánico +
                '}';
    }

    public void imprimirDatos(){
        System.out.println(toString());
    }
}
