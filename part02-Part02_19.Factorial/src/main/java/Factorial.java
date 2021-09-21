
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        int end = scanner.nextInt();
        
        int f = 1;
        for (int i = 1; i <= end; i++) {
           // System.out.println(i);
             
            f = i * f;
        }   
        System.out.println("Factorial: " + f);    
    }
}
