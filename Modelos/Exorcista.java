public class Exorcista {
    private String nombre;
    private int exorcismos;

    public Exorcista(String nombre, int exorcismos) {
        this.nombre = nombre;
        this.exorcismos = exorcismos;
    }

    public void Exorcisar() {
        System.out.println(nombre + " ha realizado un exorcismo.");
        exorcismos++;
    }

    public void Bendecir() {
        System.out.println(nombre + " ha bendecido un lugar.");
    }

}
