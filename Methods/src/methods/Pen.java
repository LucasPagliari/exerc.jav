package methods;
public class Pen {
    private String model, color;
    private float tip;
    private boolean cap;
    
    //Construct Method
    public Pen(String model, String color) {
        this.model = model; //this refers to the object used
        this.color = color;
        this.tip = 1f;
        this.cap = true;
    }
    //Getters Methods
    public String getModel() {
        return this.model;
    }
    public String getColor() {
        return this.color;
    }
    public float getTip() {
        return this.tip;
    }
    public boolean getCap(){
        return this.cap;
    }
    //Setter Method
    public void setCap(){
        this.cap = !this.cap;
    }
    
    public void status(){
        System.out.println("Modelo: "+this.getModel());
        System.out.println("Cor: "+this.getColor());
        System.out.println("Ponta: "+this.getTip());
        System.out.println("Com tampa: "+this.getCap());
    }
    
    public void write(){
        if (this.cap == true)System.out.println("Você tentou, mas ela ainda estava com a tampa");
        else System.out.println("Você escrevou, mas parece que a tinta está acabando");
    }
    
}
