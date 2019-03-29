

import java.util.Scanner;


public class Exerc6 {

    static int somaVetor(int vet[]) {
        int i, sum = 0;

        for (i = 0; i < vet.length; i++) {
            sum += vet[i];
        }

        return (sum);
    }

    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        int size;

        System.out.println("Tamanho do vetor");
        size = keyb.nextInt();
        
        int vet[] = new int[size];
        
        for (i = 0; i < vet.length; i++) {
            System.out.println("digite o valor  [" + i + "] do vetor = ");
            vet[i] = keyb.nextInt();
        }
        
        System.out.println("A soma total dos valores do vetor: " + somaVetor(vet));
    }
}
