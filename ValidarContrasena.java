import java.util.Scanner;

public class ValidarContrasena {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String contraseña;

        boolean tieneMayuscula = false;
        boolean tieneNumero = false;
        boolean tieneSimbolo = false;

        System.out.println("=== VALIDACIÓN DE CONTRASEÑA SEGURA ===");

        System.out.print("Ingrese una contraseña: ");
        contraseña = teclado.nextLine();

        // Verificar longitud
        if (contraseña.length() < 8) {
            System.out.println("Falta: mínimo 8 caracteres");
        }

        // Recorrer caracteres
        for (int i = 0; i < contraseña.length(); i++) {

            char c = contraseña.charAt(i);

            // Verificar mayúscula
            if (Character.isUpperCase(c)) {
                tieneMayuscula = true;
            }

            // Verificar número
            if (Character.isDigit(c)) {
                tieneNumero = true;
            }

            // Verificar símbolo
            if (!Character.isLetterOrDigit(c)) {
                tieneSimbolo = true;
            }
        }

        // Mostrar mensajes
        if (!tieneMayuscula) {
            System.out.println("Falta: una letra mayúscula");
        }

        if (!tieneNumero) {
            System.out.println("Falta: un número");
        }

        if (!tieneSimbolo) {
            System.out.println("Falta: un símbolo");
        }

        // Contraseña válida
        if (contraseña.length() >= 8 &&
            tieneMayuscula &&
            tieneNumero &&
            tieneSimbolo) {

            System.out.println("Contraseña segura");
        }

        teclado.close();
    }
}