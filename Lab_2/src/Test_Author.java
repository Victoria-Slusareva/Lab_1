import java.lang.*;

class Test_Author
{
    public static void main(String[] args)
    {
        Author a1=new Author("Joe Hill", 'M', "jh@gmail.com");
        Author a2=new Author("Neil Gaiman", 'M', "ng@gmail.com");
        System.out.println("\n"+a1.toString());
        System.out.println(a2.toString());
    }
}