package Task_2;

public class ChairFactory implements AbstractChairFactory
{
    @Override
    public MagicChair createMagicChair()
    {
        return new MagicChair();
    }

    @Override
    public FunctionalChair createFunctionalChair()
    {
        return new FunctionalChair();
    }

    public VictorianChair createVictorianChair()
    {
        return new VictorianChair(150);
    }
}
