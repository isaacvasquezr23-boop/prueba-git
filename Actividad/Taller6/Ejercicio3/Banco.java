package Taller6.Ejercicio3;

public class Banco {
        // Uso incorrecto: saldo protegido
    protected double saldo;

    public Banco(double saldo) {
        this.saldo = saldo;
    }

       // Método para mostrar saldo
     public void mostrarSaldo() {
        System.out.println("Saldo actual: " + saldo);
 }

 }

 