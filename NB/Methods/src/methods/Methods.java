package methods;
import java.util.Scanner;
public class Methods {
    
    public static void main(String[] args) {
        int a;
        Scanner keyb = new Scanner(System.in);
        
        System.out.println("Você achou uma caneta com tampinha!");
        System.out.println("Qual seu o modelo?");
        String m = keyb.next();
        
        System.out.println("Qual a cor dela?");
        String c = keyb.next();
        
        Pen p1 = new Pen(m,c); //Object Construct Method
        
        do{
            System.out.println("Quer escrever com ela?");
            System.out.println("1- Sim"+ " \t " + "0- Não" );
            a = keyb.nextInt();
        }while(a<0 || a>1);
        
        if(a==1){
            p1.write(); //method
           
            if(p1.getCap()==true){
                do{
                    System.out.println("Quer tirar a tampinha?");
                    System.out.println("1- Sim"+ " \t " + "0- Não" );
                    a = keyb.nextInt();
                }while(a<0 || a>1);
                
                if(a==1){
                    p1.setCap(); //setter method
                    p1.write();       
                }
            }
        }
        
        System.out.println(" ");
        System.out.println("Sua caneta");
        p1.status();   
    }
}
