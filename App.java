import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);

        // Pokemon[] pokemones = Registro.registrarPokemon(miScanner);
        Pokemon[] pokemones = Registro.registrarPokemonesAleatoriamente(10);
        if (pokemones != null) {
            Imprimir.imprimirEncabezado();
            Imprimir.imprimirPokemones(pokemones);
            Busqueda.ejecutarBusqueda(pokemones, miScanner);
        }else {
            System.out.println("No se realizó el registro de ningún Pokemón");
        } miScanner.close();
    }
}
