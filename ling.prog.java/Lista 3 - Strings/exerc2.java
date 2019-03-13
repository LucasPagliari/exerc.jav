import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner keyb = new Scanner(System.in);
		String word;
		System.out.println("Digite uma Palavra");
		word = keyb.nextLine();
		for(int i = 0; i < word.length(); i++){
			System.out.println(word.charAt(i));
		}
	}
}