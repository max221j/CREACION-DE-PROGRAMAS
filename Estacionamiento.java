import java.util.Scanner;

public class Estacionamiento {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int tipoVehiculo;
        int horas;
        double tarifaBase = 0;
        double total;

        System.out.println("===== TARIFA DE ESTACIONAMIENTO =====");
        System.out.println("1. Moto");
        System.out.println("2. Auto");
        System.out.println("3. Camión");
        System.out.print("Seleccione el tipo de vehículo: ");

        tipoVehiculo = entrada.nextInt();

        switch (tipoVehiculo) {

            case 1:
                tarifaBase = 3.0;
                System.out.println("Vehículo: Moto");
                break;

            case 2:
                tarifaBase = 5.0;
                System.out.println("Vehículo: Auto");
                break;

            case 3:
                tarifaBase = 8.0;
                System.out.println("Vehículo: Camión");
                break;

            default:
                System.out.println("Opción inválida.");
                return;
        }

        System.out.print("Ingrese cantidad de horas: ");
        horas = entrada.nextInt();

        if (horas <= 0) {
            System.out.println("Horas inválidas.");
        } else {

            total = tarifaBase * horas;

            // Descuento si supera 5 horas
            if (horas > 5) {
                total = total * 0.90;
                System.out.println("Se aplicó 10% de descuento.");
            }

            System.out.println("Total a pagar: S/ " + total);
        }

        entrada.close();
    }
}