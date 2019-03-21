import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exerc2 {
    public static void main(String args[]) {
        Scanner keyb = new Scanner(System.in);
        ArrayList <Integer> num = new ArrayList <Integer>();
        String escolha;
        int n;
        
        do{
            System.out.println("Quer digitar um número dentro do Array? [S/N]");
            escolha = keyb.next();
            if (escolha.equalsIgnoreCase("s")){
                System.out.println("Valor: ");
                n = keyb.nextInt();
                num.add(n);
            }
	    }while(escolha.equals("s"));
	
	    Collections.sort(num);
	
	    for(int i = 0; i < num.size(); i++){
	        System.out.print(num.get(i) + "\n");
	    }
    
        
    }
}