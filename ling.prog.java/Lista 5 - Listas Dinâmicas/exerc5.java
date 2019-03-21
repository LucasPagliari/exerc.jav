import java.util.Scanner;
import java.util.ArrayList;

public class Exerc4 {
    public static void main(String[] args) {
    	ArrayList<Integer> seq = new ArrayList<Integer>();
    	Scanner keyb = new Scanner(System.in);
    	System.out.println("Quantos números da sequenciâ?: ");
    	int n = keyb.nextInt() - 1;
    	int a = 0, b = 1, c = 0;

    	for (int i = 0; i < n; i++) {
    		seq.add(c);
    		c = a + b;
			a = b;
		    b = c;
    	}

    	for (int i = 0; i < seq.size(); i++) {
    		System.out.print(seq.get(i) + "\t");
    	}
    }
}