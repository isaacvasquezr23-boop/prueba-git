package taller8punto2;

public class Estudiante extends Persona {
    private String matricula;

    public Estudiante(String nombre, int edad, String matricula) {
        super(nombre, edad); 
        this.matricula = matricula;
    }

    
    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); 
        System.out.println("Matrícula: " + matricula);
    }
}
