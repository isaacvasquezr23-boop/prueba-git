package Ejercicio2.Prueba;

public class prueba {

    import vehiculos.Moto;

    public class prueba {
    public static void main(String[] args) {
        Moto m = new Moto();
        m.encender(); // ✔️ Método público

        // ❌ Error: método mostrarTipo() no es público
        // m.mostrarTipo();

        // ❌ Error: atributo tipo no es público
        // System.out.println(m.tipo);
    }
}
    
}
