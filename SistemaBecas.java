import java.util.Scanner;

public class SistemaBecas {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double promedio;
        double ingresos;
        int cursosDesaprobados;

        System.out.println("=== SISTEMA DE BECAS UNIVERSITARIAS ===");

        System.out.print("Ingrese su promedio: ");
        promedio = teclado.nextDouble();

        System.out.print("Ingrese los ingresos familiares: ");
        ingresos = teclado.nextDouble();

        System.out.print("Ingrese cantidad de cursos desaprobados: ");
        cursosDesaprobados = teclado.nextInt();

        // Evaluación de beca
        if (promedio >= 16 && ingresos <= 1500) {

            if (cursosDesaprobados == 0) {
                System.out.println("Resultado: Beca completa");
            } else if (cursosDesaprobados <= 2) {
                System.out.println("Resultado: Beca parcial");
            } else {
                System.out.println("Resultado: No recibe beca");
            }

        } else if (promedio >= 18 || ingresos <= 1000) {

            if (cursosDesaprobados <= 1) {
                System.out.println("Resultado: Beca parcial");
            } else {
                System.out.println("Resultado: No recibe beca");
            }

        } else {
            System.out.println("Resultado: No recibe beca");
        }

        teclado.close();
    }
}