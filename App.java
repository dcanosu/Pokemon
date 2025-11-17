import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);

        // Pokemon[] pokemones = Registro.registrarPokemon(miScanner);
        Pokemon[] pokemones = Registro.registrarPokemonesAleatoriamente(35);

        System.out.println("===============================================================");
        System.out.println(" INICIALIZANDO LIGA POKÉMON: Se cargaron " + (pokemones != null ? pokemones.length : 0) + " Pokémones.");
        System.out.println("===============================================================");

        if (pokemones != null && pokemones.length > 0) {
            Menu.ejecutarMenu(pokemones, miScanner);
        }else {
            System.out.println("No se realizó el registro de ningún Pokemón. Saliendo de la aplicación...");
        } miScanner.close();
    }
}
