
package guia3ej8;

import java.util.Scanner;


public class Guia3Ej8 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del cuadrado: ");
        
        int n=leer.nextInt();
       if (n>0){
         for (int i=0; i < n; i++){             
             System.out.print("*");
         }
          System.out.println();  
          
          for (int i=0; i < n-2 ; i++){             
             System.out.print("*");
             for (int j=0; j < n-2; j++){
                 System.out.print(" ");
             }
              System.out.println("*");              
         }
          
         for (int i=0; i < n; i++){             
             System.out.print("*");
         }
       }    
        System.out.println("");
        
}
    
}