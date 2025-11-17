import java.util.Scanner;

public class Menu {
public static void ejecutarMenu(Pokemon[] pokemones, Scanner scanner) {
        int opcion = 0;
        
        do {
            System.out.println("\n==============================================");
            System.out.println("           MENÚ PRINCIPAL DE LA LIGA");
            System.out.println("==============================================");
            System.out.println("1. Mostrar todos los Pokémones de la Liga");
            System.out.println("2. Buscar Pokémon por Nombre (Búsqueda Lineal)");
            System.out.println("3. Ordenar Pokémones por Ataque (Método Selección)");
            System.out.println("0. Salir de la aplicación");
            System.out.println("==============================================");
            System.out.print("Seleccione una opción: ");
            
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine();
                
                switch (opcion) {
                    case 1:
                        // Asumimos que quieres ver la lista ordenada por ID
                        CalculosPokemon.ordenarPorId(pokemones);
                        ImpresionPokemon.imprimirEncabezado();
                        ImpresionPokemon.imprimirPokemones(pokemones);
                        break;
                    case 2:
                        // Usar el método de Interfaz que pide datos y muestra el resultado
                        Liga.ejecutarBusqueda(pokemones, scanner);
                        break;
                    case 3:
                        // 🛑 REQUISITO BINARIO: Primero ordenar por ID
                        CalculosPokemon.ordenarPorId(pokemones); 
                        
                        System.out.print("\nIngrese el ID del Pokémon a buscar (Búsqueda Binaria): ");
                        if (scanner.hasNextInt()) {
                            int idBuscado = scanner.nextInt();
                            scanner.nextLine();
                            
                            Pokemon encontrado = Liga.buscarBinarioPorId(pokemones, idBuscado);
                            if (encontrado != null) {
                                System.out.println("\n✅ Pokémon ENCONTRADO por ID: " + encontrado.getNombre());
                                System.out.println(encontrado.toString());
                            } else {
                                System.out.println("\n❌ ERROR: El ID " + idBuscado + " no se encuentra en la lista.");
                            }
                        } else {
                            System.out.println("❌ Entrada inválida. Debe ingresar un número.");
                            scanner.nextLine();
                        }
                        break;
                    case 4:
                        CalculosPokemon.ordenarPorAtaqueSeleccion(pokemones);
                        System.out.println("\n--- LISTA ORDENADA POR ATAQUE (SELECCIÓN) ---");
                        ImpresionPokemon.imprimirEncabezado();
                        ImpresionPokemon.imprimirPokemones(pokemones);
                        break;
                    case 0:
                        System.out.println("\nGracias por usar la aplicación de la Liga Pokémon. ¡Hasta pronto!");
                        break;
                    default:
                        System.out.println("\nOpción inválida. Por favor, intente de nuevo.");
                }
            } else {
                System.out.println("\nEntrada inválida. Por favor, ingrese un número.");
                scanner.nextLine(); // Limpiar la entrada no numérica
            }
        } while (opcion != 0);
    }
}
