public class Ex10{

	public static void main(String[] args) {
		int vet[] = {3, 4, 5, 7, 20, 13, 17, 9, 2, 8};
		int max, min;
		max = vet[0];
		min = vet[0];

		for (int i = 0; i < vet.length; i++) {
			if(max <= vet[i]) max = vet[i];
			if(min >= vet[i]) min = vet[i];
		}
		System.out.println("Max:" + max + "\n" + "Min:" + min);
	}
}