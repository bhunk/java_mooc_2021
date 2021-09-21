
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Give a number:");
            int input = scan.nextInt();
            if (input == 4) {
                break;
            }    
        }    
    }
}
