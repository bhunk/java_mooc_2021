import java.util.Scanner;

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(2);

    }
    public static void printUntilNumber(int number){
        
       // Scanner scan = new Scanner(System.in);
       // number = scan.nextInt();
        int i = 1;
        while(i<=number){
            System.out.println(i);
            i++;
        }
       // System.out.println(number);
    }
}
