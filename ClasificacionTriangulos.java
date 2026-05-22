import java.util.Scanner;

public class ClasificacionTriangulos {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double lado1, lado2, lado3;

        System.out.println("=== CLASIFICACIÓN DE TRIÁNGULOS ===");

        System.out.print("Ingrese el primer lado: ");
        lado1 = teclado.nextDouble();

        System.out.print("Ingrese el segundo lado: ");
        lado2 = teclado.nextDouble();

        System.out.print("Ingrese el tercer lado: ");
        lado3 = teclado.nextDouble();

        // Validar si los lados son positivos
        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {

            System.out.println("Triángulo inválido");

        } else {

            // Validar si puede formar un triángulo
            if ((lado1 + lado2 > lado3) &&
                (lado1 + lado3 > lado2) &&
                (lado2 + lado3 > lado1)) {

                // Clasificación
                if (lado1 == lado2 && lado2 == lado3) {

                    System.out.println("Triángulo Equilátero");

                } else if (lado1 == lado2 ||
                           lado1 == lado3 ||
                           lado2 == lado3) {

                    System.out.println("Triángulo Isósceles");

                } else {

                    System.out.println("Triángulo Escaleno");
                }

            } else {

                System.out.println("Triángulo inválido");
            }
        }

        teclado.close();
    }
}