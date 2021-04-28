import java.util.*;
public class Owner
{
    private String name;
    private ArrayList<Dog> dogs;
    private String phone;
    private double bill;
    private String output;
    
    public Owner(){
        name = "";
        phone = "";
        bill = 0.0;
        dogs = new ArrayList<>();
    }
    
    public void setName(String n){
        name = n;
    }
    
    public String getName(){
        return name;
    }
    
    public void addDog(Dog n){
        dogs.add(n);
    }
    
    public void removeDog(int i){
        dogs.remove(i);
    }
    
    public ArrayList<Dog> getDogs(){
        return dogs;
    }
    
    public void setPhone(String i){
        phone = i;
    }
    
    public String getPhone(){
        return phone;
    }
    
    public void setBill(double d){
        bill += d;
    }
    
    public double getBill(){
        return bill;
    }
    
    public String toString(){
        return name + " owes us " + bill + " dollars";
    }
}
