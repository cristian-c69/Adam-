/*
 *Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y 
 *le pida al usuario un número a buscar en el vector. El programa mostrará dónde 
 *se encuentra el numero y si se encuentra repetido
 */
package guia5ej2;

import java.util.Scanner;

public class Guia5Ej2 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int[] vector = new int[50];
        int repetidos = 1;

        System.out.println("Ingrese un Numero: ");
        int num = leer.nextInt();
        int v = 0;

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10);
            v = vector[i];
            if (v == num){
            repetidos++;
            }

            System.out.println(vector[i]);
        }

        System.out.println("El numero se repite " + repetidos + " veces. ");

    }

}
