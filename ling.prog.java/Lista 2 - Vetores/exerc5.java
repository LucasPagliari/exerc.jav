public class Ex5 {

	public static void main(String[] args) {
		int vet1[] = {1,2,3,4,5};
		int vet2[] = new int[5];

		for (int i = 0, j = 4; i < vet1.length; i++, j--) {
			vet2[j] = vet1[i];
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Vet2["+ i +"]: " + vet2[i]);
		}
	}
}