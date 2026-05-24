import java.util.Scanner;

public class AñoBisiesto {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int año;

        System.out.print("Ingrese un año: ");
        año = entrada.nextInt();

        // Verificar año bisiesto
        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            System.out.println("El año es bisiesto");
        } else {
            System.out.println("El año no es bisiesto");
        }

    }
}