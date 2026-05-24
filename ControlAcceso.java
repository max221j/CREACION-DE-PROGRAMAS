import java.util.Scanner;

public class ControlAcceso {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String usuario;

        System.out.println("===== CONTROL DE ACCESO =====");
        System.out.print("Ingrese tipo de usuario (ADMIN, USER, GUEST): ");

        usuario = entrada.next().toUpperCase();

        switch (usuario) {

            case "ADMIN":
                System.out.println("Permiso: Acceso total");
                break;

            case "USER":
                System.out.println("Permiso: Acceso parcial");
                break;

            case "GUEST":
                System.out.println("Permiso: Solo lectura");
                break;

            default:
                System.out.println("Tipo de usuario inválido.");
        }

        entrada.close();
    }
}