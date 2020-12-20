package Task_1;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Колесникова", "Екатерина", "Игоревна");
        System.out.println();
        System.out.println(person1.getName());
        Person person2 = new Person("Златарев", "Александр");
        System.out.println(person2.getName());
        Person person3 = new Person("Гусева");
        System.out.println(person3.getName());
    }
}
