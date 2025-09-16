package Taller3.Ejercicio2;

public class Prueba {
    
    public static void main(String[] args) {
        
        int suma = Matematicas.sumar(10, 5);
        int resta = Matematicas.restar(10, 5);
        int multiplicacion = Matematicas.multiplicar(10, 5);
        double division = Matematicas.dividir(10, 5);

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
    }
}


