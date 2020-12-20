package Task_1;

public class Person {
    public static String FirstName;
    public static String surname;
    public static String patronymic;

    public Person(String surname, String FirstName, String patronymic)
    {
        Person.FirstName = FirstName;
        Person.surname = surname;
        Person.patronymic = patronymic;
    }

    public Person(String surname, String FirstName)
    {
        Person.FirstName = FirstName;
        Person.surname = surname;
        Person.patronymic = "";
    }

    public Person(String surname)
    {
        Person.surname = surname;
        Person.FirstName = "";
        Person.patronymic = "";
    }

    public static StringBuilder getName()
    {
        return new StringBuilder(surname+' '+FirstName+' '+patronymic);
    }
}
