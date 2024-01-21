import java.util.Scanner;
public class MyClass
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            String s=sc.nextLine();
            int temp=Integer.parseInt(s,16);
            String b=Integer.toBinaryString(temp);
            if(b.length()%4==0)
            {
                System.out.println(b);
            }
            else
            {
                int k=b.length()%4;
                for(int i=0;i<4-k;i++)
                {
                    System.out.print("0");
                }
                System.out.println(b);
            }
        }
    }
}