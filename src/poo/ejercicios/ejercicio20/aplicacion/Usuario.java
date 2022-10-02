package poo.ejercicios.ejercicio20.aplicacion;

public class Usuario {
    private String username;
    private String email;
    private String password;
    Estado estado;

    public Usuario(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.estado = Estado.PENDIENTE;
    }

    public String getUsername() {
        return username;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", estado=" + estado +
                '}';
    }

    public void imprimirDatos() {
        System.out.println(this.toString());
    }

    public void mensajeEstado() {
        switch (this.estado) {
            case ACTIVO -> System.out.println("Todo ok, vía libre.");
            case PENDIENTE -> System.out.println("Tienes que esperar un poco.");
            case BLOQUEADO -> System.out.println("Usuario bloqueado. Algo habrás hecho.");
            default -> System.out.println("Estado desconocido.");
        }
    }

}
