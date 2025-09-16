package Ejercicio3;


public class Estudiante {
    
    String nombre;
    int edad;
    String curso;

    // 1. Constructor por defecto
    public Estudiante() {
        this("Indefinido", 0, "Indefinido");
    }

    // 2. Constructor que permita nombre y edad
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = "Indefinido";
    }

    // 3. Constructor que permita todos los parámetros y usa this()
    public Estudiante(String nombre, int edad, String curso) {
        this(nombre, edad); // Llama al constructor con nombre y edad - codigo más limpio
        this.curso = curso;
    }
       
    // Método toString()
    @Override // Esto indica que estamos sobrescribiendo el método de la clase padre
    public String toString() {
        return "Nombre: " + this.nombre + ", Edad: " + this.edad + ", Curso: " + this.curso;
}
}
