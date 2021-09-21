
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
 
        int total = 0;
        int count = 0;
        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scan.nextLine());
            if (num == 0) {
                break;
            }
            total = num + total;
            count++;
    	}
        System.out.println("Number of numbers: " + count);
        System.out.println("Sum of the numbers: " + total);

    }
}
