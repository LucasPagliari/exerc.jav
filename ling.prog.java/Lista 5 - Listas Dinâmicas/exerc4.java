import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exerc4 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        ArrayList<Integer> notas = new ArrayList<>();      
        int j=0,soma = 0,media = 0,qtdacima =0;
        for (int i = 0; j != -1  ; i++) {
            System.out.println("Insira a Nota: ");
            j= tec.nextInt();
            notas.add(j);
            if (j == -1) {
               notas.remove(i);
            }
        }
        System.out.println("Qtd de valores lidos: " + notas.size());
        System.out.println(notas);
        Collections.reverse(notas);
        System.out.println(notas);
        for (int i = 0; i < notas.size(); i++) {
            soma = soma+notas.get(i);
        }
        media = soma/notas.size();
        System.out.println("Soma total: " + soma);
        System.out.println("Média: " + media);
        for (int i = 0; i < notas.size(); i++) {
            if (notas.get(i)>media) {
                qtdacima++;
            }
        }
        System.out.println("Notas Acima da Média"+qtdacima);
    }
    
}