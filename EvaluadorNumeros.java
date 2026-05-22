import java.util.Scanner;

public class EvaluadorNumeros {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero;

        System.out.println("=== EVALUADOR DE NÚMEROS ===");

        System.out.print("Ingrese un número: ");
        numero = teclado.nextInt();

        // Positivo, negativo o cero
        if (numero > 0) {

            System.out.println("El número es positivo");

        } else if (numero < 0) {

            System.out.println("El número es negativo");

        } else {

            System.out.println("El número es cero");
        }

        // Par o impar
        if (numero % 2 == 0) {

            System.out.println("El número es par");

        } else {

            System.out.println("El número es impar");
        }

        // Múltiplos
        if (numero % 3 == 0 && numero % 5 == 0) {

            System.out.println("Es múltiplo de 3 y 5");

        } else if (numero % 3 == 0) {

            System.out.println("Es múltiplo de 3");

        } else if (numero % 5 == 0) {

            System.out.println("Es múltiplo de 5");

        } else {

            System.out.println("No es múltiplo de 3 ni de 5");
        }

        teclado.close();
    }
}