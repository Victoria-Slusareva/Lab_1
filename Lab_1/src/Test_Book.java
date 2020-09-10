import java.lang.*;

public class Test_Book
{
    public static void main(String[] args)
    {
        Book bk1=new Book("Sir Arthur Charles Clarke", "The City and the Stars", 1948, 350);
        Book bk2=new Book("Erich Maria Remarque","Shadows in Paradise", 1959, 240);
        Book bk3=new Book("Sir Arthur Ignatius Conan Doyle", "The Adventures of Sherlock Holmes", 1892, 710);
        System.out.println(bk1.toString());
        System.out.println(bk2.toString());
        System.out.println(bk3.toString());
    }
}