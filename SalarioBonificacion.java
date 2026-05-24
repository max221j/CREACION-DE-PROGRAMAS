import java.util.Scanner;

public class SalarioBonificacion {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double salario;
        int años;

        System.out.print("Ingrese salario: ");
        salario = entrada.nextDouble();

        System.out.print("Ingrese años de trabajo: ");
        años = entrada.nextInt();

        // Evaluar bonificación
        if (años > 5 && salario < 2000) {
            System.out.println("Tiene bono completo");
        } 
        else if (años > 5 || salario < 2000) {
            System.out.println("Tiene bono menor");
        } 
        else {
            System.out.println("No tiene bono");
        }

    }
}