
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        String name = "";

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            for (int i = 1; i < Integer.valueOf(parts[1]); i++){
            if (Integer.valueOf(parts[1]) > max)
            {
             max = Integer.valueOf(parts[1]);
             name = parts[0];
            }
            
        }
    }
        System.out.println("Name of the oldest: " + name);


    }
}
