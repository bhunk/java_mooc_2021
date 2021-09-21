
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num < 0){
            int ab = num * -1;
            System.out.println(ab);
        }else{
            System.out.println(num);
        }
    }
}
