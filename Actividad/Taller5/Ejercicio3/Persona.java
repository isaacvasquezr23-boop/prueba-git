package Ejercicio3;

public class Persona {
    private String nombre; // privado
    int edad;              // default (de paquete)

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}