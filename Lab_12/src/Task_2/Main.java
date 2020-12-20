package Task_2;

public class Main {
    public static void main(String[] args) {
        String test = "Россия, Московская область, Москва, Спортивная, 27, 3, 60";
        Address test1 = new Address();
        test1.StringSplit(test);
        System.out.println(test1);

        Address test2 = new Address();
        test2.StringTokenizer(test);
        System.out.println(test2);
    }
}
