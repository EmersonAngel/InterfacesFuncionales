package Consumer;

public class Main {
    public static void main(String[] args) {

        // ---- Ejemplo 1: imprimir un mensaje ----
        Acciones.imprimir.accept("Hola desde un Consumer");

        // ---- Ejemplo 2: agregar valores a una lista ----
        Acciones.agregarALista.accept(10);
        Acciones.agregarALista.accept(20);
        Acciones.agregarALista.accept(30);

        // Mostrar contenido de la lista
        System.out.println("Lista acumulada: " + Acciones.obtenerLista());
    }
}
