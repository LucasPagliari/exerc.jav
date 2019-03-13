import java.util.Scanner;

public class Ex {
    
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        String word_a, word_b;
        System.out.println("Digite uma Palavra");
        word_a = keyb.nextLine();
        System.out.println("Digite outra Palavra");
        word_b = keyb.nextLine();
        if (word_a.length() != word_b.length() ) {
            System.out.println("Error: Palavras de tamanhos diferentes!");          
        }
        else if (!word_a.equalsIgnoreCase(word_b)) {
           System.out.println("Error: Palavras diferentes (caracteres)!");        
        }   
        else if (!word_a.equals(word_b)) {
           System.out.println("Error: Palavras diferentes (cases)!");       
        }   
    }
}
