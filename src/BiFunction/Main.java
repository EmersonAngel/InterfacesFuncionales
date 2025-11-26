package BiFunction;

public class Main {
    public static void main(String[] args) {

        // ---- Ejemplo 1: sumar ----
        int resultado1 = OperacionesBi.sumar.apply(10, 25);
        System.out.println("Suma: " + resultado1);

        // ---- Ejemplo 2: longitudes de dos textos ----
        int len = OperacionesBi.longitudTotal.apply("Hola", "Mundo");
        System.out.println("Longitud total: " + len);

        // ---- Ejemplo 3: mensaje con promedio ----
        String mensaje = OperacionesBi.mensajeOperacion.apply(7.5, 2.5);
        System.out.println(mensaje);
    }
}
