package Task_2;

public class VictorianChair implements Chair
{
    private int age;
    public int getAge()
    {
        return age;
    }
    VictorianChair(int age)
    {
        this.age=age;
    }
    public String toString() {
        return "|The VictorianChair|";
    }
    @Override
    public void sit()
    {
        System.out.println("Let's try to sit on this chair");
        System.out.println("The age of this chair is "+getAge()+" years");
    }
}
