import java.util.Random;
import java.util.Scanner;
//your grade is 4.5
//fix class name to match file name !!! golden rule
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //this is a random letter
        String computerPlays = "rps";
        Random rnd = new Random();
        do{
            System.out.println("If you want to play enter:\n(r or R) for rock,\n(p or P) for paper,\n(s or S) for scissors\nor Enter any key to exit");
          System.out.println("Enter a char");
          
           Scanner N =new Scanner (System.in);
           String M=N.nextLine();
           

               M = M.toLowerCase();
            char AMM= M.charAt(0);
            System.out.println(AMM);
            if(AMM != 'r' && AMM != 'p' && AMM != 's'){


                break;
            }



            char computerChoice = computerPlays.charAt(rnd.nextInt(computerPlays.length()));
            if(computerChoice == AMM){
           System.out.println("And user tie " + " And computer" + computerChoice);}
           else if (AMM =='r' && computerChoice == 's' || AMM == 'p' && computerChoice == 'r' || AMM == 's' && computerChoice == 'p'){
           System.out.println(" You Win ");}
           else{
               System.out.println(" Win computer ");}
           
           
           
            

        System.out.println("\n\n");
           
            
        }while(true);
    }   
}
