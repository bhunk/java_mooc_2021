
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                // Write your program here
          System.out.println("Give the first number:");
        int x = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int y = Integer.valueOf(scanner.nextLine());
        int z;
        z=x+y;
        System.out.println(x + " + " + y + " = " + z);
        z=x-y;
        System.out.println(x + " - " + y + " = " + z);
        z=x*y;
        System.out.println(x + " * " + y + " = " + z);
        double d= (double) x/y;
        System.out.println(x + " / " + y + " = " + d);

    }
}
