
package guia3ej5;

import java.util.Scanner;


public class Guia3Ej5 {

   
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor Limite positivo: ");
        int numL=leer.nextInt();
               
        int result=0 ;
        
        while (result < numL){
            System.out.println("Ingrese otro numero : ");
            
            result += leer.nextInt();
            
        }
                 
        System.out.println("Llegaste al limite. la suma es: " + result);
    }
    
}
