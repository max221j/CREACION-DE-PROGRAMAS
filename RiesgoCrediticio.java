import java.util.Scanner;

public class RiesgoCrediticio {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double ingreso;
        int edad;
        String historial;

        System.out.println("=== CLASIFICACIÓN DE RIESGO CREDITICIO ===");

        System.out.print("Ingrese su ingreso mensual: ");
        ingreso = teclado.nextDouble();

        teclado.nextLine(); // limpiar buffer

        System.out.print("Ingrese su historial crediticio (bueno, regular, malo): ");
        historial = teclado.nextLine();

        System.out.print("Ingrese su edad: ");
        edad = teclado.nextInt();

        // Evaluación del riesgo
        if (ingreso >= 3000) {

            if (historial.equalsIgnoreCase("bueno")) {

                if (edad >= 21 && edad <= 60) {
                    System.out.println("Resultado: Bajo riesgo");
                } else {
                    System.out.println("Resultado: Riesgo medio");
                }

            } else if (historial.equalsIgnoreCase("regular")) {
                System.out.println("Resultado: Riesgo medio");

            } else {
                System.out.println("Resultado: Alto riesgo");
            }

        } else {

            if (historial.equalsIgnoreCase("bueno")) {

                if (edad >= 25) {
                    System.out.println("Resultado: Riesgo medio");
                } else {
                    System.out.println("Resultado: Alto riesgo");
                }

            } else {
                System.out.println("Resultado: Alto riesgo");
            }
        }

        teclado.close();
    }
}