package empresaempleadocliente;

public class Empleado extends Persona {
    private float sueldoBruto;
    Directivo jefe;


    public Empleado(String nombre, int edad) {
        super(nombre, edad);
        this.sueldoBruto = 12000;
    }

    public Empleado(String nombre, int edad, float sueldoBruto) {
        super(nombre, edad);
        this.sueldoBruto = sueldoBruto;
    }

    public float getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(float sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    public float calcularSueldoNeto() {
        float sueldoNeto = (float) (sueldoBruto - sueldoBruto * 0.07);
        int tipo = 0;
       if (sueldoBruto <= 12450){
          tipo = 19;
       } else if(sueldoBruto >12450 && sueldoBruto <= 20200){
           tipo = 24;
       }else if(sueldoBruto >20200 && sueldoBruto <= 35200) {
           tipo = 30;
       }else if(sueldoBruto >35200 && sueldoBruto <= 60000) {
           tipo = 37;
       }else if(sueldoBruto >60000 && sueldoBruto <= 300000) {
           tipo = 45;
       }else if(sueldoBruto >300000) {
           tipo = 47;
       }
       sueldoNeto = sueldoNeto - sueldoNeto * tipo/100;

    return sueldoNeto;
    }

    @Override
    public String toString() {
        return "Empleado:" +
                "\n* nombre: " + nombre + '\'' +
                "\n* Edad: " + Edad +
                "\n* sueldoBruto: " + getSueldoBruto() + "€" +
                "\n* sueldoNeto: " + calcularSueldoNeto() +  "€";
    }

    @Override
    public void mostrarDatos() {
        //super.mostrarDatos();
        System.out.println(toString());
    }

    public void setDirectivo(Directivo jefe){
        this.jefe = jefe;

    }
}
