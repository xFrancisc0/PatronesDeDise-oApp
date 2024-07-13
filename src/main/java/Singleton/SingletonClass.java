package Singleton;

public final class SingletonClass {
    private static SingletonClass instance; //Regla 2: La variable instance es estatica. Esto significa que pertenece a la clase en si misma en lugar de las instancias y esta destinada a almacenar la instancia unica de SingletonClass.
    private String value; //La variable value es privada. En caso de que se quiera almacenar, se hace.

    private SingletonClass(String value) { // Regla 1 Singleton: El constructor va privado. Esto es para prevenir que otras clases creen multiples instancias.
        try {
            Thread.sleep(1000);
            this.value = value;
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static SingletonClass getInstance(String value) { //El metodo es publico para acceder del exterior. Es estatico para permitir su invocacion sin necesidad de una instancia.
        if (instance == null) {
            instance = new SingletonClass(value);
        }
        return instance;
    }
    
    public String getValue(){ //El metodo get no es estatico porque al momento que instanciamos la clase en getInstance, solo alli requerimos que sea instanciado. getValue es un metodo ocupado en la instancia 1:1 ya creada.
        return this.value;
    }
}