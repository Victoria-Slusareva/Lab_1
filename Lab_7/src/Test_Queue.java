import java.util.*;

public class Test_Queue
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nВведите 5 карт первого игрока ");
        String[] cards = scanner.nextLine().split(" ");
        Queue<Integer> first_c = new LinkedList();
        for (String s : cards) {
            first_c.add(Integer.parseInt(s));
        }
        System.out.println(first_c);
        Queue<Integer> second_c = new LinkedList();
        System.out.println("Введите 5 карт второго игрока ");
        cards = scanner.nextLine().split(" ");
        for (String card : cards) {
            second_c.add(Integer.parseInt(card));
        }
        System.out.println(second_c);
        System.out.println(Game_Queue.Game(first_c, second_c));
    }
}
