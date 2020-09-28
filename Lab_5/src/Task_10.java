import java.util.Scanner;

public class Task_10
{
    public static int Check(int x)
    {
        if(x/10==0)
        {
            System.out.print(x);
            return 0;
        }
        else
        {
            System.out.print(x%10);
            x=x/10;
            return (Check(x));
        }
    }

    public static void main(String[] args)
    {
        int sum=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Введите число: ");
        int x=input.nextInt();
        System.out.print("Ваше число, записанное в обратном порядке: ");
        Check(x);
    }
}
