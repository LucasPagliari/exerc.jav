import java.util.Scanner;

public class Exerc9 {

    static void buscarValor(int vet[], int v) {
        int indice = 0;
        for (int i = 0; i < vet.length; i++) {
            if (v == vet[i]) {
                indice = i;
            }
        }
        if (indice == 0) {
            System.out.println("Valor não encontrado");
        } 
        else System.out.println("Valor na posição: " + indice);

    }

    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        int size, busca;
        System.out.println("Tamanho do vetor ");
        size = keyb.nextInt();

        int vet[] = new int[size];

        for (int i = 0; i < vet.length; i++) {
            System.out.println("V[" + i + "]: ");
            vet[i] = keyb.nextInt();
        }

        System.out.println("Valor a ser procurado: ");
        busca = keyb.nextInt();
        buscarValor(vet, busca);
    }
}
