package com.fmateu.patronesapp;
import Builder.UsuarioBuilder; 
import Builder.Usuario;
import static Factory.EnumPago.CRYPTO;
import Singleton.SingletonClass;

public class PatronesApp {
    public static void main(String[] args) {
        System.out.println("Patrones de diseño");
        System.out.println(" ");
        System.out.println("Creacionales");
        System.out.println("============");
        //Permite limitar la creacion de una instancia para un unico objeto
        System.out.println("1.- Singleton: Usado para instanciar solo una vez una clase.");
        System.out.println("Reglas: El constructor y los atributos son privados. Entre los atributos hay un atributo del mismo tipo de la clase singleton, estatico. 'instance");
        System.out.println("Reglas: Existe un metodo publico getInstance el cual permite crear una única instancia para esta clase. Existen metodos publicos getters y setters.");
        SingletonClass singleton = SingletonClass.getInstance("data_str");
        singleton.getValue();
        
        
        
        //Permite construir un objeto sin tantos parametros de entrada.
        System.out.println("2.- Builder: Si tuviera una clase con 20 atributos, seria ilogico tener un constructor con 20 atributos obligatorios");
        System.out.println("E incluso sería inviable tener combinaciones de 19 si, 1 no; 18 si, 2 no; Y así");
        System.out.println("Para esto existe builder");
        System.out.println("Reglas: Tenemos dos clases. Una clase que define atributos privados, pueden ser opcionales y obligatorios.");
        System.out.println("Reglas: En la primera definimos todos los atributos privados, definimos todos los metodos publicos setters.");
        System.out.println("Reglas: Y definimos un constructor. El constructor de la clase Class debe ser publico y debe tener como parametro el builder");
        System.out.println("Reglas: public Class(classBuilder) builder(this.var1=builder.var1, this.var2=builder.var2");
        System.out.println("Reglas: El constructor de la clase Class es privado y esto es para asegurar que solo se pueda crear desde el builder");
        System.out.println("Reglas: Es decir en la clase principal el constructor recibe el builder y permite hacer solo getters.");
        System.out.println("Reglas2: En la clase builder, se definen todos los atributos privados definidos en la clase principal");
        System.out.println("Reglas2: En el constructor publico de builder van los atributos que son obligatorios de construir");
        System.out.println("Reglas2: Los atributos no obligatorios van en metodos set publicos, retornando this (El metodo builder)");
        System.out.println("Reglas2: Existe un metodo especial build() que retorna una nueva clase principal de la forma: return Class(this).");
        System.out.println("Resumen reglas: Main <----> Builder <----> Class, y una vez se crea la clase es inmutable (no tiene setters)");
        System.out.println("Resumen reglas: Interface --> Builder = setters ---> Puede buildear una nueva instancia de Usuario -> Usuario = getters");
        Builder.UsuarioBuilder usuariobuilder = new Builder.UsuarioBuilder();
        usuariobuilder.setNombre("Francisco");
        usuariobuilder.setEmail("francisco@example.com");
        Usuario usuario = usuariobuilder.build();
        System.out.println(usuario.getNombre());
        
        
        
        //Prototype: Permite clonar una instancia. El metodo debe instalarse en la clase.
        System.out.println("3.- Prototype: Si quisiera clonar una instancia, tengo que crear un metodo clone() que haga new objeto");
        System.out.println("Que se le pasen los parametros y que returne el objeto");
        System.out.println("Regla: Crear metodo publico clone que cree una nueva instancia dentro de este mismo, asigne parametros y lo retorne");
        
        var Domicilio = Prototype.DomicilioSingleton.getUniqueInstance("Lincoyan 858");    //1.- Singleton
        Prototype.ComputadorBuilder computadorBuilder = new Prototype.ComputadorBuilder();   //2.- Builder Inicio
        computadorBuilder.setMarca("Lenovo");
        computadorBuilder.setModelo("Legion 5");
        
        var Computador = computadorBuilder.build();   //2.- Builder Fin
        Computador.setModeloCPU("Nvidia RTX 3060");
        
        var Computador2 = Computador.clone();   //3.- Prototype
        Computador2.setModeloCPU("Nvidia GTX 1050");
        Computador2.setTamanoRAM("32GB");
        
        System.out.println("Computador1 ModeloCPU: "+ Computador.getModeloCPU());
        System.out.println("Computador2 ModeloCPU: "+ Computador2.getModeloCPU());
        Domicilio.addComputador(Computador2);
        Domicilio.listarComputadores(); //Para transformar el arraylist en json, el pom.xml de maven le agrego <dependencies></dependencies, la libreria de Gson de google
    
    
        
        //Factory: Sirve para crear clases que heredan de una sola, evitandonos asi multiples if() if() if() if() if() en una unica funcion.
        System.out.println("3.- Prototype: Si quisiera evitarme los if if if if if if if if masivos en una unica funcion, necesito factory");
        System.out.println("Lo primero es crear una Interfaz padre, que las clases hijas la implementen y luego crear una clase factory");
        System.out.println("Que dependiendo de que tipo de clase hija se requiera, se hace el if if if if if if en esta clase factory");
        System.out.println("Y retorna una clase hija en particular");
        Factory.PagoFactory pagoFactor = new Factory.PagoFactory();
        pagoFactor.crearPago(Factory.EnumPago.CRYPTO);
    }
}
