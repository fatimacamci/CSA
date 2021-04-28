import java.util.*;

public class rewardsCard
{
  private String name;
  private int accountNumber;
  private int currentRewardsPoints;
  private String accountNumberS;
  private List<String> date =  new ArrayList();
  private List<Double> totalBill = new ArrayList();
  private List<Integer> pointsUsed = new ArrayList();
  private List<Integer> pointsEarned = new ArrayList();
  static int currentAccountNumber = 00000001;
  
  public rewardsCard(){
      name = "";
    }
    
  public rewardsCard(String n){
      this.name  = n;
      this.accountNumber = currentAccountNumber;
      accountNumberS = stringAccountNumber(accountNumber);
      setCurrentAccountNumber();
      currentRewardsPoints = 0;
    }
  
  public String stringAccountNumber(int n){
      if (n < 10)
         accountNumberS = "0000000" + n;
      else if (n < 100)
        accountNumberS = "000000" + n;
      else if (n < 1000)
        accountNumberS = "00000" + n;
      else if (n < 10000)
        accountNumberS = "0000" + n;
      else if (n < 100000)
        accountNumberS = "000" + n;
      else if (n < 1000000)
        accountNumberS = "00" + n;
      else if (n < 10000000)
        accountNumberS = "0" + n;
      else
        accountNumberS = "" + n;
      return accountNumberS;
   }
     
  public static void setCurrentAccountNumber(){
      currentAccountNumber += 1;
   }
  
  public void recordTransaction(double d, int i, String s){
      totalBill.add(d);
      pointsUsed.add(i);
      currentRewardsPoints -= i;
      date.add(s);
      pointsEarned.add(addRewardsPoints(d-i));
        }
     
  public int addRewardsPoints(double d){
      int d2 = (int)Math.floor(d);
      int d3 = (int)Math.floor(d2/10);
      currentRewardsPoints += d3;
      return d3;
      }
      
  public String toString(){
      String output = "This Pluckers card belongs to " + name;
      output += String.format("\nAccount number is %s", accountNumberS);
      output += "\nTheir Current rewards points are: " + currentRewardsPoints;
      output += "\nTheir purchase history is:\n";
      output += String.format(" %-20s %-20s %-20s %-20s ", "date", "total bill", "points used", "points earned");
      for (int i = 0; i < date.size(); i++){
          output += "\n";
          output += String.format("%-23s %-22.2f %-22d %-23d", date.get(i), totalBill.get(i), pointsUsed.get(i), pointsEarned.get(i));
        }
      output += "\n";
        return output;
     }
}
