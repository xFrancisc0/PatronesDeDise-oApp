package com.fmateu.patronesapp;
import Builder.UsuarioBuilder; import Builder.Usuario;
import Singleton.SingletonClass;

public class PatronesApp {
    public static void main(String[] args) {
        System.out.println("Patrones de diseño");
        System.out.println(" ");
        System.out.println("Creacionales");
        System.out.println("============");
        
        System.out.println("1.- Singleton: Usado para instanciar solo una vez una clase.");
        System.out.println("Reglas: El constructor y los atributos son privados. Entre los atributos hay un atributo del mismo tipo de la clase singleton, estatico.");
        System.out.println("Reglas: Existe un metodo publico getInstance el cual permite crear una única instancia para esta clase. Existen metodos publicos getters y setters.");
        SingletonClass singleton = SingletonClass.getInstance("data_str");
        singleton.getValue();
        
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
        Builder.UsuarioBuilder usuariobuilder = new Builder.UsuarioBuilder();
        usuariobuilder.setNombre("Francisco");
        usuariobuilder.setEmail("francisco@example.com");
        Usuario usuario = usuariobuilder.build();
        System.out.println(usuario.getNombre());
    }
}
