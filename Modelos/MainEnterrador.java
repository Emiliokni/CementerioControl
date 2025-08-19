import java.util.Scanner;

public class MainEnterrador {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CementerioController control = new CementerioController();

        Enterrador enterrador = new Enterrador("Luis", "Pala", 24, 0);
        Fantasma fantasma = new Fantasma("Alta", 1);

        boolean salir = false;
        while (!salir) {
            System.out.println("\nA quien deseas observar?");
            System.out.println("1. Enterrador");
            System.out.println("2. Fantasma");
            System.out.println("3. Exorcista");
            System.out.println("4. Guardia");
            System.out.println("5. Lote");
            System.out.println("6. Lapida");
            System.out.println("7. Salir");
            System.out.print("Opcion: ");

            int obs;
            try {
                obs = scanner.nextInt();
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Ingrese un numero valido.");
                scanner.nextLine();
                continue;
            }
            //enterrador
            switch (obs) {
                case 1: {
                    boolean salirSub = false;
                    while (!salirSub) {
                        System.out.println("1. Enterrar un muerto");
                        System.out.println("2. Cuidar las tumbas");
                        System.out.println("3. Desenterrar un muerto");
                        System.out.println("4. Cavar una fosa");
                        System.out.println("5. Volver");
                        System.out.print("Opcion: ");

                        int op;
                        try { op = scanner.nextInt(); scanner.nextLine(); }
                        catch (Exception e) { System.out.println("Numero invalido."); scanner.nextLine(); continue; }

                        switch (op) {
                            case 1: enterrador.entierra(); break;
                            case 2: enterrador.cuidatumbas(); break;
                            case 3: enterrador.desenterrar(); break;
                            case 4: enterrador.cavarfosa(); break;
                            case 5: salirSub = true; break;
                            default: System.out.println("Opcion invalida.");
                        }
                    }
                    break;
                }
                //fantasma
                case 2: {
                    boolean salirSub = false;
                    while (!salirSub) {
                        System.out.println("1. Ver el numero de avistamientos");
                        System.out.println("2. Ver la peligrosidad");
                        System.out.println("3. Asustar al enterrador");
                        System.out.println("4. Poseer al enterrador");
                        System.out.println("5. Volver");
                        System.out.print("Opcion: ");

                        int op;
                        try { op = scanner.nextInt(); scanner.nextLine(); }
                        catch (Exception e) { System.out.println("Numero invalido."); scanner.nextLine(); continue; }

                        switch (op) {
                            case 1: fantasma.cantobserv(); break;
                            case 2: fantasma.verpeligro(); break;
                            case 3: System.out.println(control.asustarEnterrador(fantasma, enterrador)); break;
                            case 4: System.out.println(control.poseerenterrador(fantasma, enterrador)); break;
                            case 5: salirSub = true; break;
                            default: System.out.println("Opcion invalida.");
                        }
                    }
                    break;
                }
                //exorcista
                case 3: {
                    boolean salirSub = false;
                    while (!salirSub) {
                        System.out.println("1. Crear exorcista");
                        System.out.println("2. Realizar exorcismo");
                        System.out.println("3. Bendecir lugar");
                        System.out.println("4. Volver");
                        System.out.print("Opcion: ");

                        int op;
                        try { op = scanner.nextInt(); scanner.nextLine(); }
                        catch (Exception e) { System.out.println("Numero invalido."); scanner.nextLine(); continue; }

                        switch (op) {
                            case 1: {
                                System.out.print("Nombre del exorcista: ");
                                String nom = scanner.nextLine();
                                System.out.print("Exorcismos previos (entero): ");
                                int n;
                                try { n = scanner.nextInt(); scanner.nextLine(); }
                                catch (Exception e) { System.out.println("Numero invalido, se usara 0."); scanner.nextLine(); n = 0; }
                                System.out.println(control.crearexorcista(nom, n));
                                break;
                            }
                            case 2: System.out.println(control.realizarExorcismo()); break;
                            case 3: System.out.println(control.realizarBendicion()); break;
                            case 4: salirSub = true; break;
                            default: System.out.println("Opcion invalida.");
                        }
                    }
                    break;
                }
                //guardia
                case 4: {
                    boolean salirSub = false;
                    while (!salirSub) {
                        System.out.println("1. Crear guardia");
                        System.out.println("2. Ver ubicacion");
                        System.out.println("3. Vigilar");
                        System.out.println("4. Volver");
                        System.out.print("Opcion: ");

                        int op;
                        try { op = scanner.nextInt(); scanner.nextLine(); }
                        catch (Exception e) { System.out.println("Numero invalido."); scanner.nextLine(); continue; }

                        switch (op) {
                            case 1: {
                                System.out.print("Nombre del guardia: ");
                                String nom = scanner.nextLine();
                                System.out.print("Ubicacion actual: ");
                                String ubic = scanner.nextLine();
                                System.out.println(control.crearGuardia(nom, ubic, true));
                                break;
                            }
                            case 2: System.out.println(control.buscarUbic()); break;
                            case 3: System.out.println(control.vigilar()); break;
                            case 4: salirSub = true; break;
                            default: System.out.println("Opcion invalida.");
                        }
                    }
                    break;
                }
                //lote
                case 5: {
                    boolean salirSub = false;
                    while (!salirSub) {
                        System.out.println("1. Crear lote (precio y diametro)");
                        System.out.println("2. Cambiar precio");
                        System.out.println("3. Cambiar diametro");
                        System.out.println("4. Ver precio");
                        System.out.println("5. Ver diametro");
                        System.out.println("6. Volver");
                        System.out.print("Opcion: ");

                        int op;
                        try { op = scanner.nextInt(); scanner.nextLine(); }
                        catch (Exception e) { System.out.println("Numero invalido."); scanner.nextLine(); continue; }

                        switch (op) {
                            case 1: {
                                System.out.print("Precio: ");
                                double p;
                                try { p = scanner.nextDouble(); scanner.nextLine(); }
                                catch (Exception e) { System.out.println("Numero invalido, se usara 0."); scanner.nextLine(); p = 0.0; }
                                System.out.print("Diametro: ");
                                double d;
                                try { d = scanner.nextDouble(); scanner.nextLine(); }
                                catch (Exception e) { System.out.println("Numero invalido, se usara 0."); scanner.nextLine(); d = 0.0; }
                                System.out.println(control.crearLote(p, d));
                                break;
                            }
                            case 2: {
                                System.out.print("Nuevo precio: ");
                                double p;
                                try { p = scanner.nextDouble(); scanner.nextLine(); }
                                catch (Exception e) { System.out.println("Numero invalido."); scanner.nextLine(); break; }
                                System.out.println(control.setPrecioLote(p));
                                break;
                            }
                            case 3: {
                                System.out.print("Nuevo diametro: ");
                                double d;
                                try { d = scanner.nextDouble(); scanner.nextLine(); }
                                catch (Exception e) { System.out.println("Numero invalido."); scanner.nextLine(); break; }
                                System.out.println(control.setDiametroLote(d));
                                break;
                            }
                            case 4: System.out.println(control.verPrecioLote()); break;
                            case 5: System.out.println(control.verDiametroLote()); break;
                            case 6: salirSub = true; break;
                            default: System.out.println("Opcion invalida.");
                        }
                    }
                    break;
                }
                // lapida
                case 6: {
                    boolean salirSub = false;
                    while (!salirSub) {
                        System.out.println("1. Crear lapida");
                        System.out.println("2. Ver forma");
                        System.out.println("3. Ver materiales");
                        System.out.println("4. Volver");
                        System.out.print("Opcion: ");

                        int op;
                        try { op = scanner.nextInt(); scanner.nextLine(); }
                        catch (Exception e) { System.out.println("Numero invalido."); scanner.nextLine(); continue; }

                        switch (op) {
                            case 1: {
                                System.out.print("Forma: ");
                                String forma = scanner.nextLine();
                                System.out.print("Materiales: ");
                                String mats = scanner.nextLine();
                                System.out.println(control.crearLapida(forma, mats));
                                break;
                            }
                            case 2: System.out.println(control.verFormaLapida()); break;
                            case 3: System.out.println(control.verMaterialesLapida()); break;
                            case 4: salirSub = true; break;
                            default: System.out.println("Opcion invalida.");
                        }
                    }
                    break;
                }

                case 7:
                    System.out.println("Adios! :)");
                    salir = true;
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }
        }

        scanner.close();
    }
}
