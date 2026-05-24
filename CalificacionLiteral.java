import java.util.Scanner;

public class CalificacionLiteral {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese una calificación (A, B, C, D, F): ");

        char letra = entrada.next().toUpperCase().charAt(0);

        switch (letra) {

            case 'A':
                System.out.println("Excelente");
                break;

            case 'B':
                System.out.println("Bueno");
                break;

            case 'C':
                System.out.println("Regular");
                break;

            case 'D':
                System.out.println("Deficiente");
                break;

            case 'F':
                System.out.println("Reprobado");
                break;

            default:
                System.out.println("Calificación inválida.");
        }

        entrada.close();
    }
}