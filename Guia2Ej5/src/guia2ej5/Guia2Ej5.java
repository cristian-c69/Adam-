
package guia2ej5;

import java.util.Scanner;


public class Guia2Ej5 {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int num1;
        System.out.println("Ingrese un numero: ");
        num1=leer.nextInt();
        System.out.println("El doble: " + num1*2);
        System.out.println("El triple: "+num1*3);
        System.out.println("Raiz cuadrada: " + Math.sqrt(num1));
        
       
    }
    
}
