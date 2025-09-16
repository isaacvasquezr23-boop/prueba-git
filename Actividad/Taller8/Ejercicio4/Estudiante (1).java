package taller8punto4;

 
public class Estudiante extends Persona {
    private String matricula;

    public Estudiante(String nombre, String matricula) {
        super(nombre);
        this.matricula = matricula;
    }

    public void mostrarDetalles() {
      

        System.out.println("Matrícula: " + matricula);
    }
}