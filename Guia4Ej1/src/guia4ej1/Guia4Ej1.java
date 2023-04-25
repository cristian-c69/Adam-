
package guia4ej1;

import java.util.Scanner;


public class Guia4Ej1 {

 
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros: ");
        int opcion;
        int num1=leer.nextInt();
        int num2=leer.nextInt();
        
        System.out.println("Eliija que operacion desea hacer: ");
        System.out.println("-1: Sumar.");
        System.out.println("-2: Restar.");
        System.out.println("-3: Multiplicar.");
        System.out.println("-4: Dividir.");
        
        opcion=leer.nextInt();
        
        switch (opcion){
            case 1:
               int retorno = sumar(num1,num2);
                System.out.println("La suma es: " + retorno);
                break;
                
            case 2:
                int retorno1 = restar (num1,num2);
                System.out.println("La Resta es: " + retorno1);
                break;
                
            case 3:
                int retorno2 = multix(num1,num2);
                System.out.println("La Multiplicacion es: " + retorno2);
                break;
                
            case 4:
                int retorno3 = dividir(num1,num2);
                System.out.println("La Divicion es: " + retorno3);
                break;
            default:
                System.out.println("Elija una opcion correcta.");
        }
        
                
    }
    
    public static int  sumar (int num1, int num2) {
        
       int suma;
       suma = num1 + num2 ;
       return suma;
                
    }
    
    public static int  restar (int num1, int num2) {
        
       int resta;
       resta = num1 - num2 ;
       return resta;
                
    }
    
    public static int  multix (int num1, int num2) {
        
       int multi;
       multi = num1 * num2 ;
       return multi;
                
    }
    
    public static int  dividir (int num1, int num2) {
        
       int divi;
       divi = num1 / num2 ;
       return divi;
                
    }
}
