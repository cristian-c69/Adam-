
package guia3ej6;

import java.util.Scanner;


public class Guia3Ej6 {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros: ");
        
        int num1 =leer.nextInt();
        int num2=leer.nextInt();
        
        System.out.println("Elija una opcion: ");
        System.out.println("MENU:");
        System.out.println("1-Sumar.");
        System.out.println("2-Restar.");
        System.out.println("3-Multiplicar.");
        System.out.println("4-Dividir.");
        System.out.println("5-Salir.");
        int opcion=leer.nextInt();
        switch (opcion){
            case 1: 
            int resultado= num1+num2;
                System.out.println("El resultado es: "+ resultado);
                break;
            case 2: 
            int resultado2= num1-num2;
                System.out.println("El resultado es: "+ resultado2);
                break;
            case 3: 
            int resultado3= num1*num2;
                System.out.println("El resultado es: "+ resultado3);
                break;
            case 4: 
            int resultado4= num1/num2;
                System.out.println("El resultado es: "+ resultado4);
                break;    
            case 5:
                
                
                String respuesta;
                
                do {
                    System.out.println("Seguro que quiere salir? "+ "s/n");
                    respuesta=leer.next();
                } while (respuesta.equalsIgnoreCase("s"));
                
                break;
                
                    
                
               
                
              
                  
                }
                
                
                
                
        }
        
    }
    
}
