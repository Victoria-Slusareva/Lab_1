import java.util.Scanner;

 class Task_5
 {
    public static int Check(int x, int sum)
    {
        if(x/10==0)
        {
            sum+=x;
            return sum;
        }
        else
        {
            sum+=x%10;
            x=x/10;
            return (Check(x, sum));
        }
    }

    public static void main(String[] args)
    {
        int sum=0;
        Scanner input=new Scanner(System.in);
        System.out.print("\nВведите число: ");
        int x=input.nextInt();
       System.out.println("Сумма цифр введённого числа равна: "+Check(x, sum));
    }
}
