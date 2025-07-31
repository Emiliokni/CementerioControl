import java.util.Scanner;

public class MainGuardia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CementerioControl controler = new CementerioControl();

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
                String nombre1 = sc.nextLine();
                System.out.print("Ubicación (número): ");
                String ubicacion = sc.nextLine();
                controler.crearGuardia(nombre1,ubicacion);
            }

            if (op == 2) {
                controler.buscarUbic();
            }

            if (op == 3) {
                controler.vigilar();
            }

            if (op == 4) {
                break;
            }
        }
    }
}