
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
          System.out.println("Give the first number:");
        double x = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        double y = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        double w = Integer.valueOf(scanner.nextLine());        
        double z;
        z=x+y+w;
        double a=z/3;
        System.out.println("The average is " + a);
        
        
    }
}
