package Taller6.Ejercicio2;

public class ProbarVehiculo {
    public static void main(String[] args) {
        Moto moto = new Moto("Deportiva", "Yamaha", 600);

        // Acceso permitido desde método de la subclase
        moto.mostrarInformacion();

        // Acceso NO permitido desde clase no relacionada (esto genera error de compilación)
        // System.out.println(moto.tipo);   // Error: tipo tiene acceso protected
        // System.out.println(moto.marca);  // Error: marca tiene acceso protected
    }
}