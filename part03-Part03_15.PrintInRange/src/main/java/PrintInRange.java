
import java.util.ArrayList;

public class PrintInRange {

    private static ArrayList<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {
        // Try your method here
        printNumbersInRange(numbers, 2, 6);
    }
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit){
        //ArrayList<Integer> numbers = new ArrayList<>();
            numbers.add(3);
            numbers.add(2);
            numbers.add(6);
            numbers.add(-1);
            numbers.add(5);
            numbers.add(1);
            
            for (int i = lowerLimit; i <= upperLimit; i++){
                if (numbers.contains(i))
                System.out.println(i);
            }
    }
}
