package taller8punto3;

public class Prueba {
    public static void main(String[] args) {
        
        Empleado emp = new Empleado("Ana", 1500.0);

        
        Gerente ger = new Gerente("Luis", 2500.0, "Ventas");

        System.out.println("=== Empleado ===");
        emp.mostrarDetalles();

        System.out.println("\n=== Gerente ===");
        ger.mostrarDetalles();
    }
}
