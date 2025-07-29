import java.util.Scanner;

public class MainExorcista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Exorcista e = null;

        while (true) {
            System.out.println("\n--- MENÚ EXORCISTA ---");
            System.out.println("1. Crear exorcista");
            System.out.println("2. Realizar exorcismo");
            System.out.println("3. Bendecir lugar");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            int op = sc.nextInt();
            sc.nextLine(); // limpia buffer

            if (op == 1) {
                System.out.print("Nombre: ");
                String nombre = sc.nextLine();
                System.out.print("Cantidad de exorcismos: ");
                int ex = sc.nextInt();
                sc.nextLine();
                e = new Exorcista(nombre, ex);
                System.out.println("Exorcista creado.");
            }

            if (op == 2) {
                if (e != null) {
                    e.Exorcisar();
                } else {
                    System.out.println("Primero crea un exorcista.");
                }
            }

            if (op == 3) {
                if (e != null) {
                    e.Bendecir();
                } else {
                    System.out.println("Primero crea un exorcista.");
                }
            }

            if (op == 4) {
                break;
            }
        }
    }
}