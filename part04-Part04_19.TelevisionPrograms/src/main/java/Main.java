import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.print("Name: ");
            String name = scanner.nextLine();
            
            if(name.isEmpty()){
                break;
            }
            
            System.out.print("Duration: ");
            int d = Integer.valueOf(scanner.nextLine());
            
            programs.add(new TelevisionProgram(name,d));
        }
        System.out.println("Programs maxiumum duration? ");
        int max = scanner.nextInt();
        
        for(TelevisionProgram prog: programs){
            if(prog.getDuration() <= max){
                System.out.println(prog.getName() + ", " + prog.getDuration() + " minutes");
            }
        }
        
    }
}
