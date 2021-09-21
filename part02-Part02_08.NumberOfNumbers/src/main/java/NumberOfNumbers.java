
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scan.nextLine());
            if (num == 0) {
                break;
            }
            if (num > 0) {
                count++;
            }else{
                count++;
            }
    	}
        System.out.println("Number of numbers: " + count);
    }
}
