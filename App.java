public class App {
    public static void main(String[] args) {
        Pokemon[] pokemones = Registro.registrarPokemon();
        Imprimir.imprimirEncabezado();
        Imprimir.imprimirPokemones(pokemones);
    }
}
