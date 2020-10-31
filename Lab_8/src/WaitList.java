import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public abstract class WaitList<E> implements IWaitList<E>
{
    protected ConcurrentLinkedQueue<E> content;
    public WaitList()
    {
        content=new ConcurrentLinkedQueue<>();
    }
    public WaitList(Collection<E> c)
    {
        content=(ConcurrentLinkedQueue<E>) c;
    }
    @Override
    public String toString()
    {
        return "Content: "+content;
    }
    @Override
    public void add(E element)
    {
        content.add(element);
    }
    @Override
    public E remove()
    {
        return content.remove();
    }
    @Override
    public boolean contains(E element)
    {
        for (E e : this.content)
        {
            if (e.equals(element))
            {
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean containsAll(Collection<E> c)
    {
        return content.containsAll(c);
    }
    @Override
    public boolean isEmpty()
    {
        return content.size() == 0;
    }
}
