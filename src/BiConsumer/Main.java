package BiConsumer;

public class Main {
    public static void main(String[] args) {

        // ---- Ejemplo 1: imprimir usuario ----
        AccionesBi.imprimirUsuario.accept("Emerson", 17);

        // ---- Ejemplo 2: sumar dos números ----
        AccionesBi.sumar.accept(10, 30);

        // ---- Ejemplo 3: concatenar textos ----
        AccionesBi.concatenar.accept("Hola ", "mundo");
    }
}
