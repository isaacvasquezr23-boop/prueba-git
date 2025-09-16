package Ejercicio3;

public class Prueba {
    public static void main(String[] args) {
        
        // 1. Usando el constructor por defecto
        Estudiante estudiante1 = new Estudiante();
        System.out.println("Estudiante 1 -> Nombre: " + estudiante1.nombre + ", Edad: " + estudiante1.edad 
                + ", Curso: " + estudiante1.curso);

        // 2. Usando el constructor con nombre y edad
        Estudiante estudiante2 = new Estudiante("Isaac", 18);
        System.out.println("Estudiante 2 -> Nombre: " + estudiante2.nombre + ", Edad: " + estudiante2.edad 
                + ", Curso: " + estudiante2.curso);

        // 3. Usando el constructor con todos los parámetros
        Estudiante estudiante3 = new Estudiante("Jose", 19, "Programación");
        System.out.println("Estudiante 3 -> Nombre: " + estudiante3.nombre + ", Edad: " + estudiante3.edad 
                + ", Curso: " + estudiante3.curso);
    }
}