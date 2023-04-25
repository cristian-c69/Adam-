
package guia3ejex1;

import java.util.Scanner;


public class Guia3EjEx1 {


    
    public static void main(String[] args) {
   
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tiempo en minutos: "); 
        int min=leer.nextInt();
        int dias= min/1440; 
        int horas=(min%1440)/60;
        
        System.out.println(min + " minutos, equivalen a " + dias + " dias " + horas + " horas. ");
       
            
            }
            
        }
        
    
    

