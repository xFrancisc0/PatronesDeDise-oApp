package Builder;

public class UsuarioBuilder implements IUsuarioBuilder{
    private String nombre;
    private String email;
    private int edad;

    public UsuarioBuilder(){
        
    }
    
    @Override
    public IUsuarioBuilder setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    @Override
    public IUsuarioBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    @Override
    public IUsuarioBuilder setEdad(int edad) {
        this.edad = edad;
        return this;
    }

    @Override
    public Usuario build() {
        return new Usuario(nombre, email, edad);
    }
}