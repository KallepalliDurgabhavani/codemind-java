import java.util.Scanner;
public class MyClass
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String o=sc.next();
        int d=Integer.parseInt(o,8);
        System.out.println(d);
    }
}