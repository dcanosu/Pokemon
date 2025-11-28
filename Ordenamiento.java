public class Ordenamiento {

    public static void ordenarPorAtaqueSeleccion(Pokemon[] pokemones) {
        if (pokemones == null || pokemones.length <= 1) {
            return;
        }

        int pokemonActual = pokemones.length;
        
        for (int i = 0; i < pokemonActual - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < pokemonActual; j++) {
                if (pokemones[j].getAtaque() < pokemones[indiceMinimo].getAtaque()) {
                    indiceMinimo = j;
                }
            }
            
            if (indiceMinimo != i) {
                Pokemon temp = pokemones[i];
                pokemones[i] = pokemones[indiceMinimo];
                pokemones[indiceMinimo] = temp;
            }
        }
    }

    public static void ordenarPorIdInsercion(Pokemon[] pokemones) {
        if (pokemones == null || pokemones.length <= 1) {
            return;
        }

        for (int i = 1; i < pokemones.length; i++) {
            Pokemon temp = pokemones[i]; 
            int j = i - 1;

            while (j >= 0 && pokemones[j].getId() > temp.getId()) {
                pokemones[j + 1] = pokemones[j];
                j--;
            }
            pokemones[j + 1] = temp;
        }
    }
}