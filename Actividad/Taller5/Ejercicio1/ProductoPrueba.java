package Ejercicio1;

public class ProductoPrueba {
    

    public static void main(String[] args) {
        Producto p1 = new Producto("Mouse", 3500.0, 5);
        Producto p2 = new Producto("Teclado", 1300.0, 10);
          

        System.out.println("Producto 1");
        p1.mostrarInfo();
       
        System.out.println("Producto 2");
        p2.mostrarInfo();
}

}