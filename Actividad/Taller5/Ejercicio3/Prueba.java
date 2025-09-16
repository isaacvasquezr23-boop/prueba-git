package Ejercicio3;

public class Prueba {
    public static void main(String[] args) {
        Persona p = new Persona();
        // p.nombre = "Isaac"; // Error: 'nombre' es privado, no accesible directamente
        p.setNombre("Isaac"); // Correcto: acceso mediante método público
        p.edad = 18;        // Correcto: 'edad' es default, accesible dentro del mismo paquete

        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Edad: " + p.edad);
    }
}