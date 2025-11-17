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
}