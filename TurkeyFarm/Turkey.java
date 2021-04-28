
public class Turkey
{
    private String name;
    private double weight;
    
    public Turkey(){
        name = "";
        weight = 1.0;
    }
    
    public void setName(String n){
        name = n;
    }
    
    public String getName(){
        return name;
    }
    
    public void setWeight(double d){
        weight  = d;
    }
    
    public double getWeight(){
        return weight;
    }
    
    public String toString(){
        return name + " the turkey is " + weight + " ounces";
    }
}
