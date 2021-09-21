
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int tax = scan.nextInt();
        if (tax < 5000 ){
            System.out.println("No tax!");
        }else if (tax < 25_000 ) {
            System.out.println("Tax: " + (100 + (tax-5000)*0.08));
        }else if(tax < 55_000){
            System.out.println("Tax: " +(1700 + (tax-25_000)*0.10));
        }else if(tax < 200_000){
            System.out.println("Tax: " +(4700 + (tax-55_000)*0.12));
        }else if(tax < 1_000_000){
            System.out.println("Tax: " +(22_100 + (tax-200_000)*0.15));
        }else if(tax > 1_000_000){
            System.out.println("Tax: "+(142_100 + (tax-1_000_000)*0.17));
        }
    }
}
