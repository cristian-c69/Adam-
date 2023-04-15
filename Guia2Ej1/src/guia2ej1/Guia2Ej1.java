
package guia2ej1;

import java.util.Scanner;


public class Guia2Ej1 {

   
    public static void main(String[] args) {
       
        int num1, num2, resultado;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros: ");
        
        num1=leer.nextInt();
        num2=leer.nextInt();
        
        resultado=num1+num2;
        System.out.println("El resultado es : " + resultado);
        
        
    }
    
}
