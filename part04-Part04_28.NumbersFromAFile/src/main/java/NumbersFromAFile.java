
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                
        ArrayList<String> list = new ArrayList<>(); 
        
        System.out.print("File? ");
        String file = scanner.nextLine();
        
        try(Scanner theFile = new Scanner(Paths.get(file));){
            
            System.out.println("");
            
            while (theFile.hasNextLine()) {
                list.add(theFile.nextLine());
            }
            
            }catch(Exception e){
            System.out.println("Reading the file " + file + " failed.");
            }   
                       
            System.out.print("Lower bound? ");
            int lower = Integer.valueOf(scanner.nextLine());
            
            System.out.print("Upper bound? ");
            int upper = Integer.valueOf(scanner.nextLine());
                
            int count = 0;
            for(String num : list){
                if(Integer.valueOf(num) >= lower && 
                        Integer.valueOf(num) <= upper ){
                            count++;

                }
               // System.out.println("Numbers:" + count);
            }
            System.out.print("Numbers: " + count);
        
        
        }  

    
}
      

