import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {

        Scanner keyb = new Scanner(System.in);
        int m[][] = new int[3][3];
        int t[][] = new int[3][3];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.println("Matriz A["+i+"]"+"["+j+"]: ");
                m[i][j] = keyb.nextInt();
            }
        }
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
               t[i][j] = m[m.length - j - 1][i];
            }
        }
         
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.print(t[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}