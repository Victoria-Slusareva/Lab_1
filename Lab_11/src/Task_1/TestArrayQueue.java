package Task_1;

public class TestArrayQueue
{
    public static void main(String[] args) {
        ArrayQueue<Integer> queue = new ArrayQueue<Integer>();
        System.out.println("\nIs empty?\tAnswer: " + queue.isEmpty());
        System.out.println("Adding elements...");
        for (int i = 0; i < 20; i++) {
            queue.enqueue(i);
        }
        System.out.println("Is empty?\tAnswer: " + queue.isEmpty());
        System.out.println("Size: " + queue.size());
        System.out.println("First element: " + queue.element());
        System.out.println("Deleting some elements...");
        for (int i = 0; i < 10; i++) {
            queue.dequeue();
        }
        System.out.println("Is empty?\tAnswer: " + queue.isEmpty());
        System.out.println("Size: " + queue.size());
        System.out.println("First element: " + queue.element());
        System.out.println("Deleting all elements...");
        queue.clear();
        System.out.println("Is empty?\tAnswer: " + queue.isEmpty());
    }
}
