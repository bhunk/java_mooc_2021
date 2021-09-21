
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        for (int i = start; i < 101; i++) {
            System.out.println(i);
        }  
    }
}
