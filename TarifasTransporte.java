import java.util.Scanner;

public class TarifasTransporte {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double distancia;
        double tarifaBase;
        double total;

        String tipoUsuario;
        String horario;

        System.out.println("=== SISTEMA DE TARIFAS DE TRANSPORTE ===");

        System.out.print("Ingrese la distancia en km: ");
        distancia = teclado.nextDouble();

        teclado.nextLine(); // limpiar buffer

        System.out.print("Ingrese tipo de usuario (estudiante, adulto, adulto mayor): ");
        tipoUsuario = teclado.nextLine();

        System.out.print("Ingrese horario (normal o nocturno): ");
        horario = teclado.nextLine();

        // Validación
        if (distancia <= 0) {

            System.out.println("Error: Distancia inválida");

        } else {

            // Tarifa base según distancia
            if (distancia <= 5) {
                tarifaBase = 3.00;
            } else if (distancia <= 15) {
                tarifaBase = 5.00;
            } else {
                tarifaBase = 8.00;
            }

            total = tarifaBase;

            // Recargo por horario nocturno
            if (horario.equalsIgnoreCase("nocturno")) {
                total = total + 2.00;
            }

            // Descuentos según tipo de usuario
            if (tipoUsuario.equalsIgnoreCase("estudiante")) {

                total = total * 0.50;

            } else if (tipoUsuario.equalsIgnoreCase("adulto mayor")) {

                total = total * 0.70;

            } else if (tipoUsuario.equalsIgnoreCase("adulto")) {

                total = total;

            } else {

                System.out.println("Tipo de usuario inválido");
                teclado.close();
                return;
            }

            System.out.println("Tarifa final: S/ " + total);
        }

        teclado.close();
    }
}