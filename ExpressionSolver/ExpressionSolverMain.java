import java.util.*;
public class ExpressionSolverMain
{
    public static void main(String[] args){
        ExpressionSolver solve1 = new ExpressionSolver("3 + 5");
        solve1.solveExpression();
        System.out.println(solve1.toString());
        
        ExpressionSolver solve2 = new ExpressionSolver("3 * 5");
        solve2.solveExpression();
        System.out.println(solve2.toString());
        
        ExpressionSolver solve3 = new ExpressionSolver("3 - 5");
        solve3.solveExpression();
        System.out.println(solve3.toString());
        
        ExpressionSolver solve4 = new ExpressionSolver("3 / 5");
        solve4.solveExpression();
        System.out.println(solve4.toString());
        
        ExpressionSolver solve5 = new ExpressionSolver("5 / 5 * 2 + 8 / 2 + 5");
        solve5.solveExpression();
        System.out.println(solve5.toString());
        
        ExpressionSolver solve6 = new ExpressionSolver("5 * 5 + 2 / 2 - 8 + 5 * 5 - 2");
        solve6.solveExpression();
        System.out.println(solve6.toString());
    }
}
