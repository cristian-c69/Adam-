
package guia3ej4;

import java.util.Scanner;


public class Guia3Ej4 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra o frase que empiece con A ");
        String plbr;
        plbr=leer.next();
        
        if ("A".equals(plbr.substring(0, 1)) ){
            System.out.println("Correcto");
            
        }else {
            System.out.println("Incorrecto.");
        }
        
        
    }
    
}
