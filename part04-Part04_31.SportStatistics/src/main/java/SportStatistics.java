
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("File: ");
        String fileName = scan.nextLine();
        System.out.print("Team: ");
        String getTeam = scan.nextLine();
        
        int homecount = 0;
        int awaycount = 0;
        int win = 0;
        int lose = 0;
        ArrayList<String> list = new ArrayList<>();
        
                
        try (Scanner input = new Scanner(Paths.get(fileName))) {
            while (input.hasNextLine()) {
                String line = input.nextLine();
                list.add(line);
            
                String[] parts = line.split(",");
                String teamName1 = parts[0];
                String teamName2 = parts[1];
                int team1Score = Integer.valueOf(parts[2]);
                int team2Score = Integer.valueOf(parts[3]);
                               
                if (getTeam.equals(teamName1)){
                    //System.out.println(parts[0]);
                    homecount++;
                }else if (getTeam.equals(teamName2)){
                    awaycount++;
                }
                
                if(getTeam.equals(teamName1) && team1Score > team2Score){
                    win++;
                }else if(getTeam.equals(teamName1) && team1Score < team2Score){
                    lose++;
                }
                if(getTeam.equals(teamName2) && team2Score > team1Score){
                    win++;
                }else if(getTeam.equals(teamName2) && team2Score < team1Score){
                    lose++;
                }
                
            }
            
                int totalgame = homecount + awaycount;
                System.out.println("Games: " + totalgame);
                System.out.println("Wins: " + win);
                System.out.println("Losses: " + lose);
            
            }catch(Exception e){
                System.out.println("Reading the file " + e + " failed.");
                }
    }
}

    
