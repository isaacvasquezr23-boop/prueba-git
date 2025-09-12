package Ejercicio1;


class Producto {

    String nombre;   // propiedad default
    double precio;   // propiedad default
    int stock;       // propiedad default

    // Constructor con acceso default
    Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;

}
        // Método con acceso default
    void mostrarInfo() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock: " + stock);
    
}

}

    
    
    
