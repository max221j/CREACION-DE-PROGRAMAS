import java.util.Scanner;

public class RendimientoLaboral {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int puntualidad;
        int productividad;
        int cumplimiento;
        double promedio;

        System.out.println("=== EVALUACIÓN DE RENDIMIENTO LABORAL ===");

        System.out.print("Ingrese puntaje de puntualidad (0-20): ");
        puntualidad = teclado.nextInt();

        System.out.print("Ingrese puntaje de productividad (0-20): ");
        productividad = teclado.nextInt();

        System.out.print("Ingrese puntaje de cumplimiento (0-20): ");
        cumplimiento = teclado.nextInt();

        // Validación
        if (puntualidad < 0 || puntualidad > 20 ||
            productividad < 0 || productividad > 20 ||
            cumplimiento < 0 || cumplimiento > 20) {

            System.out.println("Error: Los puntajes deben estar entre 0 y 20");

        } else {

            // Calcular promedio
            promedio = (puntualidad + productividad + cumplimiento) / 3.0;

            // Clasificación
            if (promedio >= 18) {

                System.out.println("Clasificación: Excelente");

            } else if (promedio >= 14) {

                System.out.println("Clasificación: Bueno");

            } else if (promedio >= 11) {

                System.out.println("Clasificación: Regular");

            } else {

                System.out.println("Clasificación: Deficiente");
            }
        }

        teclado.close();
    }
}