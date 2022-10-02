package herencia.ejemplos;

public class SubClaseD extends SubClaseA {
    public void verAtributosDeSuperClase() {
        System.out.println(protectedSuperClase);
        System.out.println(publicSuperClase);
        System.out.println(defaultSuperClase);
    }
}
