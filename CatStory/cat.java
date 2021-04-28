
public class cat
{
  private int like;
  private int notLike;
  reaction reactionOne = new reaction();
  
  public cat(){
      like = 0;
      notLike = 0;
    }
    
  public cat(int l, int n){
      like = l;
      notLike = n;
    }
  //figure out if the cat liked or disliked you
  public String likeOrDislike(String treat){
      //figure out if the cat hissed at you or not
      boolean hiss = reactionOne.getReaction(treat);
      if (hiss ==  true){
          notLike++;
      }
      else
           like++;
      return "Hiss: " + hiss + "\nThe cat liked you " + like + " times and did not like you " + notLike + " times";
    }
  
}
