package Supplier;

public class Main {
    public static void main(String[] args) {

        // ---- Ejemplo 1: hora actual ----
        System.out.println("Hora actual: " + Proveedor.horaActual.get());

        // ---- Ejemplo 2: número aleatorio ----
        System.out.println("Número aleatorio: " + Proveedor.numeroAleatorio.get());

        // ---- Ejemplo 3: mensaje ----
        System.out.println(Proveedor.mensaje.get());
    }
}
