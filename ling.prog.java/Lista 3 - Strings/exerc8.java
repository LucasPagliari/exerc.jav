import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        String word; String str = "programação";
        System.out.println("Digite a Matéria:");
        word = keyb.nextLine().toLowerCase();
        System.out.println(word);
        System.out.println(word.startsWith(str));
        System.out.println(word.endsWith(str));

        if (word.startsWith(str) || word.endsWith(str)) {
            System.out.println("É da categoria de Programação");
        }
        else {
            System.out.println("Não é da categoria de Programação");            
        }
    }
}