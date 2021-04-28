import java.util.*;
public class ExpressionSolver
{
    private ArrayList<String> arr;
    private int replaceValue;
    public String initialString;
    
    public ExpressionSolver(String input){
        initialString = input;
        arr = new ArrayList<String>();
        for (int i = 0; i < input.length(); i += 2)
            arr.add(input.substring(i, i+1));
    }
    
    public void setExpression(String input){
        initialString = input;
        arr = new ArrayList<String>();
        for (int i = 0; i < input.length(); i++)
            arr.add(input.substring(i, i+1));
    }
    
    public void solveExpression(){
        while (arr.size() != 1){
            for (int i = 1; i < arr.size()-1; i++){
                if ((arr.get(i)).equals("/")){
                    replaceValue = Integer.valueOf(arr.get(i-1)) / Integer.valueOf(arr.get(i+1));
                    arr.remove(i+1);
                    arr.remove(i);
                    arr.remove(i-1);
                    arr.add(i-1, Integer.toString(replaceValue));
                    i -= 1;
                }
                else if ((arr.get(i)).equals("*")){
                    replaceValue = Integer.valueOf(arr.get(i-1)) * Integer.valueOf(arr.get(i+1));
                    arr.remove(i+1);
                    arr.remove(i);
                    arr.remove(i-1);
                    arr.add(i-1, Integer.toString(replaceValue));
                    i -= 1;
                }
              }
            for (int i = 1; i < arr.size()-1; i++){
                if ((arr.get(i)).equals("+")){
                    replaceValue = Integer.valueOf(arr.get(i-1)) + Integer.valueOf(arr.get(i+1));
                    arr.remove(i+1);
                    arr.remove(i);
                    arr.remove(i-1);
                    arr.add(i-1, Integer.toString(replaceValue));
                    i -= 1;
                }
                else if ((arr.get(i)).equals("-")){
                    replaceValue = Integer.valueOf(arr.get(i-1)) - Integer.valueOf(arr.get(i+1));
                    arr.remove(i+1);
                    arr.remove(i);
                    arr.remove(i-1);
                    arr.add(i-1, Integer.toString(replaceValue));
                    i -= 1;
                 }
              }
        }
    }
    
    public String toString(){
        return initialString + " = " + arr.get(0);
     }
}
