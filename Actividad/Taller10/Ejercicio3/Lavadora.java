package Taller10.Ejercicio3;

public class Lavadora extends Objeto {
    
     // ❌ Error: aquí parece que "sobrescribe", pero cambia la firma
    public void HacerUnaAccion (String tipo) {
        System.out.println("La lavadora hace un sonido de tipo: " + tipo);
    }

    // ❌ Sin @Override, se permite compilar,
    // pero si escribimos mal el nombre, NO detecta el error
    public void HacerUnaAccion() { // error tipográfico
        System.out.println("Guau Guau!");
    }
}

