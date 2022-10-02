package herencia.ejemplos;

public class SubClaseA extends SuperClase {
    public void verAtributosDeSuperClase() {
        System.out.println(protectedSuperClase);
        System.out.println(publicSuperClase);
        System.out.println(defaultSuperClase);
    }
}
