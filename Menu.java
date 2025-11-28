import java.util.Scanner;

public class Menu {
public static void ejecutarMenu(Pokemon[] pokemones, Entrenador[] entrenadores, Scanner scanner) {
        int opcion = 0;
        
        do {
            System.out.println("\n==============================================");
            System.out.println("           MENÚ PRINCIPAL DE LA LIGA");
            System.out.println("==============================================");
            System.out.println("1. Mostrar todos los Pokémones de la Liga");
            System.out.println("2. Buscar Pokémon por Nombre (Búsqueda Lineal)");
            System.out.println("3. Ordenar Pokémones por Ataque (Método Selección)");
            System.out.println("4. Ordenar Pokémones por ID (Método Inserción)");
            System.out.println("5. Buscar Pokémon por ID (Búsqueda Binaria)");
            System.out.println("6. Iniciar Campeonato Simple (Round Robin)");
            System.out.println("0. Salir de la aplicación");
            System.out.println("==============================================");
            System.out.print("Seleccione una opción: ");
            
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine();
                
                switch (opcion) {
                    case 1:
                        Imprimir.imprimirEncabezado("LISTA DE POKEMONES");
                        Imprimir.imprimirPokemones(pokemones);
                        break;
                    case 2:
                        Busqueda.ejecutarBusqueda(pokemones, scanner);
                        break;
                    case 3:
                        Imprimir.imprimirEncabezado("LISTA DE POKEMONES POR ATAQUE");
                        Ordenamiento.ordenarPorAtaqueSeleccion(pokemones);
                        Imprimir.imprimirPokemones(pokemones);
                        break;
                    case 4:
                        Imprimir.imprimirEncabezado("LISTA DE POKEMONES ORDENADOS POR ID");
                        Ordenamiento.ordenarPorIdInsercion(pokemones);
                        Imprimir.imprimirPokemones(pokemones);
                        break;
                    case 5:
                        Busqueda.ejecutarBusquedaBinaria(pokemones, scanner);
                        break;
                    case 6:
                        Campeonato.campeonatoSimple(pokemones, entrenadores, scanner);                        
                        break;
                    case 0:
                        System.out.println("\nGracias por usar la aplicación de la Liga Pokémon. ¡Hasta pronto!");
                        break;
                    default:
                        System.out.println("\nOpción inválida. Por favor, intente de nuevo.");
                }
            } else {
                System.out.println("\nEntrada inválida. Por favor, ingrese un número.");
                scanner.nextLine();
                opcion = -1;
            }
        } while (opcion != 0);
    }
}