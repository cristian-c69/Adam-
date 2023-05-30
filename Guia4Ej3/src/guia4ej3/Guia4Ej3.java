10
package guia4ej3;

import java.util.Scanner;


public class Guia4Ej3 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de Euros: ");
        
        int euros=leer.nextInt();
        String libras ="Libras";       
        cambiolibras(euros,libras);
        String pesos = "Pesos";       
        cambiopesos(euros,pesos);
        String yenes = "Yenes";       
        cambioyenes(euros,yenes);
                
    }
    public static void cambiolibras (int euros, String libras){
        
        double lbra= (euros * 0.86);
        System.out.println("El cambio a " + libras + " es: " + lbra );
    }
    public static void cambiopesos (int euros, String pesos){
        
        double peso= (euros * 1.28611);
        System.out.println("El cambio a " + pesos + " es: " + peso );
    }
    public static void cambioyenes (int euros, String yenes){
        
        double yen= (euros * 192.852);
        System.out.println("El cambio a " + yenes + " es: " + yen );
    }
    
}
