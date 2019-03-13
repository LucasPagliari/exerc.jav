import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner keyb = new Scanner(System.in);
        String word; char search;
        System.out.println("Digite uma Palavra");
        word = keyb.nextLine();
        System.out.println("Digite uma Letra a ser Buscada");
        search = keyb.nextLine().charAt(0);
        for (int i = 0; i < word.length(); i++) {
        	if (word.charAt(i) == search) {
        		System.out.println("Letra" + search + "posição: " 
        			+ word.indexOf(search, i));
        		
        	}
        }
		
	}
}