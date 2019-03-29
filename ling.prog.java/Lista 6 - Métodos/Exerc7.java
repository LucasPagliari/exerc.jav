
import java.util.Scanner;


public class Exec7 {

    static void somaMatriz(double m[][]) {
        double sum = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                sum += m[i][j];
            }
        }
        System.out.println("A soma dos valores da matriz é igual a: " + sum);

    }

    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        int l, c;
        System.out.println("número de linhas: ");
        l = keyb.nextInt();
        System.out.println("digite o numero de colunas: ");
        c = keyb.nextInt();
        double matriz[][] = new double[i][j];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("m[" + i + "][" + j + "]: ");
                matriz[i][j] = keyb.nextInt();
            }
        }
        somaMatriz(matriz);
    }
}