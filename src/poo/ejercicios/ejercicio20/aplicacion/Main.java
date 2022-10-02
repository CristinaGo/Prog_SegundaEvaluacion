package poo.ejercicios.ejercicio20.aplicacion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Username");
        String u = sc.nextLine();
        System.out.println("Email");
        String e = sc.nextLine();
        System.out.println("Password");
        String p = sc.nextLine();

        Usuario u1 = new Usuario(u, e, p);

        u1.imprimirDatos();

        Usuario u2 = new Usuario("Paula", "pau@gmail.com", "4321");

        u2.imprimirDatos();

        u1.mensajeEstado();
        u2.mensajeEstado();

        u1.setEstado(Estado.ACTIVO);
        u2.setEstado(Estado.BLOQUEADO);

        u1.imprimirDatos();
        u1.mensajeEstado();
        u2.imprimirDatos();
        u2.mensajeEstado();
    }
}

