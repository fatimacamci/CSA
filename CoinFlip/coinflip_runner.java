import java.util.Scanner;

public class coinflip_runner
{
    public static void main(String[] args){
       int win = 0;
       int loss = 0;
       int betAmount;
       String flipResult;
        
       Scanner k = new Scanner(System.in);
        
       System.out.println("What is your name? ");
       String name = k.next();
        
       System.out.println("How much money is in your wallet? ");
       int balance = k.nextInt();
       
       player playerOne = new player(name, balance);
       
       System.out.println(status(name, win, loss, balance));
       
       boolean playing = true;
       
       while (playing){
           System.out.println("How much do you want to bet? ");
           betAmount = k.nextInt();
           
           System.out.println("Do you want to bet on heads<H> or tails<T>? ");
           String bet = k.next();
           
           double r = Math.random();
           
           if (r <= 0.5){
               flipResult = "H";
            }
            else {
                flipResult = "T";
            }
           
           System.out.println("Coin flip is: " + flipResult);
           
           if (flipResult.equals(bet)){
               System.out.println("You win");
               win++;
               balance = playerOne.getWallet(balance, betAmount);
            }
            else {
                System.out.println("You lost");
                loss++;
                betAmount = -betAmount;
                balance = playerOne.getWallet(balance, betAmount);
            }
           
           System.out.println(status(name, win, loss, balance));
           System.out.println("Do you want to play again? (Y/N)");
           String play = k.next();
           if (play.equals("Y")){
               playing = true;
            }
            else {
               playing = false;
            }
           
        }
       System.out.println("Thank you for playing");
    }
    public static String status(String name, int win, int loss, int balance){
        return name + " has " + win + " wins and " + loss + " losses with " + balance + " dollars.";
    }
}
