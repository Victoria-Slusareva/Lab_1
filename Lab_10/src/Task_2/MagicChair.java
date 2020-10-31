package Task_2;

public class MagicChair implements Chair
{
    public void doMagic()
    {
        System.out.println("Wow, this chair does some magic stuff ヘ(◕。◕ヘ)");
    }
    @Override
    public String toString() {
        return "|The MagicChair|";
    }
    @Override
    public void sit()
    {
        System.out.println("Let's try to sit on this chair");
        doMagic();
    }
}
