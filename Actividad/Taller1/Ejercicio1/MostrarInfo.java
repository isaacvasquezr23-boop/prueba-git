package Ejercicio1;

public class MostrarInfo {

    public static void main(String[] args) {
        // Using the default constructor
        Libro libro1 = new Libro();
        System.out.println("Detalles del Primer libro (Constructor por defecto):");
        libro1.mostrarDetalles();
        System.out.println("---");

        // Using the parameterized constructor
        Libro libro2 = new Libro("El Señor de los Anillos", "J.R.R. Tolkien", 1200);
        System.out.println("Detalles del Libro 2 (Constructor parametrizado):");
        libro2.mostrarDetalles();
    }
}