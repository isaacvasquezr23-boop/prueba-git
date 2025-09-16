package taller8punto1;


public class Coche extends Vehiculo {
    private int numeroDePuertas;

    
    public Coche(String marca, int velocidadMaxima, int numeroDePuertas) {
        super(marca, velocidadMaxima); 
        this.numeroDePuertas = numeroDePuertas;
    }

   
    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); 
        System.out.println("Número de puertas: " + numeroDePuertas);
    }
}
