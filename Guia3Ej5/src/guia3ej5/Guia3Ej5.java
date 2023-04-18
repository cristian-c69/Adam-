
package guia3ej5;

import java.util.Scanner;


public class Guia3Ej5 {

   
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor Limite positivo: ");
        int numL=leer.nextInt();
        System.out.println("Ingrese 2 numeros mas : ");
        int num1 =leer.nextInt();
        int num2 =leer.nextInt();
        int result= num1 + num2;
        
        while (result < numL){
            System.out.println("Ingrese otro numero : ");
            int numV=leer.nextInt();
            result= numV+result;
            
        }
                 
        System.out.println("Llegaste al limite.");
    }
    
}
