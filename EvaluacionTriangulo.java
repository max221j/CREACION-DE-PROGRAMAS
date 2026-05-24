import java.util.Scanner;

public class EvaluacionTriangulo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double lado1, lado2, lado3;

        System.out.print("Ingrese lado 1: ");
        lado1 = entrada.nextDouble();

        System.out.print("Ingrese lado 2: ");
        lado2 = entrada.nextDouble();

        System.out.print("Ingrese lado 3: ");
        lado3 = entrada.nextDouble();

        // Verificar si forman triángulo
        if ((lado1 + lado2 > lado3) &&
            (lado1 + lado3 > lado2) &&
            (lado2 + lado3 > lado1)) {

            System.out.println("Sí forman un triángulo");

            // Clasificación
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triángulo equilátero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triángulo isósceles");
            } else {
                System.out.println("Triángulo escaleno");
            }

        } else {
            System.out.println("No forman un triángulo");
        }

    }
}