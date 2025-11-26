package BiFunction;

import java.util.function.BiFunction;

public class OperacionesBi {

    // Sumar dos números
    public static BiFunction<Integer, Integer, Integer> sumar =
            (a, b) -> a + b;

    // Calcular la suma de las longitudes de dos textos
    public static BiFunction<String, String, Integer> longitudTotal =
            (t1, t2) -> t1.length() + t2.length();

    // Crear un mensaje a partir de dos números decimales
    public static BiFunction<Double, Double, String> mensajeOperacion =
            (x, y) -> "El promedio es: " + ((x + y) / 2);
}
