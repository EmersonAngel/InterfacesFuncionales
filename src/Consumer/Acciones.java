package Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Acciones {

    // Consumer que imprime un valor recibido
    public static Consumer<String> imprimir = mensaje ->
            System.out.println("Mensaje recibido: " + mensaje);

    // Lista para demostrar cómo un Consumer ejecuta acciones
    private static List<Integer> lista = new ArrayList<>();

    // Consumer que agrega un número a una lista
    public static Consumer<Integer> agregarALista = numero ->
            lista.add(numero);

    // Método para consultar la lista
    public static List<Integer> obtenerLista() {
        return lista;
    }
}
