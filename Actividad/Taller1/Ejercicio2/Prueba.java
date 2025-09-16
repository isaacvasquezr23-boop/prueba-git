package Ejercicio2;

public class Prueba {
    
    public static void main(String[] args) {

        // 1. Usamos el constructor por defecto (sin parámetros)
        CuentaBancaria cuenta1 = new CuentaBancaria();
        cuenta1.mostrarDetalles();
        System.out.println();

        // 2. Usamos el constructor parametrizado
        CuentaBancaria cuenta2 = new CuentaBancaria("12345678", "Ahorros");
        cuenta2.mostrarDetalles();
        System.out.println();

        // 3. Usamos el constructor con tres parámetros
        CuentaBancaria cuenta3 = new CuentaBancaria("87654321", 1500.75, "Corriente");
        cuenta3.mostrarDetalles();
        System.out.println();

            System.out.println(cuenta1);
        System.out.println(cuenta2);
        System.out.println(cuenta3);
    }
}

