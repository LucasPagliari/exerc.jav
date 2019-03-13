import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner keyb = new Scanner(System.in);
        String word;
        System.out.println("Digite um número");
        word = keyb.nextLine();
        for (int i = 0; i < word.length(); i++) {
        	if (word.charAt(i) == '1') { 
        		System.out.print("um ");
        	}
        	else if (word.charAt(i) == '2') { 
        		System.out.print("dois ");
        	}
        	else if (word.charAt(i) == '3') { 
        		System.out.print("três ");
        	}
        	else if (word.charAt(i) == '4') { 
        		System.out.print("quatro ");
        	}
        	else if (word.charAt(i) == '5') { 
        		System.out.print("cinco ");
        	}
        	else if (word.charAt(i) == '6') { 
        		System.out.print("seis ");
        	}
        	else if (word.charAt(i) == '7') { 
        		System.out.print("sete ");
        	}
        	else if (word.charAt(i) == '8') { 
        		System.out.print("oito ");
        	}
        	else { 
        		System.out.print("nove ");
        	}
        }
	}
}