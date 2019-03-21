import java.util.Scanner;
import java.util.ArrayList;

public class Exerc3 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        int chk = 0;
        while (chk == 0) {
            System.out.println("Digite uma palavra:");
            nomes.add(tec.nextLine());
            System.out.println("Deseja digitar mais uma palavra? (S ou N):");
            if (tec.nextLine().equalsIgnoreCase("N")) {
                chk = 1;
            }
        }
        String vt = nomes.toString().replaceAll(",", "");
        char[] crt = vt.substring(1,vt.length()-1).toCharArray();
        System.out.println(crt);  
    }
}