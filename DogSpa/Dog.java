
public class Dog
{
    private String name;
    private Owner ownerName;
    private int age;
    private String CorD;
    private String TorS;
    
    public Dog(String name, Owner o){
        this.name = name;
        this.ownerName = o;
        age = 0;
        CorD = "dirty";
        TorS = "shaggy";
    }
    
    public void setName(String n){
        name = n;
    }
    
    public String getName(){
        return name;
    }
    
    public void setOwnerName(Owner n){
        ownerName = n;
    }
    
    public Owner getOwnerName(){
        return ownerName;
    }
    
    public void setAge(int a){
        age = a;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setCorD(String n){
        CorD = n;
    }
    
    public String getCorD(){
        return CorD;
    }
    
    public void setTorS(String n){
        TorS = n;
    }
    
    public String getTorS(){
        return TorS;
    }
    
    public String toString(){
        return name + " \t" + CorD + " \t" + TorS;
    }
}
