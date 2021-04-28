
public class reaction
{
  private boolean hiss;
  private double chance;
  private double chanceNotHiss;
  
  public reaction(){
      hiss = false;
    }
    
  public reaction(boolean h){
     hiss = h; 
    }
    
  public boolean getReaction(String treat){
      if ((treat).equals("Y")){
          chanceNotHiss = 0.8;
      }
      else
          chanceNotHiss = 0.4;
      
      chance = Math.random();
      
      if (chance < chanceNotHiss)
        hiss = false;
      else
        hiss = true;
      
      return hiss;
    }
}
