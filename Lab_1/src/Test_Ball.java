import java.lang.*;

public class Test_Ball
{
    public static void main(String[] args)
    {
        Ball b1=new Ball("basketball", 23.85, "orange");
        Ball b2=new Ball("football", 21.6, "black and white");
        Ball b3=new Ball("tennis", 6.7 , "green");
        System.out.println(b1.toString());
        System.out.println(b2.toString());
        System.out.println(b3.toString());
    }
}