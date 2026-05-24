import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double saldo = 1000; // saldo inicial
        int opcion;

        do {
            System.out.println("\n===== MENÚ BANCARIO =====");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");

            opcion = entrada.nextInt();

            switch (opcion) {

                case 1:
                    System.out.print("Ingrese monto a depositar: ");
                    double deposito = entrada.nextDouble();

                    if (deposito <= 0) {
                        System.out.println("Monto inválido.");
                    } else {
                        saldo += deposito;
                        System.out.println("Depósito realizado.");
                        System.out.println("Nuevo saldo: S/ " + saldo);
                    }
                    break;

                case 2:
                    System.out.print("Ingrese monto a retirar: ");
                    double retiro = entrada.nextDouble();

                    if (retiro <= 0) {
                        System.out.println("Monto inválido.");
                    } else if (retiro > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo -= retiro;
                        System.out.println("Retiro realizado.");
                        System.out.println("Nuevo saldo: S/ " + saldo);
                    }
                    break;

                case 3:
                    System.out.println("Saldo actual: S/ " + saldo);
                    break;

                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 4);

        entrada.close();
    }
}