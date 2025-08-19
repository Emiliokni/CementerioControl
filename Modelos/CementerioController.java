public class CementerioController {

    private Exorcista e = null;
    private Guardia g = null;
    private Lote lote = null;
    private Lapida lapida = null;
    CementerioController() {

    }

    public String asustarEnterrador(Fantasma fantasma, Enterrador enterrador)
     {
        return "El fantasma asusta a "+enterrador.getNombre()+"! :O";
    }
    public String poseerenterrador(Fantasma fantasma, Enterrador enterrador)
    {
        return "El fantasma posee a "+enterrador.getNombre()+"! D:";
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

    public String crearGuardia(String nombre, String ubicacion, boolean vigilando) {
        g = new Guardia(nombre, ubicacion, vigilando);
        return "Guardia creado.";
    }

    public String buscarUbic() {
    if (g != null){
        return g.verUbic();
    }
    return "Debes crear un guardia";
    }
    
    public String vigilar() {
        if (g != null) {
            return g.vigilar();
    }
        return "Debes crear un guardia.";
    }

    public String crearLote(double precio, double diametro) {
        lote = new Lote();
        lote.setPrecio(precio);
        lote.setDiametro(diametro);
        return "Lote creado con precio y diametro asignados.";
    }

    public String setPrecioLote(double precio) {
        if (lote == null) return "Primero debes crear un lote.";
        lote.setPrecio(precio);
        return "Precio actualizado.";
    }

    public String setDiametroLote(double diametro) {
        if (lote == null) return "Primero debes crear un lote.";
        lote.setDiametro(diametro);
        return "Diametro actualizado.";
    }

    public String verPrecioLote() {
        if (lote == null) return "Primero debes crear un lote.";
        lote.verPrecio();
        return "(Precio mostrado arriba)";
    }

    public String verDiametroLote() {
        if (lote == null) return "Primero debes crear un lote.";
        lote.verDiametro();
        return "(Diametro mostrado arriba)";
    }

    // ======== Lapida ========
    public String crearLapida(String forma, String materiales) {
        lapida = new Lapida(forma, materiales);
        return "Lapida creada.";
    }

    public String verFormaLapida() {
        if (lapida == null) return "Primero debes crear una lapida.";
        lapida.verForma();
        return "(Forma mostrada arriba)";
    }

    public String verMaterialesLapida() {
        if (lapida == null) return "Primero debes crear una lapida.";
        lapida.verMaterial();
        return "(Materiales mostrados arriba)";
    }
}