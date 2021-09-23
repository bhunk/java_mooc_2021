
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        String Lname = "";
        int sum = 0;
        int count = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
        //longest name
             name = parts[0];
            if (name.length() > Lname.length()) {
                Lname = name;
            }
        //average of numbers
            for (int i = 1; i < parts.length; i++){
                count++;
            }
            sum = sum + Integer.valueOf(parts[1]);
                
            }
               System.out.println("Name of the oldest: " + Lname); 
               System.out.println("Average of birth years: " +(double)sum / (double)count);
    }
}
