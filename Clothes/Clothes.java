
public class Clothes
{
    private String color;
    private String patternType;
    private String fabric;
    
    public Clothes(){
        color = "black";
        patternType = "no pattern";
        fabric = "cotton";
    }
    
    public Clothes(String c, String p, String f){
        color = c;
        patternType = p;
        fabric = f;
    }
    
    public void setColor(String c){
        color = c;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setPatternType(String p){
        patternType = p;
    }
    
    public String getPatternType(){
        return patternType;
    }
    
    public void setFabric(String f){
        fabric = f;
    }
    
    public String getFabric(){
        return fabric;
    }
    
    public String toString(){
        return "this clothing item has color: " + color + ", pattern: " + patternType + ", and fabric: " + fabric;
    }
}
