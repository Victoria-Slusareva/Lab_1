package Task_4;

public class PhoneNumber {
    public static String normalize(String str) {
        StringBuffer temp = new StringBuffer(str);
        if (str.startsWith("8"))
            temp.replace(0, 1, "+7");
        temp.insert(5, "-");
        temp.insert(9, "-");
        return temp.toString();
    }
}
