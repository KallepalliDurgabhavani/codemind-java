import java.util.Scanner;
public class MyClass
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        float c=sc.nextFloat();
        float f=32+(c*9/5);
        System.out.printf("%.2f",f);
    }
}