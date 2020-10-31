package Task_2;

public class Client implements Chair
{
    public Chair chair;
    @Override
    public void sit()
    {
        System.out.println("Sitting on...");
    }
    public void setChair(Chair chair)
    {
        this.chair = chair;
    }
}
