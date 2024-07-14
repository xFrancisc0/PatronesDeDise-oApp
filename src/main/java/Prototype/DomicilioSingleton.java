package Prototype;
import java.util.ArrayList;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
       
public class DomicilioSingleton { //El domicilio es unico y puede tener un conjunto de computadores
    private static DomicilioSingleton instance;
    private static ArrayList<Computador> ListaComputadores;
    
    private String Direccion;
    
    private DomicilioSingleton(String Direccion){
        this.Direccion = Direccion;
    }
    
    public String getDireccion(){
        return Direccion;
    }
    public void setDireccion(String Direccion){
        this.Direccion = Direccion;
    }

    public void addComputador(Computador computador){
        this.ListaComputadores.add(computador);
    }
    
    public void listarComputadores(){
        System.out.println("Listando computadores del domicilio unico a evaluar");
        
        // Crear un objeto Gson con configuración personalizada
        Gson gson = new GsonBuilder()
                .serializeNulls() // Configurar Gson para serializar atributos nulos
                .create();

        // Convertir arrayList a JSON
        String json = gson.toJson(ListaComputadores);

        // Imprimir JSON resultante
        System.out.println(json);
    }

    public static DomicilioSingleton getUniqueInstance(String Direccion){
        if(instance == null){
            instance = new DomicilioSingleton(Direccion);
            ListaComputadores = new ArrayList<Computador>();
            return instance;
        }else{
            return null;
        }
    }
    
}
