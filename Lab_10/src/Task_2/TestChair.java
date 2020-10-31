package Task_2;

public class TestChair
{
    public static void main(String[] args)
    {
        Chair chair;

        AbstractChairFactory chairFactory = new ChairFactory();

        chair = chairFactory.createMagicChair();
        System.out.println("\n"+chair.toString());
        chair.sit();

        chair = chairFactory.createFunctionalChair();
        System.out.println("\n"+chair.toString());
        chair.sit();

        chair = chairFactory.createVictorianChair();
        System.out.println("\n"+chair.toString());
        chair.sit();
    }
}
