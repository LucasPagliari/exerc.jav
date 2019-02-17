
import java.util.Scanner;

class Transposta {

    int a, b;
    int[][] matriz;

    Transposta() {
        int i, j;
        Scanner tec = new Scanner(System.in);

        System.out.println("Digite a e b:");
        do {
            a = tec.nextInt();
            b = tec.nextInt();
        } while (a < 2 || b < 2);

        matriz = new int[a][b];
    }
}
