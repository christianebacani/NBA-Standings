// NBA Standings
// Created by : Christiane A. Bacani
import java.util.Scanner;;
public class NBAStandingsSystem {
    public static void west(){
        System.out.print("NBA Standings in West :\n");
        System.out.print("TEAM                        (W - L)\n");
        System.out.print("1.) Denver Nuggets          (49 - 24)\n");
        System.out.print("2.)  Memphis Grizzlies      (45 - 27)\n ");
        System.out.print("3.) Sacramento Kings       (43 - 29)\n");;
        System.out.print("4.) Phoenix Suns            (38 - 34)\n");
        System.out.print("5.) Los Angeles Clippers    (38 - 35)\n");
        System.out.print("6.)Golden State Warriors    (38 - 36)\n");
        System.out.print("7.) Minessota Timberwolves  (37 - 37)\n");
        System.out.print("8.) Oklahoma  City Thunder  (36 - 36)\n");
        
    }
    public static void east(){
        System.out.print("NBA Standings in East :\n");
        System.out.print("TEAM                      (W - L)\n");
        System.out.print("1.) Milwaukee Bucks       (52 - 20)\n");
        System.out.print(("2.) Boston  Celtics       (50 - 23)\n"));
        System.out.print("3.) Philadelphia 76ers    (49 - 23)\n");
        System.out.print("4.) Cleveland Cavaliers   (46 - 26)\n");
        System.out.print("5.) New York Knicks       (42 - 32)\n");
        System.out.print("6.) Brooklyn Nets         (39 - 33)\n");
        System.out.print("7.) Miami Heat            (40 - 34)\n");
        System.out.print("8.) Atlanta Hawks         (36 - 37)\n");
        
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("NBA Standings\n");
        
        System.out.print("1.) West\n2.) East\n3.) Exit\n");
        System.out.print("Choose here : ");
        String choose = input.nextLine();
        
        if(choose.equals("1")){
            west();    
         
        }
        else if(choose.equals("2")){
            east();
        
        }
        else if(choose.equals("3")){
            System.out.print("\n\nEXITING---");
            
        }
        else{
            System.out.print("\n\nINVALID CHOICE!");
        
        }
        
    }
}
