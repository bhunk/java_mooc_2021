
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double count = 0;
        double total = 0;
        while (true) {
            System.out.println("Give a number:");
            double num = Integer.valueOf(scan.nextLine());
            if (num == 0) {
                break;
            }
            if (num > 0) {
                total = num + total;
                count++;
            }
        }
        if (count == 0){
            System.out.println("Cannot calculate the average");
        }else{
            System.out.println(total/count);
        }
    }
}
