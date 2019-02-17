import java.util.Scanner;
class mta
{
    
    
    public static void main(String args[])
    {   
        double x, y;
        Scanner keyb = new Scanner(System.in);
        System.out.print("Type a number:");
        x = keyb.nextDouble();
        y = keyb.nextDouble();
        calc(x,y);
    }
    public static void calc(double a, double b)
        {
            if (b > 0)
            {
                while (a<100)
                {
                    a += b;
                    System.out.println(a);
                }
            }
            else System.out.println("Invalid Number");
        }
}