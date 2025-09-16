package Ejercicio4;

import java.util.Scanner;
import Ejercicio1.Libro;
import Ejercicio3.Estudiante;
import Ejercicio2.CuentaBancaria;

public class ProyectoIntegrador {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Crear Libro");
        System.out.print("Ingrese el título: ");
        String titulo = scanner.nextLine();
        System.out.print("Ingrese el autor: ");
        String autor = scanner.nextLine();
        System.out.print("Ingrese el número de páginas: ");
        int paginas = scanner.nextInt();
        System.out.println("-----------");
       
        scanner.nextLine(); // Consumir el salto de línea

        Libro libroUsuario = new Libro(titulo, autor, paginas);

        
        System.out.println("Creación de una Cuenta Bancaria ");
        System.out.print("Ingrese el número de cuenta: ");
        String numCuenta = scanner.nextLine();
        System.out.print("Ingrese el tipo de cuenta: ");
        String tipoCuenta = scanner.nextLine();
        System.out.print("Ingrese el saldo inicial: ");
        double saldo = scanner.nextDouble();
         System.out.println("-----------");
          
         scanner.nextLine(); // Consumir el salto de línea
       
         CuentaBancaria cuentaUsuario = new CuentaBancaria(numCuenta, saldo, tipoCuenta); //-----------

       
        System.out.println("Crear estudiante");
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombreEstudiante = scanner.nextLine(); // <-- Falta esta línea
        System.out.print("Ingrese la edad: ");
        int edad = scanner.nextInt(); // <-- Falta esta línea
        scanner.nextLine(); // Consumir el salto de línea
        System.out.print("Ingrese el curso: ");
        
        String curso = scanner.nextLine(); // <-- Falta esta línea
        
        Estudiante estudianteUsuario = new Estudiante(nombreEstudiante, edad, curso);

        scanner.close();

       
        System.out.println("Resumen de los Objetos Creados");
        System.out.println("Detalles del Libro: " + libroUsuario.toString());
        System.out.println("Detalles de la Cuenta: " + cuentaUsuario.toString());
        System.out.println("Detalles del Estudiante: " + estudianteUsuario.toString());
    }
}