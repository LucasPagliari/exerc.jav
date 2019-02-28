import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner keyb = new Scanner(System.in);
		Double vet1[] = new Double[10];
		Double vet2[] = new Double[3];
		int k;

		System.out.println("Insira Valores Reais.");
		for (int i = 0; i < vet1.length; i++) {
			System.out.println("Vet1["+ i +"]: ");
			vet1[i] = keyb.nextDouble();	
		}

		do{
			System.out.println("Escolha de 0 - 9:");
			k = keyb.nextInt();
		}while (k < 0 || k > 9);

		for (int i = 0; i < 3 ; i++, k++) {
			if (k == vet1.length) {
				k = 0;
			}
			vet2[i] = vet1[k];
			System.out.println("Vet2["+ i +"]: " + vet2[i]);
		}
	}
} 	
