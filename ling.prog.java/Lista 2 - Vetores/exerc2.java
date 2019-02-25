/*
2. Altere o exercício anterior para que o usuário 
informa a quantidade de valores que deseja inserir, insira esses
valores e mostre a quantidade de valores pares e ímpares existentes no vetor.
*/
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		int i, par=0;
		Scanner keyb = new Scanner(System.in);
		i = keyb.nextInt();
		int vet[] = new int[i];
		
		for (i = 0; i <= vet.length; i++) {
			vet[i] = keyb.nextInt();
			if (vet[i] % 2 == 0) par++;
		}
		System.out.println("qnt. pares: "+ par)
		System.out.println("qnt. impar: "+ (vet.length - par))
	}
}