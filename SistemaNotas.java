import java.util.Scanner;

public class SistemaNotas {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double nota1, nota2, nota3, promedio;

        System.out.print("Ingrese nota 1: ");
        nota1 = entrada.nextDouble();

        System.out.print("Ingrese nota 2: ");
        nota2 = entrada.nextDouble();

        System.out.print("Ingrese nota 3: ");
        nota3 = entrada.nextDouble();

        // Calcular promedio
        promedio = (nota1 + nota2 + nota3) / 3;

        System.out.println("Promedio: " + promedio);

        // Evaluar estado
        if (promedio >= 11) {
            System.out.println("Aprobado");
        } 
        else if (promedio < 11 && promedio > 8) {
            System.out.println("Recuperación");
        } 
        else {
            System.out.println("Desaprobado");
        }

    }
}