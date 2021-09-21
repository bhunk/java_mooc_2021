
import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLast {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        int last = list.size() - 1;
        //int first = list.size() - list.size();
        String la = list.get(last);
        //String fi = list.get(first);
        //System.out.println(fi);
        System.out.println(list.get(0));
        System.out.println(la);
    }
}
