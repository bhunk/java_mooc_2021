
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }
        
        System.out.println("From where?");
        int first = Integer.valueOf(scanner.nextLine());
        if (scanner.equals("")){
            first = 0;
        }
        System.out.println("To where?");
        int last = Integer.valueOf(scanner.nextLine());
        
       // int fi = first;
      //  int la = last;
        for (int i = first; i <= last; ++i) {
            System.out.println(numbers.get(i));
        }
       // System.out.println(numbers.get(fi));
       // System.out.println(numbers.get(la));
        
    }
}
