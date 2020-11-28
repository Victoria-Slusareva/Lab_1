package Task_1;

public class TestArrayQueueModule {
    public static void main(String[] args) {
        ArrayQueueModule module = new ArrayQueueModule();
        System.out.println("\nIs empty?\tAnswer: "+module.isEmpty());
        System.out.println("Adding elements...");
        for (int i = 0; i < 20; i++)
        {
            module.enqueue(i);
        }
        System.out.println("Is empty?\tAnswer: "+module.isEmpty());
        System.out.println("Size: "+module.size());
        System.out.println("First element: "+module.element());
        System.out.println("Deleting some elements...");
        for (int i = 0; i < 10; i++) {
            module.dequeue();
        }
        System.out.println("Is empty?\tAnswer: "+module.isEmpty());
        System.out.println("Size: "+module.size());
        System.out.println("First element: "+module.element());
        System.out.println("Deleting all elements...");
        module.clear();
        System.out.println("Is empty?\tAnswer: "+module.isEmpty());
    }
}
