package Function;

public class Main {
    public static void main(String[] args) {

        // ---- Usando convertirAString ----
        String texto = Transformador.convertirAString.apply(7);
        System.out.println(texto);  // Resultado: Número: 7

        // ---- Usando duplicar ----
        int doble = Transformador.duplicar.apply(5);
        System.out.println("El doble de 5 es: " + doble);

        // ---- Usando la Function devuelta por un método ----
        int longitud = Transformador.longitudTexto().apply("Hola");
        System.out.println("Longitud de 'Hola': " + longitud);
    }
}