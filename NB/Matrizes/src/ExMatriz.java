
import java.util.Scanner;

class ExMatriz {

    ExMatriz() {
        int i, j;
        double total;
        Scanner tec = new Scanner(System.in);
        double m[][] = new double[4][5];

        for (i = 0; i < 4; i++) {
            total = 0;
            System.out.println("Departamento " + (i + 1) + " :");
            for (j = 0; j < 5; j++) {
                do {
                    System.out.println("Salário " + (j + 1) + " :");
                    m[i][j] = tec.nextDouble();
                } while (m[i][j] <= 0);
                total += m[i][j];
            }
            System.out.println("Total departamento " + (i + 1) + "=" + total);
        }
        System.out.println("Matriz de salários:");
        for (i = 0; i < 4; i++) {
            System.out.println("");
            for (j = 0; j < 5; j++) {
                System.out.print(m[i][j] + "\t");
            }
        }
        System.out.println("");
    }
}
