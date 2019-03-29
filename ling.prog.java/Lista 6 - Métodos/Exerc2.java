import java.util.Scanner;

public class Exerc2{

    static void calc(int p, double alt, String s){
            DecimalFormat form = new DecimalFormat("0.00");
            double imc = p / (alt*alt);
            
            if(s.equalsIgnoreCase("M")){
            if(imc<19.1)System.out.println("Abaixo do peso "+form.format(imc));  
            else if(imc<25.8)System.out.println("No peso normal "+form.format(imc)); 
            else if(imc<27.3)System.out.println("Marginalmente acima do peso " +form.format(imc)); 
            else if(imc<=31.1)System.out.println("Acima do peso ideal "+form.format(imc)); 
            else System.out.println("Obeso"+form.format(imc));
            }
            
            if(s.equalsIgnoreCase("H")){
            if(imc<20.7)System.out.println("Abaixo do peso "+form.format(imc));  
            else if(imc<26.4)System.out.println("No peso normal "+form.format(imc)); 
            else if(imc<27.8)System.out.println("Marginalmente acima do peso " +form.format(imc)); 
            else if(imc<=32.3)System.out.println("Acima do peso ideal "+form.format(imc)); 
            else System.out.println("Obeso"+form.format(imc));
            }
            
        }
        
    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);
        int peso;
        double altura;
        String sexo;
        
        do{
        System.out.println("Digite < M > para mulher ou < H > homem");
        sexo = tec.next();
        }while(!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("H"));
                
        System.out.println("Digite o peso para verificação");
        peso = tec.nextInt();
        System.out.println("Digite a altura para verificação");
        altura = tec.nextDouble();
        calc(peso,altura,sexo);
        
    }

}