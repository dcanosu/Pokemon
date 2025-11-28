import java.util.Scanner;
import java.util.Random;

public class Campeonato {

    private static Pokemon buscarPokemonPorId(Pokemon[] pokedex, int id) {
        for (Pokemon p : pokedex) {
            if (p != null && p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    private static Entrenador buscarEntrenadorPorNombre(Entrenador[] entrenadores, String nombre) {
        for (Entrenador e : entrenadores) {
            if (e != null && e.getNombre().equalsIgnoreCase(nombre)) {
                return e;
            }
        }
        return null;
    }

    public static void campeonatoSimple(Pokemon[] pokedex, Entrenador[] entrenadores, Scanner scanner) {
        
        if (entrenadores == null || entrenadores.length < 2) {
            System.out.println("ERROR: No se pudo iniciar el campeonato. Se requieren al menos 2 entrenadores.");
            return;
        }

        System.out.println("\n--- INICIO DEL CAMPEONATO ROUND ROBIN ---");
        System.out.println("Participantes: " + entrenadores.length + " Entrenadores.");
    
        Random random = new Random();
        int numEntrenadores = entrenadores.length;

        for (int i = 0; i < numEntrenadores; i++) {
            for (int j = i + 1; j < numEntrenadores; j++) {
                Entrenador entA = entrenadores[i];
                Entrenador entB = entrenadores[j];
                
                System.out.println("\n[PARTIDA]: " + entA.getNombre() + " vs " + entB.getNombre());

                int idA = entA.getEquipoIds()[random.nextInt(entA.getEquipoIds().length)];
                int idB = entB.getEquipoIds()[random.nextInt(entB.getEquipoIds().length)];
                
                Pokemon pokeA = buscarPokemonPorId(pokedex, idA);
                Pokemon pokeB = buscarPokemonPorId(pokedex, idB);

                if (pokeA == null || pokeB == null) {
                    System.out.println("ADVERTENCIA: Saltando batalla. Pokémon no encontrado en la Pokedex (ID: " + idA + " o " + idB + ").");
                    continue;
                }
                
                System.out.println("Enfrentamiento: " + entA.getNombre() + " (" + pokeA.getNombre() + 
                                ") vs " + entB.getNombre() + " (" + pokeB.getNombre() + ")");
                System.out.println("--------------------------------------------------");

                Pokemon ganador = Batalla.simularBatalla(pokeA, pokeB);

                if (ganador == pokeA) {
                    entA.actualizarEstadisticas(true);
                    entB.actualizarEstadisticas(false);
                    System.out.println("Resultado: " + entA.getNombre() + " gana.");
                } else {
                    entA.actualizarEstadisticas(false);
                    entB.actualizarEstadisticas(true);
                    System.out.println("Resultado: " + entB.getNombre() + " gana.");
                }
            }
        }

        mostrarTablaPosiciones(entrenadores);
    }
    
    private static void mostrarTablaPosiciones(Entrenador[] entrenadores) {
        Imprimir.imprimirEncabezado("TABLA DE POSICIONES FINAL");
        System.out.printf("%-15s | %-4s | %-4s | %-4s | %-12s%n",
                "Entrenador", "PJ", "PG", "PP", "% Victorias");
        System.out.println("-".repeat(50));
        
        for (Entrenador e : entrenadores) {
            if (e != null) {
                System.out.printf("%-15s | %-4d | %-4d | %-4d | %-12.2f%n",
                    e.getNombre(), e.getPj(), e.getPg(), e.getPp(), e.getPorcentajeVictorias());
            }
        }
        System.out.println("-".repeat(50));
    }
}