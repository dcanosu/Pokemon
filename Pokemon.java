public class Pokemon {

    private int id;
    private String nombre;
    private String tipo;
    private int ataque;
    private int defensa;
    private String entrenador;
    private int hp;
    private final int HP_BASE = 100;     

    public Pokemon(int id, String nombre, String tipo, String entrenador) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.entrenador = entrenador;

        this.ataque = (int) (Math.random() * 100) + 1;
        this.defensa = (int) (Math.random() * 100) + 1;
        this.hp = HP_BASE;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public String getEntrenador() {
        return entrenador;
    }

    public int getHp() {
        return hp;
    }
    
    public void resetHp() {
        this.hp = HP_BASE;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
    
    @Override
    public String toString() {
        return "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", ataque=" + ataque +
                ", defensa=" + defensa +
                ", entrenador='" + entrenador + '\'' +
                '}';
    }
}