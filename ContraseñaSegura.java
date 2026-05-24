import java.util.Scanner;

public class ContraseñaSegura {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int contraseña;

        System.out.print("Ingrese una contraseña numérica: ");
        contraseña = entrada.nextInt();

        // Validar contraseña
        if (contraseña > 1000 && contraseña < 9999) {
            System.out.println("Contraseña válida");
        } else {
            System.out.println("Contraseña inválida");
        }

    }
}