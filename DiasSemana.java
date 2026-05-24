import java.util.Scanner;

public class DiasSemana {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int dia;

        System.out.print("Ingrese un número del 1 al 7: ");
        dia = entrada.nextInt();

        switch (dia) {

            case 1:
                System.out.println("Lunes");
                System.out.println("Día laborable");
                break;

            case 2:
                System.out.println("Martes");
                System.out.println("Día laborable");
                break;

            case 3:
                System.out.println("Miércoles");
                System.out.println("Día laborable");
                break;

            case 4:
                System.out.println("Jueves");
                System.out.println("Día laborable");
                break;

            case 5:
                System.out.println("Viernes");
                System.out.println("Día laborable");
                break;

            case 6:
            case 7:
                if (dia == 6) {
                    System.out.println("Sábado");
                } else {
                    System.out.println("Domingo");
                }

                System.out.println("Fin de semana");
                break;

            default:
                System.out.println("Número inválido.");
        }

        entrada.close();
    }
}