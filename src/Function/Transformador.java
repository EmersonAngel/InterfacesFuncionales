package Function;

import java.util.function.Function;

public class Transformador {

    // Function que convierte un número a su versión en String
    public static Function<Integer, String> convertirAString =
            numero -> "Número: " + numero;

    // Function que duplica un número
    public static Function<Integer, Integer> duplicar =
            n -> n * 2;

    // También puedes devolver funciones desde un método
    public static Function<String, Integer> longitudTexto() {
        return texto -> texto.length();
    }
}
