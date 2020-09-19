import java.lang.*;

class Test_Ball
{
    public static void main(String[] args)
    {
        Ball m1=new Ball(100, 100);
        System.out.println("\n"+m1);
        m1.move(30,15);
        System.out.println(m1);
        m1.move(-20,-5);
        System.out.println(m1);
    }
}