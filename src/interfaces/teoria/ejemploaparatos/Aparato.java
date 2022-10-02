package interfaces.teoria.ejemploaparatos;

public abstract class Aparato implements Funcionalidad {
    protected String serialNumber;
    protected boolean on;

    public Aparato(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    protected void encender(boolean on) {
        this.on = on;
    }
}
