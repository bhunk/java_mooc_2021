
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // Write some code in here
        for(int i = 0; i < array.length; i++){
            //System.out.println(array[i]);
            print(array[i]);
          //print(6);
        }
    }
    public static void print(int x){
        for(int i = 0; i < x; i++){
        System.out.print("*");
    }
        System.out.println("");
    }
}
