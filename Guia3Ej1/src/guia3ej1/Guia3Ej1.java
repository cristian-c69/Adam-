
package guia3ej1;

import java.util.Scanner;


public class Guia3Ej1 {

   
    public static void main(String[] args) {
       
        int num;
        System.out.println("Ingrese un numero: ");   
        
        Scanner leer = new Scanner(System.in);
        num=leer.nextInt();
         if (num % 2 == 0){
         System.out.println("Es par.");
         } else{
             System.out.println("Es impar.");
         }
        
        
    }
    
}
