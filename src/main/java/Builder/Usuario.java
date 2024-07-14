package Builder;

public class Usuario {
    // Atributos privados de Usuario
    private String nombre;
    private String email;
    private int edad;

    // Constructor privado para uso interno
    Usuario(String nombre, String email, int edad) {
        this.nombre = nombre;
        this.email = email;
        this.edad = edad;
    }

    // Métodos públicos para acceder a los atributos
    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public int getEdad() {
        return edad;
    }

}