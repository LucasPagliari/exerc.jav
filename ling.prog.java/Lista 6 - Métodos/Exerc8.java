

import java.util.Scanner;


public class Exerc8 {

    static void somaDiagonal(double m[][]) {
        int sumdig = 0, sumli = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (i == j) {
					sumdig += m[i][j];
				}
				sumli += m[i][j];
                
			}
            System.out.println("Soma linha " + i + " : " + sumli);
            sumli = 0;
        }
        System.out.println("Soma Diagonal Principal " + i + " : " + sumdig);
    }

    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        System.out.println("Tamanho da m: ");
        x = keyb.nextInt();

        double m[][] = new double[x][x];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.println("m[" + i + "][" + j + "] : ");
                m[i][j] = keyb.nextInt();

            }
        }
        somaDiagonalLinha(m);
    }
}
