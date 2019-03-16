import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		int i, par=0;
		Scanner keyb = new Scanner(System.in);
		System.out.println("Tamanho do array:");
		i = keyb.nextInt();
		int vet[] = new int[i];
		
		for (i = 0; i < vet.length; i++) {
		    System.out.println("Vet["+i+"]: ");
			vet[i] = keyb.nextInt();
			if (vet[i] % 2 == 0) par++;
		}
		System.out.println("qnt. num. pares: "+ par);
		System.out.println("qnt. núm. ímpares: "+ (vet.length - par));
	}
}
