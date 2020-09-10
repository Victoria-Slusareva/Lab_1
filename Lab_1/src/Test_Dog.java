import java.lang.*;

public class Test_Dog
{
    public static void main(String[] args)
    {
        Dog d1=new Dog("Ferguson", 3, "corgi");
        Dog d2=new Dog("Eve", 5, "husky");
        Dog d3=new Dog("Frank", 4, "pug");
        System.out.println(d1.toString());
        d1.hAge();
        System.out.println(d2.toString());
        d2.hAge();
        System.out.println(d3.toString());
        d3.hAge();
    }
}