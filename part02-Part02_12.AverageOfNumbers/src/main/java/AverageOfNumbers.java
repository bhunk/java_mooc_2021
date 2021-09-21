
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
 
        double total = 0;
        double count = 0;
        double avg = 0;
        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scan.nextLine());
            if (num == 0) {
                break;
            }
            total = num + total;
            count++;
            avg = total/count;
    	}
        System.out.println("Average of the numbers: " + avg);

    }
}
