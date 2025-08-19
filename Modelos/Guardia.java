public class Guardia {
    private String nombre;
    private String ubicacion;
    private boolean vigilando;

    public Guardia(String nombre, String ubicacion, boolean vigilando) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.vigilando = vigilando;
    }

    public String verUbic() {
        return "El guardia " + nombre + " está en: " + ubicacion;
    }

    // Puedes alternar estado o solo reportarlo; aquí alterno a modo demo
    public String vigilar() {
        vigilando = !vigilando;
        return "El guardia " + nombre + (vigilando ? " está vigilando." : " dejó de vigilar.");
    }
}
