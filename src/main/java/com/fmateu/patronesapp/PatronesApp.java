package com.fmateu.patronesapp;
import Singleton.SingletonClass;

public class PatronesApp {
    public static void SingletonMetodo(String input){ //Es estatico porque se ejecuta como metodo sin uso de instancia de clases.
        SingletonClass singleton = SingletonClass.getInstance(input);
        System.out.println(singleton.getValue());
        System.out.println(" ");
    }

    public static void main(String[] args) {
        System.out.println("Patrones de diseño");
        System.out.println(" ");
        System.out.println("Creacionales");
        System.out.println("============");
        System.out.println("Singleton");
        SingletonMetodo("Test");
    }
}
