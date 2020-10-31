package Task_1;

public class TestComplex
{
    public static void main(String[] args)
    {
        Complex complex;
        ComplexAbstractFactory concreteFactory = new ConcreteFactory();
        ComplexAbstractFactory concreteFactory_2 = new ConcreteFactory();
        complex = concreteFactory.createComplex(2,-1);
        System.out.println("\n"+complex.toString());
    }
}
