package Task_2;

import java.util.*;

public class FunctionalChair implements Chair
{
    public int sum(int a, int b)
    {
        return a+b;
    }
    @Override
    public String toString() {
        return "|The FunctionalChair|";
    }
    @Override
    public void sit() {
        System.out.println("Let's try to sit on this chair");
        Scanner scanner = new Scanner(System.in);
        System.out.println("This chair can count the sum of 2 integers! Let's test it." +
                "\nEnter 2 numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("The sum is " + sum(a, b));
    }
}
