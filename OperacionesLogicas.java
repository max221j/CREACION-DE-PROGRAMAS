import java.util.Scanner;

public class OperacionesLogicas {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String operador;
        boolean valor1, valor2, resultado;

        System.out.println("===== OPERACIONES LÓGICAS =====");
        System.out.print("Ingrese operador (AND, OR, XOR): ");
        operador = entrada.next().toUpperCase();

        System.out.print("Ingrese primer valor (true/false): ");
        valor1 = entrada.nextBoolean();

        System.out.print("Ingrese segundo valor (true/false): ");
        valor2 = entrada.nextBoolean();

        switch (operador) {

            case "AND":
                resultado = valor1 && valor2;
                System.out.println("Resultado: " + resultado);
                break;

            case "OR":
                resultado = valor1 || valor2;
                System.out.println("Resultado: " + resultado);
                break;

            case "XOR":
                resultado = valor1 ^ valor2;
                System.out.println("Resultado: " + resultado);
                break;

            default:
                System.out.println("Operador inválido.");
        }

        entrada.close();
    }
}