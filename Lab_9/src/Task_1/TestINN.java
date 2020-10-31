package Task_1;

import java.util.*;

public class TestINN
{
    public static void main(String[] args)
    {
        String name;
        long INN;
        Scanner scanner = new Scanner(System.in);
        INN test = new INN();
        Data data1 = new Data(200_324_594_234L, "Gruzdeva");
        Data data2 = new Data(123_456_781_234L, "Noriaki");
        Data data3 = new Data(534_267_182_531L, "Yoshikage");
        Data data4 = new Data(937_461_538_462L, "Zeppeli");
        test.Add(data1);
        test.Add(data2);
        test.Add(data3);
        test.Add(data4);
        System.out.println("\nDatabase output");
        test.Print();
        System.out.println("\nTrying to add new data\nExample of the correct input");
        System.out.println("FIO: Iero");
        System.out.println("INN number (consists of 12 digits):\t900_324_124_763L");
        Data data5 = new Data(900_324_124_763L, "Iero");
        test.Add(data5);
        System.out.println("Database after adding new data");
        test.Print();
        System.out.println("\nExample of the incorrect input");
        System.out.println("FIO: Momsen");
        System.out.println("INN number (consists of 12 digits):\t900_324_124_763L");
        System.out.println("If we test this case, then UniqueINN exception will be thrown" +
                "\nYou can verify this if you uncomment the lines below.");
/*        Data data6 = new Data(900_324_124_763L, "Momsen");
        test.Add(data6);*/
        System.out.println("\nNow, add data by yourself");
        System.out.println("Input your FIO");
        name=scanner.nextLine();
        System.out.println("Input your INN number (consists of 12 digits)");
        INN=scanner.nextLong();
        Data data7 = new Data(INN, name);
        test.Add(data7);
        test.Print();
    }
}


