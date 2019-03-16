import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {

        Scanner keyb = new Scanner(System.in);
        int a[][] = new int[4][4];
        int b[][] = new int[4][4];
    
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println("Matriz A["+i+"]"+"["+j+"]: ");
                a[i][j] = keyb.nextInt();
            }
        }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.println("Matriz B["+i+"]"+"["+j+"]: ");
                b[i][j] = keyb.nextInt();
            }
        }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] += a[i][j];
            }
        }
        System.out.println("A + B:")
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + "\t");
            }
            System.out.println("");
        }

    }
}