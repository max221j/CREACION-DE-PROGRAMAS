import java.util.Scanner;

public class MesesDelAnio {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int mes;

        System.out.print("Ingrese un número del 1 al 12: ");
        mes = entrada.nextInt();

        switch (mes) {

            case 1:
                System.out.println("Mes: Enero");
                System.out.println("Días: 31");
                break;

            case 2:
                System.out.println("Mes: Febrero");
                System.out.println("Días: 28");
                break;

            case 3:
                System.out.println("Mes: Marzo");
                System.out.println("Días: 31");
                break;

            case 4:
                System.out.println("Mes: Abril");
                System.out.println("Días: 30");
                break;

            case 5:
                System.out.println("Mes: Mayo");
                System.out.println("Días: 31");
                break;

            case 6:
                System.out.println("Mes: Junio");
                System.out.println("Días: 30");
                break;

            case 7:
                System.out.println("Mes: Julio");
                System.out.println("Días: 31");
                break;

            case 8:
                System.out.println("Mes: Agosto");
                System.out.println("Días: 31");
                break;

            case 9:
                System.out.println("Mes: Septiembre");
                System.out.println("Días: 30");
                break;

            case 10:
                System.out.println("Mes: Octubre");
                System.out.println("Días: 31");
                break;

            case 11:
                System.out.println("Mes: Noviembre");
                System.out.println("Días: 30");
                break;

            case 12:
                System.out.println("Mes: Diciembre");
                System.out.println("Días: 31");
                break;

            default:
                System.out.println("Número inválido.");
        }

        entrada.close();
    }
}