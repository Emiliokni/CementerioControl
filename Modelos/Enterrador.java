public class Enterrador {

    //atributos
    private String nombre;
    private String herramientas;
    private int tumbascabadas;
    private int cuerposprofan;

    //constructores
    public Enterrador(String nombre, String herramientas, int tumbascabadas, int cuerposprofan){
        this.nombre = nombre;
        this.herramientas = herramientas;
        this.tumbascabadas = tumbascabadas;
        this.cuerposprofan = cuerposprofan;
    }

    public Enterrador(String nombre, String herramientas){
        this.nombre = nombre;
        this.herramientas = herramientas;
    }

    public Enterrador(String nombre, int tumbascabadas){
        this.nombre = nombre;
        this.tumbascabadas = tumbascabadas;
    }

    public Enterrador(String nombre){
        this.nombre = nombre;
    }

    ///metodos
    public void entierra() {
        System.out.println("Entierra un muerto.");
    }

    public void cuidatumbas() {
        System.out.println("Cuida las tumbas del cementerio.");
    }

    public void desenterrar() {
        System.out.println("Desentierra a un muerto.");
    }

    public void cavarfosa() {
        System.out.println("Cava una fosa.");
    }

    public String getNombre (){
        return nombre;
    }

}
