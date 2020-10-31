package Task_1;

import java.util.ArrayList;
import java.lang.*;

public class INN
{
    ArrayList<Data> inn;
    public INN()
    {
        inn = new ArrayList<>();
    }

    public void Add(Data data) throws UniqueINN
    {
        Check(data.getInn(), data.getName());
        inn.add(data);
    }

    private void Check(long i, String name) throws UniqueINN
    {
        for (Data d : inn)
        {
            if (d.getName().equals(name)||d.getInn()==i)
            {
                throw new UniqueINN("This INN number is already in database." +
                        "\nIt is not valid for the client "+name);
            }
        }
    }

    public void Print()
    {
        for(Object i: inn) {
            System.out.println(i);
        }
    }
}
