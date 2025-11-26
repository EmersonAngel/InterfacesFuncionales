package Predicate;
import java.util.function.Predicate;

public class ValidadorNumero {

    // Predicate que valida si un número es mayor que 10
    public static Predicate<Integer> esMayorQue10 = numero -> numero > 10;

    // También se puede crear como método
    public static Predicate<Integer> esPar() {
        return n -> n % 2 == 0;
    }
}