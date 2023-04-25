
package guia3ejex3;

import java.util.Scanner;


public class Guia3EjEx3 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); //Ponemos el codigo de lectura de entrada.
        
        System.out.println("Ingrese una letra: ");
        
        char letra;
        letra=leer.next().charAt(0);
        
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ){
            
            System.out.println("La letra ingresada es una vocal.");
            
        }else {
            System.out.println("La letra no es vocal.");
        }
        
        
        
        
    }
    
}
