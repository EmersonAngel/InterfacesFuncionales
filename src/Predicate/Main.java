package Predicate;

public class Main {
    public static void main(String[] args) {

        // Usar el Predicate definido en ValidadorNumero
        boolean resultado1 = ValidadorNumero.esMayorQue10.test(5);
        boolean resultado2 = ValidadorNumero.esMayorQue10.test(15);

        System.out.println("¿5 es mayor que 10? " + resultado1);
        System.out.println("¿15 es mayor que 10? " + resultado2);

        // Ejemplo usando el otro Predicate esPar()
        boolean par = ValidadorNumero.esPar().test(8);
        System.out.println("¿8 es par? " + par);
    }
}
