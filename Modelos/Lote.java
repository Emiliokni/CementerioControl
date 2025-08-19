class Lote {
 private double precio;
 private double diametro;
 public Lote() { }
 public void setPrecio(double precio) {
 this.precio = precio;
 }
 public void setDiametro(double diametro) {
 this.diametro = diametro;
 }
 public void verPrecio() {
 System.out.println("Precio: " + precio);
 }
 public void verDiametro() {
 System.out.println("Diámetro: " + diametro);
 }
}