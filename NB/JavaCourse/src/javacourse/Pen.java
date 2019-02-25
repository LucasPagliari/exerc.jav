package javacourse;

public class Pen
{
    public String model, color;
    public float tip; 
    public int charge;
    private boolean pencap;
    
    public void status(){
        System.out.println("My pen is: "+this.model+"\t"+this.color);
        System.out.println("Is it open? "+this.pencap);
    }
    public void write(){
        if(this.pencap == false) System.out.println("Pen closed");
        else System.out.println("You wrote something in " + this.color);
    }
    public void openclose(){
        this.pencap = !this.pencap; 
    }
    public void open(){
        this.pencap = true;
    }
}
