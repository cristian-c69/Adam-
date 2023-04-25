
/*Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una.
A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C tome el valor de A,
A tome el valor de D y D tome el valor de B. Mostrar los valores iniciales y los valores finales de cada variable.
Utilizar sólo una variable auxiliar.*/

package guia3ejex2;


public class Guia3EjEx2 {

    
    public static void main(String[] args) {
        int a=5,b=10,c=15,d=20;
        System.out.println("Los valores iniciales son : -A= " + a  + " -B= " + b + " -C= " + c + " -D= " + d );
        
        int aux=b;
        b=c;
        c=a;
        a=d;
        d=aux;
        System.out.println("Los valores ahora son : -A= " + a  + " -B= " + b + " -C= " + c + " -D= " + d );
        
    }
    
}
