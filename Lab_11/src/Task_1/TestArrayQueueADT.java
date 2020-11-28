package Task_1;

public class TestArrayQueueADT {
    public static void main(String[] args) {
        ArrayQueueADT adt = new ArrayQueueADT();
        System.out.println("\nIs empty?\tAnswer: "+ArrayQueueADT.isEmpty(adt));
        System.out.println("Adding elements...");
        for (int i = 0; i < 20; i++)
        {
            ArrayQueueADT.enqueue(adt, i);
        }
        System.out.println("Is empty?\tAnswer: "+ArrayQueueADT.isEmpty(adt));
        System.out.println("Size: "+ArrayQueueADT.size(adt));
        System.out.println("First element: "+ArrayQueueADT.element(adt));
        System.out.println("Deleting some elements...");
        for (int i = 0; i < 10; i++) {
            ArrayQueueADT.dequeue(adt);
        }
        System.out.println("Is empty?\tAnswer: "+ArrayQueueADT.isEmpty(adt));
        System.out.println("Size: "+ArrayQueueADT.size(adt));
        System.out.println("First element: "+ArrayQueueADT.element(adt));
        System.out.println("Deleting all elements...");
        adt.clear();
        System.out.println("Is empty?\tAnswer: "+ArrayQueueADT.isEmpty(adt));
    }


}
