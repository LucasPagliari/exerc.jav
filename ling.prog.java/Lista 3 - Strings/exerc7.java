import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        String word;
        int v;
        System.out.println("Digite o Nome Completo:");
        word = keyb.nextLine();
        String names[] = word.split(" ");
        System.out.println("Sobrenome: " + names[names.length-1]);
    }
}