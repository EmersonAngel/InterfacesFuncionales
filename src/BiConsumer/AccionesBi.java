package BiConsumer;

import java.util.function.BiConsumer;

public class AccionesBi {

    // BiConsumer que imprime un mensaje con nombre y edad
    public static BiConsumer<String, Integer> imprimirUsuario =
            (nombre, edad) -> System.out.println(nombre + " tiene " + edad + " años.");

    // BiConsumer que suma dos números y los imprime
    public static BiConsumer<Integer, Integer> sumar =
            (a, b) -> System.out.println("Suma: " + (a + b));

    // BiConsumer que concatena textos
    public static BiConsumer<String, String> concatenar =
            (t1, t2) -> System.out.println("Concatenación: " + t1 + t2);
}