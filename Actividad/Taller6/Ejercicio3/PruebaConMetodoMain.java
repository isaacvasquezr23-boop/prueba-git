package Taller6.Ejercicio3;

public class PruebaConMetodoMain {
    public static void main(String[] args) {
        // Caso inseguro
        Banco bancoInseguro = new Banco(1000);
        bancoInseguro.mostrarSaldo();
        bancoInseguro.saldo = -5000; // ⚠ acceso indebido a saldo
        bancoInseguro.mostrarSaldo();

        System.out.println("-----");

        // Caso seguro
        BancoConfiable bancoSeguro = new BancoConfiable(1000);
        bancoSeguro.depositar(500);
        bancoSeguro.retirar(200);
        System.out.println("Saldo seguro: " + bancoSeguro.getSaldo());

        // Intento indebido
        bancoSeguro.retirar(2000); // no se permite
    }
}

  
    
