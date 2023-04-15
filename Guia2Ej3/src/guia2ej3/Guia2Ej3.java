
package guia2ej3;

import java.io.PrintStream;
import java.util.Scanner;


public class Guia2Ej3 {

    
    public static void main(String[] args) {
        
        String frase;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("ingrese una frase: ");
        frase=leer.next();
        System.out.println(" En Mayuscula : ");
        System.out.println(frase.toUpperCase());
        System.out.println("En Minuscula: ");
        System.out.println(frase.toLowerCase());
        
                
        
        
        
    }
    
}
