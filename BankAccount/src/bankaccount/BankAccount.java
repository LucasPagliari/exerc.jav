package bankaccount;
import java.util.Scanner;
public class BankAccount {
    
    public static void main(String[] args) {
        String acc, name;
        int n;
        double c;
        Scanner keyb = new Scanner(System.in);
        System.out.println("Welcome to the BBW");
        
        do{
            System.out.println("Create an Account");
            System.out.println("1- Checking Account (CA)");
            System.out.println("2- Saving Account (SA)");
            n = keyb.nextInt();
            if(n==1)acc = "CA";
                else acc = "SA";  
        }while(n>2 || n<1);
       
        System.out.println("Type your name:");
        name = keyb.next();
        System.out.println("Type a number account");
        n = keyb.nextInt();
        
        Acc c1 = new Acc(n,name,acc);
        n=1;
        while(n!=0){
            System.out.println("1- Deposit");
            System.out.println("2- Cash out");
            System.out.println("3- Balance");
            System.out.println("4- Status");
            System.out.println("5- Open/Close Account");
            System.out.println("6- Show Account");
            System.out.println("7- Monthly Payment");
            System.out.println("0- Leave");
            n = keyb.nextInt();
            System.out.println(" ");
            switch (n){
                case 1: System.out.println("How much would you like to deposit?");
                    c = keyb.nextDouble();
                    c1.deposit(c);
                    break;
                case 2: System.out.println("How much would you like to cash out?");
                    c = keyb.nextDouble();
                    c1.cashOut(c);
                    break;
                case 3: System.out.println("Your current balance: "+c1.getBalance());
                    break;
                case 4: System.out.println("Account open?"+c1.getStatus());
                    break;
                case 5: c1.openCloseAcc();
                    break;
                case 6: System.out.println("Number: "+ c1.getNumAcc());
                    System.out.println("Owner: "+ c1.getOwner());
                    System.out.println("Balance: "+ c1.getBalance());
                    System.out.println("Type: "+ c1.getType());
                    System.out.println("Status: "+ c1.getStatus());
                    System.out.println(" ");
                    break;
                case 7: c1.monthlyP();
                    break;
                case 0: System.out.println("Goodbye");
                    break;
            } 
        }
    }
    
}
