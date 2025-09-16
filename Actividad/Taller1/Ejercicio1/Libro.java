package Ejercicio1;

public class Libro {
    String titulo;
    String autor;
    int numeroPaginas;

    // 1. Constructor por defecto
    public Libro() {
        this.titulo = "Título desconocido";
        this.autor = "Autor desconocido";
        this.numeroPaginas = 0;
    }

    // 2. Constructor parametrizado
    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    // 3. Método para mostrar los detalles
    public void mostrarDetalles() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numeroPaginas);
    }

    
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Páginas: " + numeroPaginas;
    }
}