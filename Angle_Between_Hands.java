import java.util.Scanner;
public class MyClass
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String t=sc.nextLine();
        int h=Integer.parseInt(t.substring(0,2));
        int m=Integer.parseInt(t.substring(3));
        double a=(30*h)-(5.5*m);
        a=Math.abs(a);
        double b=360-a;
        double min=a<b?a:b;
        System.out.println(min);
        
    }
}