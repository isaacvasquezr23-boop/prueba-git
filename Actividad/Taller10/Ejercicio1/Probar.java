package Taller10.Ejercicio1;
public class Probar {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Estudiante();
        Persona p3 = new Profesor();

        Persona[] personas = {p1, p2, p3};

        for (Persona p : personas) {
            p.presentarse();
        }
    }
}
