package guia5ej3;

import java.util.Scanner;

public class Guia5Ej3 {

    public static void main(String[] args) {

        int n;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector: ");

        n = leer.nextInt();
/// creamos el vector con tamaño N

        int vector[] = new int[n];
        int dig1=0;
        int dig2 = 0;
        int dig3=0;
        int dig4=0;
        int dig5=0;

        for (int i = 0; i < vector.length; i++) {    ///Llenamos el vector con numeros random.
            vector[i] = (int) (Math.random() * n) + 1;
           if (i> 0 && i<10 ){
               dig1++;
           }else if(i>10 && i<100){
               dig2++;
           }else if(i>100 && i<1000){
               dig3++;
           }else if(i>1000 && i<10000){
               dig4++;
           }else if(i>10000 && i<100000){
               dig5++;
           }          

        }/// imprimimos la cantidad de digitos.
        
         System.out.println("numeros de 1 digito : " + dig1);
            System.out.println("numeros de 2 digitos : " + dig2);
            System.out.println("numeros de 3 digitos : " + dig3);
            System.out.println("numeros de 4 digitos : " + dig4);
            System.out.println("numeros de 5 digitos : " + dig5);
    }

}
    


