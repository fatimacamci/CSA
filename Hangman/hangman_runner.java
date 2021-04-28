import java.util.Scanner;

public class hangman_runner
{
     public static void main(String[] args){
        
        Scanner kb = new Scanner(System.in);
        String[] secretWords = {"tiger","elephant","falcon","lion","dove","sparrow","gopher"};
        
        Hangman game = new Hangman(secretWords[((int)(Math.random()*secretWords.length))]);
        System.out.println(game);
        
        while(!game.gameOver()){
            System.out.print("guess a letter: ");
            System.out.println(game.guess(kb.next()));
            System.out.println(game);
        }
        
        if(game.getHint().indexOf("?") == -1)
            System.out.println("you won");
        else
            System.out.println("you lost");
     }
}
