
public class Tops extends Clothes
{
    private String sleeve;
    
    public Tops(){
        sleeve = "long";
    }
    
    public Tops(String c, String p, String f, String s){
        super(c, p, f);
        sleeve = s;
    }
    
    public void setSleeve(String s){
        sleeve = s;
    }
    
    public String getSleeve(){
        return sleeve;
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
        return "this top has sleeve length: " + sleeve + ", color: " + super.getColor() + ", pattern: " + super.getPatternType() + ", and fabric: " + super.getFabric();
    }
}
