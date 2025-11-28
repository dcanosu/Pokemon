public class Entrenador {

    private int id;
    private String nombre;
    private int[] equipoIds;
    private int pj;
    private int pg;
    private int pp;
    private double porcentajeVictorias;

    public Entrenador(int id, String nombre, int[] equipoIds) {
        this.id = id;
        this.nombre = nombre;
        this.equipoIds = equipoIds;
        this.pj = 0;
        this.pg = 0;
        this.pp = 0;
        this.porcentajeVictorias = 0.0;
    }


    public int getId() {
        return id;
    }


    public String getNombre() {
        return nombre;
    }


    public int[] getEquipoIds() {
        return equipoIds;
    }


    public int getPj() {
        return pj;
    }


    public int getPg() {
        return pg;
    }


    public int getPp() {
        return pp;
    }


    public double getPorcentajeVictorias() {
        return porcentajeVictorias;
    }

    public void actualizarEstadisticas(boolean gano) {
        this.pj++;
        if (gano) {
            this.pg++;
        } else {
            this.pp++;
        }
        if (this.pj > 0) {
            this.porcentajeVictorias = ((double) this.pg / this.pj) * 100.0;
        } else {
            this.porcentajeVictorias = 0.0;
        }
    }
}