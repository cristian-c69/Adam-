
package guia3ej2;

import java.util.Scanner;


public class Guia3Ej2 {

   
    public static void main(String[] args) {
        String frase, frasec;
        System.out.println("Ingrese una palabra: ");
        Scanner leer = new Scanner(System.in);
        frasec = "eureka";
        frase=leer.next();
        if (frase.equals(frasec)){
            System.out.println("Correcto.");
            
            }
        else{
            System.out.println("Incorrecto.");
            
        }    
                
        
    }
    
}
