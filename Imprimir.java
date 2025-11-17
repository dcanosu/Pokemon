public class Imprimir {
    public static void imprimirEncabezado(String titulo) {
    
    int repeticiones = 65;
    System.out.println("\n"+"=".repeat(repeticiones));
    System.out.println("                      " + titulo);
    // System.out.println("                     LISTA DE POKEMONES");
    System.out.println("=".repeat(repeticiones)+"\n");
    System.out.printf("%-5s | %-15s | %-12s | %-8s | %-8s | %-10s%n",
                "Id", "Nombre", "Tipo", "Ataque", "Defensa", "Entrenador");
    System.out.println("-".repeat(repeticiones));
    }

    public static void imprimirPokemones(Pokemon[] pokemones){
        for (int i = 0; i < pokemones.length; i++) {
            System.out.printf("%-5d | %-15s | %-12s | %-8d | %-8d | %-10s%n",
                pokemones[i].getId(),
                pokemones[i].getNombre(),
                pokemones[i].getTipo(),
                pokemones[i].getAtaque(),
                pokemones[i].getDefensa(),
                pokemones[i].getEntrenador());
        } System.out.println("-".repeat(65));
    }
}