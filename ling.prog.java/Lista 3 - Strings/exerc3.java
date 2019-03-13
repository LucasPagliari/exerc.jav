import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner keyb = new Scanner(System.in);
		String word;
		int n=0, v=0;
		System.out.println("Digite uma Palavra");
		word = keyb.nextLine();
		word = word.toLowerCase();
		for(int i = 0; i < word.length(); i++){
			System.out.println(word.charAt(i));

			if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i'
            	|| word.charAt(i) == 'o' || word.charAt(i) == 'u'){
            	v++;
            }
            else if (word.charAt(i) == ' ') {
            	n++;
            }
		}

		System.out.println("Vogais: "+v);
		System.out.println("Espaços em Branco: "+n);
	}
}