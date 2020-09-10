import java.lang.*;

public class Dog
{
    private String breed;
    private int age;
    private String name;

    public Dog(String n, int a, String b)
    {
        this.breed=b;
        this.age=a;
        this.name=n;
    }
    public void setBreed(String breed)
    {
        this.breed=breed;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getBreed(String breed)
    {
        return breed;
    }
    public int getAge(int age)
    {
        return age;
    }
    public String getName(String name)
    {
        return name;
    }
    public String toString()
    {
        return "\nName: "+this.name+"\nAge: "+this.age+"\nBreed: "+this.breed;
    }
    public void hAge()
    {
        System.out.print(this.name+"'s age in human years is "+this.age*7+" years\n");
    }
}
