import java.util.Scanner;

public class Exerc1{

    static void calc(int v){
            
            if(v == 0) System.out.println("O valor digitado " + v + " é nulo!");
            else if(v % 2 == 0) System.out.println("O valor digitado " + v + " é par!");
            else System.out.println("O valor digitado " + v + " é impar!");
            
        }
        
    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);
        int valor;
                
        System.out.print("Digite o valor para verificação: ");
        valor = tec.nextInt();
        calc(valor);
        
    }
}