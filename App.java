import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);

        // Pokemon[] pokemones = Registro.registrarPokemon(miScanner);
        Pokemon[] pokemones = Registro.registrarPokemonesAleatoriamente(35);
        // Entrenador[] entrenadores = Registro.registrarEntrenadoresManual(pokemones, miScanner);

        Entrenador[] entrenadores = Registro.registrarEntrenadoresAleatoriamente(pokemones);

        System.out.println("===============================================================");
        System.out.println(" INICIALIZANDO LIGA POKÉMON: Se cargaron " + (pokemones != null ? pokemones.length : 0) + " Pokémones.");
        System.out.println(" Se inicializaron " + (entrenadores != null ? entrenadores.length : 0) + " Entrenadores para el Campeonato.");
        System.out.println("===============================================================");

        if (pokemones != null && pokemones.length > 0 && entrenadores != null) {
            Menu.ejecutarMenu(pokemones, entrenadores, miScanner); 
        } else {
            System.out.println("No se cumplen las condiciones mínimas para iniciar la Liga.");
        } 
        miScanner.close();
    }
}
