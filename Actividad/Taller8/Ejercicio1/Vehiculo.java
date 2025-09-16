package taller8punto1;


public class Vehiculo {
    protected String marca;
    protected int velocidadMaxima;

 
    public Vehiculo(String marca, int velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }

    
    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Velocidad máxima: " + velocidadMaxima + " km/h");
    }
}
