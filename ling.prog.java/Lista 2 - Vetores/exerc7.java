public class Ex7 {

    public static void main(String[] args) {
        
        int vet[] = {1, 2, 3, 4, 5, 6, 7, 8};
        

        for (int i = 0, j = vet.length - 1; i < vet.length/2; i++, j--) {
            int temp = vet[j];
            vet[j] = vet[i];
            vet[i] = temp;
        }
        for(int i = 0; i < vet.length; i++){
            System.out.println("vet1["+i+"]: "+vet[i]);
        }
    }
}