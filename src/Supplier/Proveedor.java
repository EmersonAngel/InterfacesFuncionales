package Supplier;

import java.time.LocalTime;
import java.util.function.Supplier;

public class Proveedor {

    // Supplier que devuelve la hora actual
    public static Supplier<LocalTime> horaActual = () -> LocalTime.now();

    // Supplier que devuelve un número aleatorio entre 0 y 100
    public static Supplier<Integer> numeroAleatorio = () ->
            (int)(Math.random() * 101);

    // Supplier que devuelve un mensaje
    public static Supplier<String> mensaje = () ->
            "Hola, este texto viene de un Supplier";
}
