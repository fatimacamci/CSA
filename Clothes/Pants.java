
public class Pants extends Clothes
{
    private int LengthInInches;
    
    public Pants(){
        LengthInInches = 40;
    }
    
    public Pants(String c, String p, String f, int l){
        super(c, p, f);
        LengthInInches = l;
    }
    
    public void setLength(int l){
        LengthInInches = l;
    }
    
    public void setLonger(int l){
        LengthInInches = l + 5;
    }
    
    public void setShorter(int l){
        LengthInInches = l - 5;
    }
    
    public int getLength(){
        return LengthInInches;
    }
    
    public void setColor(String c){
        super.setColor(c);
    }
    
    public String getColor(){
        return super.getColor();
    }
    
    public void setPatternType(String p){
        super.setPatternType(p);
    }
    
    public String getPatternType(){
        return super.getPatternType();
    }
    
    public void setFabric(String f){
        super.setFabric(f);
    }
    
    public String getFabric(){
        return super.getFabric();
    }
    
    public String toString(){
        return "this pant has length: " + LengthInInches + ", color: " + super.getColor() + ", pattern: " + super.getPatternType() + ", and fabric: " + super.getFabric();
    }
}
