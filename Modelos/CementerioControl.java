public class CementerioControl {
Exorcista e = null;
Guardia g = null;
    public CementerioControl() {
    }

    public String crearexorcista(String nombre, int ex){
    e = new Exorcista(nombre, ex);
    return "Exorcista creado.";
    }

    public String realizarExorcismo() {
        if (e != null) {
            return e.exorcisar();
        }
        return "Primero debes crear un exorcista.";
    }

    public String realizarBendicion(){
        if (e != null){
            return e.bendecir();
        }
        return "Primero debes crear un exorcista.";
    }

    public String crearGuardia(String nombre1, String ubicacion){
    g = new Guardia(nombre1, ubicacion);
    return "Guardia Creado";
    }
}
