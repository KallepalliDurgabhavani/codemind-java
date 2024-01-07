import java.util.Scanner;
public class MyClass
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int s=sc.nextInt();
        int b=sc.nextInt();
        int c=b*512*2*t*s;
        System.out.println(c);
    }
}