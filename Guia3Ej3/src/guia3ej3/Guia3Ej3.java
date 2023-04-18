
package guia3ej3;

import java.util.Scanner;


public class Guia3Ej3 {

   
    public static void main(String[] args) {
       String frase;
       int frs;
     
       
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra o frase de 8 o menos caracteres: ");
        frase=leer.next();
        frs=frase.length();
                
        if (frs <= 8 ){
            System.out.println("Correcto.");
        }else {
            System.out.println("Incorrecto. ");
        }
            
        
            
        
    } 
    
    
}
