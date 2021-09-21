
import java.util.ArrayList;

public class RemoveLast {
    private static ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) {
        // Try your method in here
        list.add("First");
        list.add("Second");
        list.add("Third");
        System.out.println(list);
        removeLast(list);
        removeLast(list);
        System.out.println(list);
    }
    public static void removeLast(ArrayList<String> list){
               
        if (list.size() != 0) {
            int length = list.size();
            list.remove(length-1);
//        }else{
//            return;
        }
        
        

        }
        
    }

