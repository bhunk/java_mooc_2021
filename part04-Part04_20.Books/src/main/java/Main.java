import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if(title.isEmpty()){
                break;
            }
            System.out.print("Pages: ");
            int page = Integer.valueOf(scanner.nextLine());
            
            System.out.print("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());
            books.add(new Book(title,page,year));
        }
        System.out.print("What information will be printed? ");
        String query = scanner.nextLine();
        for(Book book:books){
            if(query.equals("everything")){
                System.out.println(book);
            }
            if (query.equals("name")){
                System.out.print(book.getName());
                
            }
            
            
        }

    }
}
