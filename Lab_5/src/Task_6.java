import java.util.Scanner;

public class Task_6
{
    public static String Check(int x, int k)
    {
        if (x<k) return "Нет";
        if (x==k) return "Да";
        if (x%k==0) return "Нет";
        if (k<x/2) return Check(x, k+1);
        else return "Да";
    }

    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("\nВведите число: ");
        int x=input.nextInt();
        System.out.println("Данное число является простым? "+Check(x, 2));
    }
}
