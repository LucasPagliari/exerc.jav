import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner keyb = new Scanner(System.in);
		int m[][] = new int[3][3];
		
		for (int j = 0; j < m.length; j++) {
			for (int i = 0; i < m[j].length; i++) {
		    System.out.println("m["+i+"]["+j+"]: ");
			m[i][j] = keyb.nextInt();				
			}
		}

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j]+"\t");
			}
			System.out.println("");
		}
	}
}