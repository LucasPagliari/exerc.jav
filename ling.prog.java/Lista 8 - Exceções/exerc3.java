import java.util.Scanner;

public class Ex01{
    
    
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        int num;
        System.out.print("Digite um número: ");
        try{
            num = Integer.parseInt(entrada.nextLine());
            System.out.println("Num: " + num);
        } catch(Exception e){
            System.out.println(e);
        }        
    }
}