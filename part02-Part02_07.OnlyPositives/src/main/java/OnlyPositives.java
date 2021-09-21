
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a number: ");
        int num = Integer.valueOf(scan.nextLine());
            
        while (true) {
            if (num == 0) {
                break;
            }
            if (num > 0) {
                System.out.println(num*num);
            }else{
                System.out.println("Unsuitable number");
            }
            System.out.println("Give a number: ");
            num = Integer.valueOf(scan.nextLine());
    	}
    }
}

