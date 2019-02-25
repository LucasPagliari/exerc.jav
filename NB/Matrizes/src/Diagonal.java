import java.util.Scanner;

class Diagonal {

    private int n;
    int[][] matriz;
    int[] diagPri;
    int[] diagSec;

    void mostraMatriz() {
        int i, j;
        System.out.println("");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
    }

    void mostraDiagPri() {
        int i;
        System.out.println("");
        for (i = 0; i < n; i++) {
            System.out.print(diagPri[i] + "\t");
        }
    }

    void mostraDiagSec() {
        int i;
        System.out.println("");
        for (i = 0; i < n; i++) {
            System.out.print(diagSec[i] + "\t");
        }
    }

    Diagonal() {
        int i, j;
        Scanner tec = new Scanner(System.in);

        System.out.println("Digite n:");
        do {
            n = tec.nextInt();
        } while (n < 2);

        matriz = new int[n][n];
        diagPri = new int[n];
        diagSec = new int[n];

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.println("Digite a posição " + (i + 1) + (j + 1) + ":");
                matriz[i][j] = tec.nextInt();
                if (i==j) diagPri[j]=matriz[i][j];
                if (i+j==n-1) diagSec[j]=matriz[i][j];
            }
        }
//        for (i = 0; i < n; i++) {
//            diagPri[i] = matriz[i][i];
//        }
//        for (i = 0; i < n; i++) {
//            diagSec[i] = matriz[n - 1 - i][i];
//        }
        //mostraMatriz();
        //mostraDiagPri();
        //mostraDiagSec();
    }
}
