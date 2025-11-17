import java.util.Scanner;

public class LigaPokemon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿cuantos Pokemon deseas registrar? (maximo 40): ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();

        if (cantidad > 40) {
            System.out.println("Has excedido el numero maximo de Pokemones (40).");
            cantidad = 40;
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

            pokemones[i] = new Pokemon(id, nombre, tipo, 0, 0, entrenador);
        }

        System.out.println("Pokemones registrados exitosamente.\n");
        for (int i = 0; i < cantidad; i++) {
            System.out.println(pokemones[i].toString());
        }
        scanner.close();
    }
}