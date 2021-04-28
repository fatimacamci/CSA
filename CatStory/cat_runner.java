import java.util.Scanner;

public class cat_runner
{
    public static void main(String[] args){
        boolean playing = true;
        cat catOne = new cat();
        Scanner k = new Scanner(System.in);
        
        System.out.println("What is your name? ");
        String name = k.next();
        System.out.println("Welcome, " + name);
        System.out.println("One day, when taking a walk in your neighborhood, you come across a cat sitting on the other side of the road.");
        System.out.println("You decide to pet the cat, and find some cat treats in your pocket.");
        
        while (playing){
           System.out.println("Do you want to give the cat a treat? (Y/N) \n(A treat will lower the chances of the cat hissing) " );
           String giveTreat = k.next();
           System.out.println(catOne.likeOrDislike(giveTreat));
           
           System.out.println("Do you want to keep playing? (Y/N) ");
           String play = k.next();
           if (play.equals("Y")){
               playing = true;
            }
            else {
               playing = false;
            }
           
         }
        System.out.println("Thank you for playing " + name);
    }
}
