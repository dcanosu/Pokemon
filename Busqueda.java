import java.util.Scanner;

public class Busqueda {

    public static Pokemon buscarPorNombre(Pokemon[] pokemones, String nombreBuscado) {

        if (pokemones == null) {
            return null;
        }

        for (Pokemon pokemon : pokemones) {
            if (pokemon != null && pokemon.getNombre().equalsIgnoreCase(nombreBuscado)) {
                return pokemon; 
            }
        } return null;
    }

    public static void ejecutarBusqueda(Pokemon[] pokemones, Scanner scanner) {
        System.out.println("\n--- BÚSQUEDA DE POKÉMON ---");
        System.out.print("Ingrese el nombre del Pokémon a buscar: ");
        String nombreBuscado = scanner.nextLine(); 

        Pokemon encontrado = buscarPorNombre(pokemones, nombreBuscado);

        if (encontrado != null) {
            System.out.println("\n Pokémon ENCONTRADO:");
            System.out.println(encontrado.toString()); 
        } else {
            System.out.println("\n ERROR: Pokémon '" + nombreBuscado + "' no encontrado.");
        }
    }

    public static Pokemon buscarPorIdBinaria(Pokemon[] pokemones, int idBuscado) {
        if (pokemones == null) {
            return null;
        }

        int inicio = 0;
        int fin = pokemones.length - 1;
        
        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;

            if (pokemones[medio].getId() == idBuscado) {
                return pokemones[medio];
            } else if (pokemones[medio].getId() < idBuscado) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        return null; 
    }

    public static void ejecutarBusquedaBinaria(Pokemon[] pokemones, Scanner scanner) {
        System.out.println("\n--- BÚSQUEDA BINARIA POR ID ---");
        System.out.println("(!) Nota: Este método asume que la lista está ordenada por ID.");
        System.out.print("Ingrese el ID del Pokémon a buscar: ");
        
        if (!scanner.hasNextInt()) {
            System.out.println("\n ERROR: La entrada debe ser un número entero (ID).");
            scanner.nextLine();
            return;
        }
        
        int idBuscado = scanner.nextInt();
        scanner.nextLine();
        
        Pokemon encontrado = buscarPorIdBinaria(pokemones, idBuscado);

        if (encontrado != null) {
            System.out.println("\n Pokémon ENCONTRADO:");
            System.out.println(encontrado.toString()); 

        } else {
            System.out.println("\n ERROR: Pokémon con ID '" + idBuscado + "' no encontrado.");
        }
    }
}