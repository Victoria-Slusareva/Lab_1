package Task_3;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nResult of the example: "+new Subtract(new Multiply(new Const(2), new Variable('x')),
                new Const(3)).evaluate(5));
        System.out.print("\n\tTest 💻\nInput 'x' value: ");
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        System.out.println("Result: "+new Add(new Subtract(new Multiply(new Variable('x'), new Variable('x')),
                new Multiply(new Const(2), new Variable('x'))), new Const(1)).evaluate(number));
    }
}
