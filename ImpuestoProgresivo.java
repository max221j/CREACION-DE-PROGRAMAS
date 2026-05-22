import java.util.Scanner;

public class ImpuestoProgresivo {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double ingreso;
        double impuesto;

        System.out.println("=== CÁLCULO DE IMPUESTO PROGRESIVO ===");

        System.out.print("Ingrese su ingreso: ");
        ingreso = teclado.nextDouble();

        // Validación
        if (ingreso < 0) {

            System.out.println("Error: El ingreso no puede ser negativo");

        } else {

            // Cálculo de impuesto por rangos
            if (ingreso >= 0 && ingreso <= 1000) {

                impuesto = ingreso * 0.05;

                System.out.println("Impuesto a pagar: S/ " + impuesto);
                System.out.println("Se aplicó el 5% de impuesto");

            } else if (ingreso >= 1001 && ingreso <= 5000) {

                impuesto = ingreso * 0.10;

                System.out.println("Impuesto a pagar: S/ " + impuesto);
                System.out.println("Se aplicó el 10% de impuesto");

            } else {

                impuesto = ingreso * 0.20;

                System.out.println("Impuesto a pagar: S/ " + impuesto);
                System.out.println("Se aplicó el 20% de impuesto");
            }
        }

        teclado.close();
    }
}