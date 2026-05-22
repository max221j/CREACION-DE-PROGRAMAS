import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int pinCorrecto = 1234;
        int pinIngresado;
        int intentos = 0;

        double saldo = 2500;
        double limiteDiario = 1000;

        System.out.println("=== CAJERO AUTOMÁTICO ===");

        // Validación de PIN
        while (intentos < 3) {

            System.out.print("Ingrese su PIN: ");
            pinIngresado = teclado.nextInt();

            if (pinIngresado == pinCorrecto) {

                System.out.println("PIN correcto");
                System.out.println("1. Ver saldo");
                System.out.println("2. Retirar dinero");

                System.out.print("Seleccione una opción: ");
                int opcion = teclado.nextInt();

                if (opcion == 1) {

                    System.out.println("Su saldo actual es: S/ " + saldo);

                } else if (opcion == 2) {

                    System.out.print("Ingrese monto a retirar: ");
                    double retiro = teclado.nextDouble();

                    // Verificar límite diario
                    if (retiro > limiteDiario) {

                        System.out.println("Error: Supera el límite diario");

                    } else {

                        // Verificar fondos
                        if (retiro > saldo) {

                            System.out.println("Error: Fondos insuficientes");

                        } else {

                            saldo = saldo - retiro;

                            System.out.println("Retiro exitoso");
                            System.out.println("Saldo restante: S/ " + saldo);
                        }
                    }

                } else {

                    System.out.println("Opción no válida");
                }

                break;

            } else {

                intentos++;

                System.out.println("PIN incorrecto");

                if (intentos == 3) {
                    System.out.println("Cuenta bloqueada por demasiados intentos");
                }
            }
        }

        teclado.close();
    }
}