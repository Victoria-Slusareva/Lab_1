import java.util.*;

public class Game_Queue {
    public static String Game(Queue<Integer> first, Queue<Integer> second)
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
                first.remove();
                second.remove();
                if (f!=0 && s!=0)
                {
                    if (f > s)
                    {
                        first.add(f);
                        first.add(s);
                    }
                    else
                    {
                        second.add(s);
                        second.add(f);
                    }
                }
                else if(f == 9 || s==9)
                {
                    if (f == 0)
                    {
                        first.add(f);
                        first.add(s);
                    }
                    else if (s==0)
                    {
                        second.add(s);
                        second.add(f);
                    }
                }
                else
                {
                    if (s == 0)
                    {
                        first.add(f);
                        first.add(s);
                    }
                    else
                    {
                        second.add(s);
                        second.add(f);
                    }
                }
                System.out.println(first);
                System.out.println(second);
            }
        }
        return "\nbotva";
    }
}
