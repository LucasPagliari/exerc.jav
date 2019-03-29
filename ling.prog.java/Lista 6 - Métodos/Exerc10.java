
import java.util.Scanner;


public class Exerc10 {

    static void ordenar(int vet[]) {

        for (int i = vet.length; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                if (vet[j - 1] > vet[j]) {
                    int aux = vet[j];
                    vet[j] = vet[j - 1];
                    vet[j - 1] = aux;
                }
            }
        }
        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);
        }
    }

    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        int size, valor;
        System.out.println("Tamanho do vetpr:");
        size = keyb.nextInt();

        int vet[] = new int[size];

        for (int j = 0; j < vet.length; j++) {
            System.out.println("V[" + i + "]: ");
            vet[j] = keyb.nextInt();

        }

        ordenar(vet);
    }
}
