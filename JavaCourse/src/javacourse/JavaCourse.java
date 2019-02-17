package javacourse;

public class JavaCourse 
{
    public static void main(String[] args)
    {
        Pen p1 = new Pen(); //creating an object 
        p1.charge = 100; //attributes
        p1.color = "blue";
        p1.model = "bic";
        //p1.tip = 0.7f;
    
        p1.open();
        p1.status(); //method "()"
        p1.write();
        p1.openclose();
        p1.status();
        p1.write();
    }
    
}
