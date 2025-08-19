class Lapida {
 private String forma;
 private String materiales;
 public Lapida(String forma, String materiales) {
 this.forma = forma;
 this.materiales = materiales;
 }
 public void verForma() {
 System.out.println("Forma: " + forma);
 }
 public void verMaterial() {
 System.out.println("Materiales: " + materiales);
 }
}