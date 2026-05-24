import java.util.Scanner;

public class Restaurante {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int opcion, submenu;

        System.out.println("===== MENÚ DEL RESTAURANTE =====");
        System.out.println("1. Desayuno");
        System.out.println("2. Almuerzo");
        System.out.println("3. Cena");
        System.out.print("Seleccione una opción: ");

        opcion = entrada.nextInt();

        switch (opcion) {

            case 1:
                System.out.println("\n--- DESAYUNO ---");
                System.out.println("1. Ver platos");
                System.out.println("2. Ver precios");
                System.out.print("Seleccione una opción: ");

                submenu = entrada.nextInt();

                switch (submenu) {
                    case 1:
                        System.out.println("Platos:");
                        System.out.println("- Pan con huevo");
                        System.out.println("- Café");
                        System.out.println("- Jugo natural");
                        break;

                    case 2:
                        System.out.println("Precios:");
                        System.out.println("Pan con huevo: S/ 5");
                        System.out.println("Café: S/ 3");
                        System.out.println("Jugo natural: S/ 4");
                        break;

                    default:
                        System.out.println("Opción inválida.");
                }
                break;

            case 2:
                System.out.println("\n--- ALMUERZO ---");
                System.out.println("1. Ver platos");
                System.out.println("2. Ver precios");
                System.out.print("Seleccione una opción: ");

                submenu = entrada.nextInt();

                switch (submenu) {
                    case 1:
                        System.out.println("Platos:");
                        System.out.println("- Arroz con pollo");
                        System.out.println("- Lomo saltado");
                        System.out.println("- Sopa");
                        break;

                    case 2:
                        System.out.println("Precios:");
                        System.out.println("Arroz con pollo: S/ 15");
                        System.out.println("Lomo saltado: S/ 18");
                        System.out.println("Sopa: S/ 10");
                        break;

                    default:
                        System.out.println("Opción inválida.");
                }
                break;

            case 3:
                System.out.println("\n--- CENA ---");
                System.out.println("1. Ver platos");
                System.out.println("2. Ver precios");
                System.out.print("Seleccione una opción: ");

                submenu = entrada.nextInt();

                switch (submenu) {
                    case 1:
                        System.out.println("Platos:");
                        System.out.println("- Pizza");
                        System.out.println("- Hamburguesa");
                        System.out.println("- Ensalada");
                        break;

                    case 2:
                        System.out.println("Precios:");
                        System.out.println("Pizza: S/ 20");
                        System.out.println("Hamburguesa: S/ 14");
                        System.out.println("Ensalada: S/ 12");
                        break;

                    default:
                        System.out.println("Opción inválida.");
                }
                break;

            default:
                System.out.println("Opción inválida.");
        }

        entrada.close();
    }
}