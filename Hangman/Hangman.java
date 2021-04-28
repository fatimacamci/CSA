import java.util.*;

public class Hangman
{
    private String word;
    private String word2;
    private String wordInQM;
    private String goodOrBad;
    private String gallowsOutput;
    private int counter;
    private ArrayList<String> guessedLetters = new ArrayList();
    String[] gallowsList = {"head", "body", "left arm", "right arm", "left leg", "right leg"};
    public Hangman(){
        word  = "";
      }
    public Hangman(String w){
        gallowsOutput = "\ngallows: rope ";
        word = w;
        wordInQM = "";
        counter = 0;
        for (int i = 0; i < word.length(); i++){
            wordInQM += "?";
        }
        word2 = wordInQM;
     } 
    public boolean gameOver(){
        if (word2.indexOf("?") == -1)
            return true;
        if (counter > 5){
            return true;
        }
        return false;
      }
    public String guess(String letter){
        guessedLetters.add(letter);
        if (!word.contains(letter)){
            gallowsOutput = "\ngallows: rope ";
            counter++;
            for (int i = 0; i < counter; i++){
                gallowsOutput += gallowsList[i] + " ";
            }
            goodOrBad = "bad";
        }
        else {
            for (int i = 0; i < word.length(); i++){
                if (word.substring(i, i+1).equals(letter)){
                    word2 = word2.substring(0, i) + letter + word2.substring(i+1);
                }
            }
            goodOrBad = "good";
        }
        return goodOrBad + " guess";
     }
    public String toString(){
        return guessedLetters + gallowsOutput + "\n" + word2 + "\n";
     }
    public String getHint(){
        return word2;
    }
}
