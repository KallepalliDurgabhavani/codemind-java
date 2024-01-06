import java.util.Scanner;
public class MyClass
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(a/365);
        int c=a-(365*(a/365));
        System.out.println(c/7);
    }
}