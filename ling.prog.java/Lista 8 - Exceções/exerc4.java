import java.util.Scanner;

public class Ex04{
    
    public static void verificaSaque(double saldo, double saque) throws Exception{
        saldo -= saque;
        if(saldo <= 0){
            throw new Exception("Saldo Insuficiente");
        }
    }

    public static void main(String args[]){
        Scanner keyb = new Scanner(System.in);
        double saldo = 1000, qnt;
        int opc = 0;

        while(opc != 4){
            System.out.println("1-Sacar \n2-Depositar \n3-Verificar Saldo \n4-Sair");
            opc = keyb.nextInt();

            switch(opc){
                case 1:
                    System.out.println("Deseja sacar quanto?");
                    qnt = keyb.nextDouble();
                    try{
                        verificaSaque(saldo, qnt);
                        saldo -= qnt;
                    }catch(Exception e){
                        System.out.println(e);
                    }
                    System.out.println("Saldo Disponível: " + saldo);
                    break;
                case 2:
                    System.out.println("Deseja Depositar quanto?");
                    qnt = keyb.nextDouble();
                    System.out.println("Saldo Disponível: " + saldo);
                    saldo += qnt;
                    break;
                case 3:
                    System.out.println("Saldo Disponível: " + saldo);
                    break;
                case 4:
                    System.out.println("Até mais!");
                    break;
            }

        }

    }
}