package guia4ej4;

import java.util.Scanner;

public class Guia4Ej4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un Numero: ");

        int num = leer.nextInt();
        if (esPrimo(num)) {
            System.out.println("El numero " + num + " es primo.");

        } else {
            System.out.println("El numero " + num + " no es primo.");
        }

    }

    public static boolean esPrimo(int num) {
        if (num > 0) {

            for (int x = 1; x <= num; x++) {
                if (num % x == 0);
            }

            return false;

        }
        return true;

    }
}
