import java.util.*;

public class Test_DoubleList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nВведите 5 карт первого игрока ");
        String[] cards = scanner.nextLine().split(" ");
        LinkedList<Integer> first_c = new LinkedList<>();
        for (String card : cards) {
            first_c.add(Integer.parseInt(card));
        }
        System.out.println(first_c);
        LinkedList<Integer> second_c = new LinkedList<>();
        System.out.println("Введите 5 карт второго игрока ");
        cards = scanner.nextLine().split(" ");
        for (String card : cards) {
            second_c.addLast(Integer.parseInt(card));
        }
        System.out.println(second_c);
        System.out.println(Game_DoubleList.Game(first_c, second_c));
    }
}
