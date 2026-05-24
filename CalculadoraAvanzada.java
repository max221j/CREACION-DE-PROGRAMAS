import java.util.Scanner;

public class CalculadoraAvanzada {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int opcion;
        double num1, num2, resultado;

        System.out.println("===== CALCULADORA AVANZADA =====");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Potencia");
        System.out.print("Seleccione una opción: ");

        // Validar entrada de opción
        if (!entrada.hasNextInt()) {
            System.out.println("Entrada inválida.");
            return;
        }

        opcion = entrada.nextInt();

        System.out.print("Ingrese el primer número: ");

        if (!entrada.hasNextDouble()) {
            System.out.println("Entrada inválida.");
            return;
        }

        num1 = entrada.nextDouble();

        System.out.print("Ingrese el segundo número: ");

        if (!entrada.hasNextDouble()) {
            System.out.println("Entrada inválida.");
            return;
        }

        num2 = entrada.nextDouble();

        switch (opcion) {

            case 1:
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;

            case 2:
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;

            case 3:
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;

            case 4:
                if (num2 == 0) {
                    System.out.println("Error: no se puede dividir entre cero.");
                } else {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                }
                break;

            case 5:
                resultado = Math.pow(num1, num2);
                System.out.println("Resultado: " + resultado);
                break;

            default:
                System.out.println("Opción inválida.");
        }

        entrada.close();
    }
}