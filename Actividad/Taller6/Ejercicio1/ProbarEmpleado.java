package Taller6.Ejercicio1;

public class ProbarEmpleado {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Ana", 2500.0);
        Gerente g1 = new Gerente("Luis", 4000.0, "Ventas");

        e1.mostrarInformacion();
        System.out.println("---");
        g1.mostrarInformacion();
    }
}
