/*
1. Suponha um vetor com 15 valores inteiros. 
Mostre a soma de todos esses valores e a média desses valores
*/

public class Ex1 {

	public static void main(String[] args) {
		int vetor[] = {2, 3, 5, 7, 11, 13, 17, 19, 21, 23, 31, 37, 41, 43, 51};
		int sum = 0;
		for (int i = 0; i <= vetor.length; i++) {
			sum += vetor[i];
		}
		sum = sum/vetor.length;
		System.out.println("Média:" + sum);
	}
}