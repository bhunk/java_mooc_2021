
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scan = new Scanner(System.in);
        int total = 0;
        int count = 0;
        double avg = 0.0;
        int evens = 0;
        int odds =0;
        System.out.println("Give a numbers:");
        while (true) {
            
            int num = Integer.valueOf(scan.nextLine());
            if (num == -1) {
                System.out.println("Thx! Bye!");
                break;
            }
            total = num + total;
            count++;
            avg = total/(double)count;
            
            if (num % 2 == 0){
                evens++;
            }else{
                odds++;
            }
    	}
        System.out.println("Sum: " + total);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + avg);
        System.out.println("Even: " + evens);
        System.out.println("Odd: " + odds);


    }
}
