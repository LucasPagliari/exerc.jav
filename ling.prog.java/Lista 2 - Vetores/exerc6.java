public class Ex5 {

	public static void main(String[] args) {
		Double vet1[] = {2.3, 4.7, 1.4};
		Double vet2[] = {1.6, 6.2, 3.5};
		Double vet3[] = new Double[6];
		float somav1 = 0, somav2 = 0;

		for (int i = 0, j = 0; i < 6; i++) {
			if (i < 3) {
				somav1 += vet1[i];
				somav2 += vet2[i];	
			}
			if (i<3) {
				vet3[i] = vet2[i];				
			}
			else{
				vet3[i] = vet1[j];
				j++;
			} 
        	System.out.println("Soma do Vet3[" + i + "]: " + vet3[i]);	
		}
		System.out.println("------------------------------------");
        System.out.println("Soma do Vet1: " + somav1 + "\n" + "Soma do Vet2: " + somav2);

		
	}
}