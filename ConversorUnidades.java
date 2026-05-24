import java.util.Scanner;

public class ConversorUnidades {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int opcion;
        double valor, resultado;

        System.out.println("===== CONVERSOR DE UNIDADES =====");
        System.out.println("1. Metros a Kilómetros");
        System.out.println("2. Kilómetros a Metros");
        System.out.println("3. Celsius a Fahrenheit");
        System.out.println("4. Fahrenheit a Celsius");
        System.out.print("Elige una opción: ");

        opcion = entrada.nextInt();

        switch (opcion) {

            case 1:
                System.out.print("Ingrese metros: ");
                valor = entrada.nextDouble();

                resultado = valor / 1000;
                System.out.println(valor + " metros = " + resultado + " kilómetros");
                break;

            case 2:
                System.out.print("Ingrese kilómetros: ");
                valor = entrada.nextDouble();

                resultado = valor * 1000;
                System.out.println(valor + " kilómetros = " + resultado + " metros");
                break;

            case 3:
                System.out.print("Ingrese grados Celsius: ");
                valor = entrada.nextDouble();

                resultado = (valor * 9 / 5) + 32;
                System.out.println(valor + " °C = " + resultado + " °F");
                break;

            case 4:
                System.out.print("Ingrese grados Fahrenheit: ");
                valor = entrada.nextDouble();

                resultado = (valor - 32) * 5 / 9;
                System.out.println(valor + " °F = " + resultado + " °C");
                break;

            default:
                System.out.println("Opción inválida.");
        }

        entrada.close();
    }
}