
import java.util.Scanner;

public class Ex02 {
 
       static void imprimePosicao(double mat[][], int k, int j) {
        System.out.println("Valor da posicao [" + k + "][" + j + "] = " + mat[j][k]);
    }

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int i, j;

        System.out.println("digite o numero de linhas: ");
        i = tec.nextInt();
        System.out.println("digite o numero de colunas: ");
        j = tec.nextInt();
        double matrix[][] = new double[i][j];
        for (i = 0; i < matrix.length; i++) {
            System.out.println("Informe a " + (i + 1) + "a. linha:");
            for (j = 0; j < matrix[i].length; j++) {
                System.out.println("m[" + i + "][" + j + "] = ");
                matrix[i][j] = tec.nextInt();

            }
        }
        System.out.println("Digite a linha do indice");
        i = tec.nextInt() - 1;
        System.out.println("Digite a coluna do indice");
        j = tec.nextInt() - 1;
        try {
            imprimePosicao(matrix, i, j);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Indice fora do possivel ");
        }

    }
}