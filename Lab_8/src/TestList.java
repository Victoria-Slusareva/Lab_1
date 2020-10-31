import java.util.*;

public class TestList
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n|Testing BoundedWaitList performance|");

        System.out.println("\nAdding elements to the queue");
        System.out.println("Enter capacity");
        int capacity = scanner.nextInt();
        BoundedWaitList<String> boundedWaitList = new BoundedWaitList<>(capacity);
        System.out.println("Enter queue elements");
        for (int i = 0; i < capacity; i++) {
            boundedWaitList.add(scanner.next());
        }
        System.out.println(boundedWaitList);

        System.out.println("\nRemoving the first element from the queue");
        boundedWaitList.remove();
        System.out.println(boundedWaitList);

        System.out.println("\nChecking if an element is in the queue");
        System.out.println("Enter the element: ");
        String key = scanner.next();
        if (boundedWaitList.contains(key)) {
            System.out.println("Element is found.");
        } else {
            System.out.println("Element is not found.");
        }

        System.out.println("\nChecking if queue is empty");
        if (boundedWaitList.isEmpty())
        {
            System.out.println("Queue is empty.");
        }
        else
        {
            System.out.println("Queue is not empty.");
        }

        System.out.println("\n\n|Testing UnfairWaitList performance|");
        UnfairWaitList<String> unfairWaitList = new UnfairWaitList<>();

        System.out.println("\nAdding elements to the queue");
        System.out.println("Enter capacity");
        capacity = scanner.nextInt();
        System.out.println("Enter queue elements");
        for (int i = 0; i < capacity; i++) {
            unfairWaitList.add(scanner.next());
        }
        System.out.println(unfairWaitList);

        System.out.println("\nRemoving an element from the queue");
        System.out.println("Enter the element: ");
        key = scanner.next();
        unfairWaitList.remove(key);
        System.out.println(unfairWaitList);

        System.out.println("\nMoving an element to the end of the queue");
        System.out.println("Enter the element: ");
        key = scanner.next();
        unfairWaitList.moveToBack(key);
        System.out.println(unfairWaitList);

        System.out.println("\nChecking if queue is empty");
        if (unfairWaitList.isEmpty())
        {
            System.out.println("Queue is empty.");
        }
        else
        {
            System.out.println("Queue is not empty.");
        }
    }
}
