import java.lang.Math;

public class Batalla {

    private static double calcularEfectividad(String atacanteTipo, String defensorTipo) {
        String at = atacanteTipo.toLowerCase();
        String def = defensorTipo.toLowerCase();

        if (at.equals(def)) return 1.0; 

        if (at.equals("agua")) {
            if (def.equals("fuego")) return 2.0;
            if (def.equals("planta")) return 0.5;
        }
        else if (at.equals("fuego")) {
            if (def.equals("planta")) return 2.0;
            if (def.equals("agua")) return 0.5;
        }
        else if (at.equals("planta")) {
            if (def.equals("agua")) return 2.0;
            if (def.equals("fuego")) return 0.5; 
        }
        else if (at.equals("eléctrico")) {
            if (def.equals("agua")) return 2.0;
        }
        return 1.0;
    }

    private static int calcularDano(Pokemon atacante, Pokemon defensor) {
        double efectividad = calcularEfectividad(atacante.getTipo(), defensor.getTipo());
        
        // Fórmula: daño = 50 * (ataque / defensa) * efectividad
        double danoCalculado = 50.0 * ((double) atacante.getAtaque() / defensor.getDefensa()) * efectividad;
        
        int dano = (int) Math.round(danoCalculado);
        
        return Math.max(1, dano);
    }
    
    public static Pokemon simularBatalla(Pokemon poke1, Pokemon poke2) {
        poke1.resetHp();
        poke2.resetHp();
        int turno = 1;

        Imprimir.imprimirEncabezado("BATALLA: " + poke1.getNombre() + " vs " + poke2.getNombre());
        System.out.printf("%-6s | %-15s | %-8s | %-15s | %-8s%n",
                            "Turno", "Atacante", "Daño", "Defensor", "HP Restante");
        System.out.println("-".repeat(65));

        while (poke1.getHp() > 0 && poke2.getHp() > 0) {
            
            if (poke1.getHp() > 0) {
                int dano = calcularDano(poke1, poke2);
                int hpRestante = Math.max(0, poke2.getHp() - dano);
                poke2.setHp(hpRestante);
                
                System.out.printf("%-6d | %-15s | %-8d | %-15s | %-8d%n",
                            turno, poke1.getNombre(), dano, poke2.getNombre(), poke2.getHp());
                turno++;
            }

            if (poke2.getHp() <= 0) break;

            if (poke2.getHp() > 0) {
                int dano = calcularDano(poke2, poke1);
                int hpRestante = Math.max(0, poke1.getHp() - dano);
                poke1.setHp(hpRestante);
                
                System.out.printf("%-6d | %-15s | %-8d | %-15s | %-8d%n",
                            turno, poke2.getNombre(), dano, poke1.getNombre(), poke1.getHp());
                turno++;
            }
        }
        System.out.println("-".repeat(65));
        
        Pokemon ganador = poke1.getHp() > 0 ? poke1 : poke2;
        System.out.println("¡GANADOR: " + ganador.getNombre() + "!");
        return ganador;
    }
}