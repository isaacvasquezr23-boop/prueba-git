package Taller6.Ejercicio3;

class BancoConfiable {
    
    // Uso correcto: saldo privado
    private double saldo;

    public BancoConfiable(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Encapsulación con métodos controlados
    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        } else {
            System.out.println("Error: el monto a depositar debe ser positivo.");
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
        } else {
            System.out.println("Error: fondos insuficientes o monto inválido.");
        }
    }
}
