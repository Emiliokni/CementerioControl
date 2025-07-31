public class Exorcista {
    private String nombre;
    private int exorcismos;

    public Exorcista(String nombre, int exorcismos) {
        this.nombre = nombre;
        this.exorcismos = exorcismos;
    }

    public String exorcisar() {
        exorcismos++;
        return nombre + " ha realizado un exorcismo.";
    }

    public String bendecir() {
        return nombre + " ha bendecido un lugar.";
    }

}
