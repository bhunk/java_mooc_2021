
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        //int large = list.get(0);
        System.out.println("Search for? ");
        int index = Integer.valueOf(scanner.nextInt());

        for(int i = 0; i < list.size(); i++) {
            int number = list.get(i);
            if (index == number) {
            index = number;
            System.out.println(index + " is at index " + i);
            }
        }
       // System.out.println("The greatest number: " + large );
       // System.out.println("");

        // implement here finding the indices of a number
    }
}
