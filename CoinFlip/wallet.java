
public class wallet
{
   private int balance;
   private int betAmount;
   
   public wallet(){
       balance = 0;
       betAmount = 0;
    }
    
   public wallet(int m){
       balance = m;
    }
    
   public void addMoney(int m, int b){
        betAmount = b;
        balance = m;
        balance = m + b;
    }
   public int getMoney(){
        return balance;
    }
}
