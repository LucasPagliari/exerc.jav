import java.util.Scanner;

public class Ex {
    
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        int soma=0, valor, i=0;
        int vet[] = new int[100];
        
        do{
            System.out.println("Insira um valor: ");
            valor = keyb.nextInt();
            if (valor == -1) {
                break;
            }
            vet[i] = valor;
            soma += vet[i];
            i++;
        }while(i < 100);
        
        System.out.println("------------------------------------");
        System.out.println("Foram inseridos: " + i + " valores");
        System.out.println("------------------------------------");
        
        for (int j = 0; j < i; j++) {
            System.out.println("Vet["+ j +"]: " + vet[j]);
        }
        System.out.println("------------------------------------");
        
        for (int j = (i-1); j != -1; j--) {
            System.out.println("Vet["+ j +"]: " + vet[j]);
        }
        
        System.out.println("------------------------------------");
        System.out.println("Soma dos Valores: " + soma);
        
        soma = soma/i;
        System.out.println("------------------------------------");
        System.out.println("Média dos Valores: " + soma);
        
        System.out.println("------------------------------------");
        for (int j = 0; j < (i-1); j++) {
            if (vet[j] > soma) {
                System.out.println("Valor Acima da Média "+ "Vet["+ j +"]: " + vet[j]);
            }
        }
    }
}
