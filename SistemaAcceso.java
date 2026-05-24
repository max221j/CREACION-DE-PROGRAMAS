import java.util.Scanner;

public class SistemaAcceso {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String usuario;
        int contraseña;

        System.out.print("Ingrese usuario: ");
        usuario = entrada.nextLine();

        System.out.print("Ingrese contraseña: ");
        contraseña = entrada.nextInt();

        // Doble validación
        if (usuario.equals("admin") && contraseña == 1234) {
            System.out.println("Acceso correcto");
        } else {
            System.out.println("Acceso denegado");
        }

    }
}