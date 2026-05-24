import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;

        System.out.print("Ingrese un número: ");
        numero = entrada.nextInt();

        // Verificar múltiplos
        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("FizzBuzz");
        } 
        else if (numero % 3 == 0) {
            System.out.println("Fizz");
        } 
        else if (numero % 5 == 0) {
            System.out.println("Buzz");
        } 
        else {
            System.out.println("No es múltiplo de 3 ni de 5");
        }

    }
}