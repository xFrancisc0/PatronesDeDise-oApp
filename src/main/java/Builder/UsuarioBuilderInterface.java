package Builder;

public interface UsuarioBuilderInterface {
    UsuarioBuilderInterface setNombre(String nombre);
    UsuarioBuilderInterface setEmail(String email);
    UsuarioBuilderInterface setEdad(int edad);
    Usuario build();
}