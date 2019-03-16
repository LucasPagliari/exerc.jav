import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner keyb = new Scanner(System.in);
		double m[][] = new double[3][4];

		for (int i = m.length - 1; i >= 0; i--) {
			for (int j = m[i].length - 1; j >= 0; j--) {
				System.out.println("m["+i+"]"+"["+j+"]: ");
				m[i][j] = keyb.nextDouble();		
			}
		}
		for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println("");
        }
	}
}