/*
3. Faça um programa que preencha 2 vetores de 5 posições
e some cada elemento de posição correspondente
desses vetores, armazenando o resultado em outro vetor. Exemplo:
vetor1 [ 1, 2, 3, 4, 5] + vetor2 [ 6, 7, 8, 9, 10] = vetor3 [ 7, 9, 11, 13, 15]
*/
import java.util.Scanner;
import java.util.Arrays;

public class Ex3{

	public static void main(String[] args) {
		Scanner keyb = new Scanner(System.in);
		int vet1[] = new int [5];
		int vet2[] = new int [5];
		int vet3[] = new int [5];

		for (int i = 0; i<vet1.length; i++) {
			vet1[i] = keyb.nextInt();
			vet2[i] = keyb.nextInt();
			vet3[i] = vet1[i] + vet2[i];
		}
		System.out.println(Arrays.toString(vet3));
	}
}