import java.util.Scanner;

public class Exerc4{

    static void calc (int vip){
        if(vip > 0){
            int fat = 1, i = 1;
            while (vip>1)
            {
                fat = fat*vip;
                vip--;
            }
            System.out.println("O fatorial do número digitado é: "+fat);
        }else System.out.println("Não existe fatorial de números negativos!");
        
    }
    
    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);
        int valor;
                
        System.out.print("Digite um valor inteiro e positivo:");
        valor = tec.nextInt();
        calc(valor);
                
    }

}