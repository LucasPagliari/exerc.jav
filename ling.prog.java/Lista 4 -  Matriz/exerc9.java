import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner keyb = new Scanner(System.in);
		String m[][] = {{"a", "e", "i", "o", "u"},{"r","s","t","v","q"},
		{"m","n","p","l","d"},{"w","x","h","j","d"},{"y","a","o","j","k"}};
		boolean k = true;
		System.out.println("Letra Procurada:");
		String search = keyb.nextLine();

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j].equalsIgnoreCase(search)) {
					System.out.println("Letra " + search + " em: m["+i+"]"+"["+j+"]");
					k = false;
				}
			}
		}
		if (k) {
			System.out.println("Letra "+ search + " não está na matriz m");
		}
	}
} 	
