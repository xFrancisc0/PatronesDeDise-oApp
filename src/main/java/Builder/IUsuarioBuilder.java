package Builder;

public interface IUsuarioBuilder {
    IUsuarioBuilder setNombre(String nombre);
    IUsuarioBuilder setEmail(String email);
    IUsuarioBuilder setEdad(int edad);
    Usuario build();
}