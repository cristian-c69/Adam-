package guia4ej2;

import java.util.Scanner;

public class Guia4Ej2 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        
        
        String opcion;
        
        do {
            System.out.println("Ingrese nombre: ");
        String nomb = leer.next();
        System.out.println("Ingresar la edad: ");
        int edad = leer.nextInt();
        
        if (edad<18){
            System.out.println("Es menor de edad.");
        }else {
            System.out.println("Es mayor de edad.");
        
    
    }
        
        
            System.out.println("Desea Continuar? ");
            System.out.println("-Si ");
            System.out.println("-No ");
            opcion=leer.next();
        }while (opcion.equalsIgnoreCase("si"));
        
        

  
    
    }
}