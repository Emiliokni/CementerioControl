public class Fantasma{

    //atributos
    private String peligrosidad;
    private int avistamientos;
    
    //constructores
    public Fantasma(String peligrosidad, int avistamientos) {
        this.peligrosidad = peligrosidad;
        this.avistamientos = avistamientos; 
    }
    
    public Fantasma(String peligrosidad) {
        this.peligrosidad = peligrosidad;
    }

    //metodos
    public void cantobserv(){
        System.out.println("Se ha observado " + avistamientos + " veces.");
    }

    public String poseer(Enterrador enterrador){
        return "El fantasma ha poseido a "+enterrador.getNombre();
    }    

    public void verpeligro(){
        System.out.println("La peligrosidad del fantasma es " + peligrosidad + ".");
    }
}
