import java.util.*;

public class Game_DoubleList
{
    public static String Game(LinkedList<Integer> first, LinkedList<Integer> second)
    {
        int counter=0;
        while(counter<=106)
        {
            if(first.size()==0)
            {
                return "\nКоличество ходов: "+counter+"\nПобедил второй игрок";
            }
            else if(second.size()==0)
            {
                return "\nКоличество ходов: "+counter+"\nПобедил первый игрок";
            }
            else
            {
                counter++;
                int f = first.peek();
                int s = second.peek();
                System.out.println("first "+f);
                System.out.println("second "+s);
                first.removeFirst();
                second.removeFirst();
                if (f!=0 && s!=0)
                {
                    if (f > s)
                    {
                        first.addLast(f);
                        first.addLast(s);
                    }
                    else
                    {
                        second.addLast(s);
                        second.addLast(f);
                    }
                }
                else if(f == 9 || s==9)
                {
                    if (f == 0)
                    {
                        first.addLast(f);
                        first.addLast(s);
                    }
                    else if (s==0)
                    {
                        second.addLast(s);
                        second.addLast(f);
                    }
                }
                else
                {
                    if (s == 0)
                    {
                        first.addLast(f);
                        first.addLast(s);
                    }
                    else
                    {
                        second.addLast(s);
                        second.addLast(f);
                    }
                }
                System.out.println(first);
                System.out.println(second);
            }
        }
        return "\nbotva";
    }
}
