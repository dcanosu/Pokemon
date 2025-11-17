import java.util.Scanner;

public class Registro {
    public static Pokemon[] registrarPokemon(Scanner scanner) {

        int repeticiones = 65;
        System.out.println("\n"+"=".repeat(repeticiones));
        System.out.println("                     REGISTRO DE POKEMONES");
        System.out.println("=".repeat(repeticiones)+"\n");

        System.out.print("¿Cuántos Pokemón deseas registrar? (Máximo 40): ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();

        if (cantidad <= 0 || cantidad > 40) {
            System.out.println("\n"+"=".repeat(repeticiones));
            System.out.println("Cantidad inválida. Has excedido el número máximo de Pokemones posibles a registrar");
            System.out.println("=".repeat(repeticiones)+"\n");
            System.out.println("Saliendo del programa...");
            return null;
        }

        if (cantidad == 1) {
            System.out.println("Vas a registrar " + cantidad + " Pokemón en la liga.");
        } else {
            System.out.println("Vas a registrar " + cantidad + " Pokemones en la liga.");
        }
        
        Pokemon[] pokemones = new Pokemon[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Registro del Pokemon #" + (i + 1));

            System.out.print("Ingresa el ID del Pokemon: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Ingresa el nombre del Pokemon: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingresa el tipo del Pokemon: ");
            String tipo = scanner.nextLine();

            System.out.print("Ingresa el nombre del entrenador: ");
            String entrenador = scanner.nextLine();

            pokemones[i] = new Pokemon(id, nombre, tipo, entrenador);
        } return pokemones;
    }

    public static Pokemon[] registrarPokemonesAleatoriamente(int numeroPokemones) {
        final int MIN_ID = 1;
        final int MAX_ID = 100;
        final String [] NOMBRE_POKEMONES = {
            "Pikachu", "Bulbasaur", "Charmander", "Squirtle", "Jigglypuff",
            "Meowth", "Psyduck", "Machop", "Geodude", "Gengar",
            "Onix", "Snorlax", "Vaporeon", "Jolteon", "Flareon",
            "Mewtwo", "Dragonite", "Chikorita", "Cyndaquil", "Totodile",
            "Togepi", "Marill", "Wooper", "Umbreon", "Espeon",
            "Treecko", "Torchic", "Mudkip", "Ralts", "Gardevoir",
            "Slaking", "Zubat", "Eevee", "Lapras", "Arcanine",
            "Alakazam", "Magikarp", "Dratini", "Pichu", "Lucario"
        };
        final String [] TIPO = {"Agua", "Fuego", "Planta", "Eléctrico"};
        final String [] ENTRENADOR = {
            "Ash", "Misty", "Gary", "Sabrina"
        };

        Pokemon[] pokemones = new Pokemon[numeroPokemones];
        java.util.Random random = new java.util.Random();

        for (int i = 0; i < numeroPokemones; i++) {
            int id = random.nextInt(MAX_ID - MIN_ID +1 ) + MIN_ID;
            String nombre = NOMBRE_POKEMONES[random.nextInt(NOMBRE_POKEMONES.length)];
            String tipo = TIPO[random.nextInt(TIPO.length)];
            String entrenador = ENTRENADOR[random.nextInt(ENTRENADOR.length)];

            pokemones[i] = new Pokemon(id, nombre, tipo, entrenador);
        }return pokemones;
    }

            // System.out.println("Pokemones registrados exitosamente.\n");
            // for (int i = 0; i < cantidad; i++) {
            //     System.out.println(pokemones[i].toString());
            // }
            // scanner.close();
}

