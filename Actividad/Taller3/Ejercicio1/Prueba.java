package Taller3.Ejercicio1;

public class Prueba {
    
    public static void main(String[] args) {
        Coche c1 = new Coche("Toyota", "Corolla");
        Coche c2 = new Coche("Mazda", "3");
        Coche c3 = new Coche("Chevrolet", "Onix");

        c1.mostrarDetalles();
        System.out.println("--------------");
        c2.mostrarDetalles();
        System.out.println("--------------");
        c3.mostrarDetalles();

        System.out.println("==============");
        Coche.mostrarContador();
    }
}

