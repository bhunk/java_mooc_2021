
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter count = new Counter(5);
        
        
        count.increase(-2);

        System.out.println(count.value());
    }
}
