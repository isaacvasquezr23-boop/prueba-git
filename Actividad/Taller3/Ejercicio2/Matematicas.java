package Taller3.Ejercicio2;

public class Matematicas {
    

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static double dividir(int a, int b) {
        if (b == 0) {
          System.out.println("Error: no se puede dividir por cero"); 
        }
        return (double) a / b;
    }
}
