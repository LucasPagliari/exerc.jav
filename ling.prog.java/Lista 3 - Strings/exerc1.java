import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner keyb = new Scanner(System.in);
		String palavra;
		System.out.println("Digite uma Palavra");
		palavra = keyb.nextLine();
		System.out.println("Tamanho da Palavra" + palavra.length());
		
	}
}