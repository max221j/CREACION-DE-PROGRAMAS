import java.util.Scanner;

public class CategoriaEdad {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int edad;

        System.out.print("Ingrese su edad: ");
        edad = entrada.nextInt();

        // Clasificación por edad
        if (edad >= 0 && edad <= 12) {
            System.out.println("Niño");
        }

        if (edad >= 13 && edad <= 17) {
            System.out.println("Adolescente");
        }

        if (edad >= 18 && edad <= 64) {
            System.out.println("Adulto");
        }

        if (edad >= 65) {
            System.out.println("Adulto mayor");
        }

    }
}