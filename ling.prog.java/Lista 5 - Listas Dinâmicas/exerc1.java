import java.util.ArrayList;
import java.util.Scanner;

public class Exerc1 {
	public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
	    ArrayList<Integer> num = new ArrayList<Integer>();
	    String escolha;
	    int n, soma = 0;
	
	    do{
            System.out.println("Quer digitar um número dentro do Array? [S/N]");
            escolha = keyb.next();
            if (escolha.equalsIgnoreCase("s")){
                System.out.println("Valor: ");
                n = keyb.nextInt();
                num.add(n);
            } 
            
	    }while(escolha.equals("s"));
	    
	    for (int i = 0; i < num.size(); i++){
	        soma += num.get(i);
	    } 
	    System.out.println("Soma total:" + soma);
	    System.out.println("Média:" + (soma/num.size()) );
	    
	}
}
