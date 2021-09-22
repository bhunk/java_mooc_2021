
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // for (int i =0; i< uhh; i++){

    while(true){
        String text = scanner.nextLine();
        String[] pieces = text.split(" ");
        if(text.equals("")){
               break;
        }else{
        for(int i=0;i<pieces.length;i++){
            System.out.println(pieces[i]);
           }
       }
       
    }
    }
}

