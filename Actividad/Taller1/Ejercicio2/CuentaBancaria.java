package Ejercicio2;

public class CuentaBancaria {
    String numeroCuenta;
    double saldo;
    String tipoCuenta;

    // 1. Constructor por defecto
    public CuentaBancaria() {
        this.numeroCuenta = "nada";
        this.saldo = 0.0;
        this.tipoCuenta = "nada";
    }

    // 2. Constructor con dos parámetros
    public CuentaBancaria(String numeroCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0.0; // El saldo se inicializa en 0 por defecto
        this.tipoCuenta = tipoCuenta;
    }

    // 3. Constructor sobrecargado con tres parámetros
    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    public void mostrarDetalles() {
        System.out.println("Número de Cuenta: " + numeroCuenta);
        System.out.println("Saldo: $" + saldo);
        System.out.println("Tipo de Cuenta: " + tipoCuenta);
    }

    @Override
    public String toString() {
        return "Número de Cuenta: " + numeroCuenta + ", Saldo: $" + saldo + ", Tipo de Cuenta: " + tipoCuenta;
    }
}