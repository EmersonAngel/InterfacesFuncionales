package Ejercicio;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Crear una lista de personas
        List<Persona> personas = Arrays.asList(
                new Persona("Juan", 22, "Bogotá"),
                new Persona("María", 17, "Medellín"),
                new Persona("Carlos", 30, "Bogotá"),
                new Persona("Ana", 25, "Cali"),
                new Persona("Sofía", 19, "Cartagena")
        );

        // 1. Mostrar únicamente los nombres de todas las personas
        System.out.println("Nombres de todas las personas:");
        personas.stream()
                .map(Persona::getNombre)
                .forEach(System.out::println);

        // 2. Filtrar e imprimir las personas mayores de edad
        System.out.println("\nPersonas mayores de edad (18+):");
        personas.stream()
                .filter(p -> p.getEdad() >= 18)
                .forEach(System.out::println);

        // 3. Obtener lista solo con los nombres
        List<String> nombres = personas.stream()
                .map(Persona::getNombre)
                .collect(Collectors.toList());
        System.out.println("\nLista de nombres: " + nombres);

        // 4. Mensaje con nombre y ciudad
        System.out.println("\nMensajes nombre-ciudad:");
        personas.stream()
                .map(p -> p.getNombre() + " vive en " + p.getCiudad())
                .forEach(System.out::println);

        // 5. Mensaje personalizado con nombre y edad
        System.out.println("\nMensajes personalizados:");
        personas.stream()
                .map(p -> "Hola " + p.getNombre() + ", tienes " + p.getEdad() + " años.")
                .forEach(System.out::println);

        // 6. Función que genera una persona aleatoria
        System.out.println("\nPersona aleatoria generada:");
        Persona aleatoria = generarPersonaAleatoria();
        System.out.println(aleatoria);

        // 7. Imprimir nombres en mayúsculas
        System.out.println("\nNombres en mayúsculas:");
        personas.stream()
                .map(p -> p.getNombre().toUpperCase())
                .forEach(System.out::println);

        // 8. Filtrar solo las personas que vivan en Bogotá
        System.out.println("\nPersonas que viven en Bogotá:");
        personas.stream()
                .filter(p -> p.getCiudad().equalsIgnoreCase("Bogotá"))
                .forEach(System.out::println);

        // 9. Crear lista de mensajes tipo "Juan (22 años) es de Bogotá"
        System.out.println("\nMensajes formateados:");
        List<String> mensajes = personas.stream()
                .map(p -> p.getNombre() + " (" + p.getEdad() + " años) es de " + p.getCiudad())
                .collect(Collectors.toList());
        mensajes.forEach(System.out::println);
    }

    // Método para generar una persona aleatoria
    public static Persona generarPersonaAleatoria() {
        String[] nombres = {"Luis", "Camila", "Andrés", "Valentina", "Mateo", "Laura"};
        String[] ciudades = {"Bogotá", "Medellín", "Cali", "Cartagena", "Barranquilla"};
        Random random = new Random();

        String nombre = nombres[random.nextInt(nombres.length)];
        int edad = random.nextInt(50) + 10; // Edad entre 10 y 60 años
        String ciudad = ciudades[random.nextInt(ciudades.length)];

        return new Persona(nombre, edad, ciudad);
    }
}
