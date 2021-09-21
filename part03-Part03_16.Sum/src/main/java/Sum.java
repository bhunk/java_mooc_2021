
import java.util.ArrayList;

public class Sum {
    
    private static ArrayList<Integer> numbers = new ArrayList<>();
    int total = 0;
    public static void main(String[] args) {
        // Try your method here
        System.out.println(sum(numbers));

    }
    public static int sum(ArrayList<Integer> numbers){
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        
        int total = 0;
        
        for (int number: numbers){
            total = total + number;
            
        }
        return total;
    }
            
}
