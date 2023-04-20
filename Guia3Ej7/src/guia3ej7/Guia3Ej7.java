
package guia3ej7;

import java.util.Scanner;


public class Guia3Ej7 {

    
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        String cadena;
        int correctas=0, incorrectas=0, aux=0;
        System.out.println("Ingrese una palabra de hasta 5 caracteres.");
        System.out.println("El primer caracter tiene que ser X y el ultimo O.");
        cadena=leer.next();
        while (!cadena.equals("&&&&&")){
            int longitud = (cadena.length());
            if (cadena.substring(0,1).equalsIgnoreCase("x") && (cadena.endsWith("o"))&& longitud==5 ){
                correctas++;
            }else {
                incorrectas++;
            }            
            System.out.println("Ingrese una palabra de hasta 5 caracteres.");
        System.out.println("El primer caracter tiene que ser X y el ultimo O.");
        cadena=leer.next();
        
            
        }
        System.out.println("cadenas correctas "+correctas );
        System.out.println("cadenas incorrectas" + incorrectas);
    }
    
}
