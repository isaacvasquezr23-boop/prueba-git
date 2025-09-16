package Taller4.Ejercicio1;

public class EstudiantePrueba {

    public static void main(String[] args) {
        // Crear un estudiante válido
        Estudiante e1 = new Estudiante("Isaac", 23, 4.5);
        e1.mostrarInfo();

        System.out.println("--------------");

        // Crear un estudiante con valores inválidos (para probar validaciones)
        Estudiante e2 = new Estudiante("", -5, 7.0);
        e2.mostrarInfo();
    }
}

