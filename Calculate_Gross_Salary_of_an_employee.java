import java.util.Scanner;
public class MyClass
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        double pf=a*0.12;
        double s=a+b+c+pf;
        System.out.printf("%.2f
",pf);
        System.out.printf("%.2f",s);
    }
}