package bankaccount;
public class Acc {
    
    public int numAcc;      //account number
    private String owner; 
    protected String type; //checking account or savings account 
    private double balance;
    private boolean status;
    
    public Acc (int numAcc, String owner, String type){
        this.numAcc = numAcc;
        this.owner = owner;
        this.type = type;
        this.balance = 0;
        
        if (type == "ca"){
            this.balance += 50;
        }
        else this.balance += 150;
        this.status = false;
    }
    //Getters
    public int getNumAcc() {
        return this.numAcc;
    }
    public String getOwner() {
        return this.owner;
    }
    public double getBalance() {
        return this.balance;
    }
    public String getType(){
        return this.type;
    }
    public boolean getStatus(){
        return this.status;
    }
    //Setters
    public void setNumAcc(int numAcc) {
        this.numAcc = numAcc;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void openCloseAcc(){
        if(this.getStatus() && this.getBalance() != 0){
            System.out.println("You can not close your account you still have money in it"); 
            System.out.println("Balance: "+this.getBalance());
        }
        else if (this.getStatus() == false){
            this.setStatus(!this.getStatus());
            System.out.println("Account Opened");
            System.out.println("Balance: "+this.getBalance());
        }
        else{
            this.setStatus(!this.getStatus());
            System.out.println("Account Closed");       
        }
    }
    public void cashOut(double cash){
        if(this.getStatus()){
            if (this.getBalance() >= cash)this.setBalance(this.getBalance()-cash);
            else System.out.println("You do not have that much money");
        }
        else System.out.println("You need to open your account first");
    }
    public void deposit(double cash){
        if(this.getStatus()) this.setBalance(this.getBalance()+cash);
        else System.out.println("You need to open your account first");
    }
    public void monthlyP(){
        if(this.getType() == "ca"){
            System.out.println("Monthly Payment $12");
            this.setBalance(this.getBalance()-12);
        }
        else System.out.println("Saving Account does not have monthly payments");
        System.out.println("Balance: "+this.getBalance());
    }
    
    
}
