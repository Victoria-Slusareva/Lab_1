package Task_4;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        String str1 = "88003321243";
        System.out.println("Тест №1:\t"+PhoneNumber.normalize(str1));
        String str2 = "+79061480027";
        System.out.println("Тест №2:\t"+PhoneNumber.normalize(str2));
    }
}
