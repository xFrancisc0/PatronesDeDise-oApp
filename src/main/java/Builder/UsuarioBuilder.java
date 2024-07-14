package Builder;

public class UsuarioBuilder implements UsuarioBuilderInterface{
    private String nombre;
    private String email;
    private int edad;

    public UsuarioBuilder(){
        
    }
    
    @Override
    public UsuarioBuilderInterface setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    @Override
    public UsuarioBuilderInterface setEmail(String email) {
        this.email = email;
        return this;
    }

    @Override
    public UsuarioBuilderInterface setEdad(int edad) {
        this.edad = edad;
        return this;
    }

    @Override
    public Usuario build() {
        return new Usuario(nombre, email, edad);
    }
}