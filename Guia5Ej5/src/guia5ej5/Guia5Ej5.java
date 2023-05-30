package guia5ej5;

public class Guia5Ej5 {

    public static void main(String[] args) {
        int matriz[][] = new int[4][4];
        int matrizA[][] = new int[4][4];

        for (int i = 0; i < 4; i++) { /// Declaro la matriz original y la llenamos con numeros random.

            for (int j = 0; j < 4; j++) {
                matrizA[i][j] = (int) (Math.random() * 100);
                System.out.print("[" + matrizA[i][j] + "]");

            }
            System.out.println(" ");

        }
        System.out.println("Matriz A");
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j]=matrizA[j][i];
                System.out.print("[" + matriz[i][j] + "]");
            }System.out.println(" ");
            
        }
        
        
            
        }

    }
}


