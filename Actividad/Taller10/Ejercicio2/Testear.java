package Taller10.Ejercicio2;

public class Testear {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo();
        Vehiculo v2 = new Bicicleta();

        v1.moverse(); // El vehículo se está moviendo.
        v2.moverse(); // La bicicleta avanza pedaleando.
    }
}