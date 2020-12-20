package Task_5;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(new FileReader(reader.readLine()));
        String file = "";
        while (scanner.hasNextLine())
        {
            file = scanner.nextLine();
        }
        String[] words = file.split(" ");
        StringBuilder result = InOrder.getLine(words);
        System.out.println(result.toString());
    }
}