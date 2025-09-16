package Taller2.Ejercicio1;

public class Producto {
    // Atributos de la clase
    String nombre;
    double precio;

    // 2. Constructor
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // 3. Método para mostrar los detalles del producto
    public void mostrarProducto() {
        System.out.println("Producto: " + this.nombre);
        System.out.println("Precio: $" + this.precio);
    }
}