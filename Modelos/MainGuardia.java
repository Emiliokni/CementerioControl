import java.util.Scanner;

public class MainGuardia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Guardia g = null;

        while (true) {
            System.out.println("\n--- MENÚ GUARDIA ---");
            System.out.println("1. Crear guardia");
            System.out.println("2. Ver ubicación");
            System.out.println("3. ¿Está vigilando?");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            int op = sc.nextInt();
            sc.nextLine();

            if (op == 1) {
                System.out.print("Nombre: ");
                String nombre = sc.nextLine();
                System.out.print("Ubicación (número): ");
                String ubicacion = sc.nextLine();
                g = new Guardia(nombre, ubicacion);
                System.out.println("Guardia creado.");
            }

            if (op == 2) {
                if (g != null) {
                    System.out.println(g.buscarUbicacion());
                } else {
                    System.out.println("Primero crea un guardia.");
                }
            }

            if (op == 3) {
                if (g != null) {
                    System.out.println(g.Vigila() ? "Sí vigila." : "No vigila.");
                } else {
                    System.out.println("Primero crea un guardia.");
                }
            }

            if (op == 4) {
                break;
            }
        }
    }
}