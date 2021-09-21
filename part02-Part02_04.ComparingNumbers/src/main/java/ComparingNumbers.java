
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        if (num1 > num2){
            System.out.println(num1 + " is greater than " + num2);
        }else if(num1 < num2){
            System.out.println( num1 + " is smaller than " + num2);
        }else{
            System.out.println(num1 + " is equal to " + num2);
        
        }
    }
}
