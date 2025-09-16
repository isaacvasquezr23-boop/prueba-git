package Taller2.Ejercicio3;

public class Animal {
    
    String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    
    public static void mostrar() {
        System.out.println("Nombre: " + this.nombre); 
    }
}

