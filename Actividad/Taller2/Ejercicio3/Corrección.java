package Taller2.Ejercicio3;

public class Corrección {
    String nombre;

    public Corrección(String nombre) {
        this.nombre = nombre;
    }

   
    public void mostrar() {
        System.out.println("Nombre: " + this.nombre);
    }

    
    public static void mostrarInfoGeneral() {
        System.out.println("Este es un método static que no usa this");
    }
}