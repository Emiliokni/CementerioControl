public class Guardia {
    private String nombre1;
    private int ubicacion;

    public Guardia(String nombre, String ubicacion) {
        this.nombre1 = nombre;
        this.ubicacion = Integer.parseInt(ubicacion);
    }

    public String buscarUbicacion() {
        return "Ubicación actual: " + ubicacion;
    }

    public boolean Vigila() {
        return true;
    }
}
