package Taller2.Ejercicio2;

public class Estudiante {
    
    String nombre;
    int edad;

    // 1. Constructor con parámetros
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // 2. Constructor por defecto que llama al anterior con this()
    public Estudiante() {
        this("Sin nombre", 0); // 👈 Llama al constructor de arriba
    }

    // 3. Método para imprimir detalles
    public void mostrarDetalles() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
    }
}

