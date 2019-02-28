import java.util.Scanner;
import java.util.Arrays;

public class Ex3{

	public static void main(String[] args) {
		Scanner keyb = new Scanner(System.in);
		int vet1[] = new int [5];
		int vet2[] = new int [5];
		int vet3[] = new int [5];

		for (int i = 0; i<vet1.length; i++) {
		    System.out.println("Vet1["+ i +"]: ");
			vet1[i] = keyb.nextInt();
			System.out.println("Vet2["+ i +"]: ");
			vet2[i] = keyb.nextInt();
			
			vet3[i] = vet1[i] + vet2[i];
		}
		System.out.println(Arrays.toString(vet3));
	}
}