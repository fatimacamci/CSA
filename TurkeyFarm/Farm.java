
public class Farm
{
    public Turkey[] turkeys;
    private Turkey turkey;
    private String output;
    public static int totalTurkeys;
    
    public Farm(int n){
        turkeys = new Turkey[n];
    }
    
    public void addTurkey(Turkey t){
        Turkey[] arr = new Turkey[turkeys.length+1];
        arr[0] = t;
        for (int i = 1; i < turkeys.length; i++)
            arr[i] = turkeys[i-1];
        turkeys = arr;
        totalTurkeys++;
    }
    
    public void removeTurkey(int x){
        Turkey[] arr = new Turkey[turkeys.length-1];
        for (int i = 0; i < x; i++)
            arr[i] = turkeys[i];
        for (int i = x+1; i < turkeys.length; i++)
            arr[i-1] = turkeys[i];
        turkeys = arr;
        totalTurkeys--;
    }
    
    public void setTurkeyWeight(int i, double d){
        turkeys[i].setWeight(d);
        System.out.println(i + " " + getTurkey(i) + "\n");
    }
    
    public Turkey getTurkey(int x){
        return turkeys[x];
    }
    
    public String toString(){
        output = "\n";
        for (int i = 0; i < totalTurkeys; i++){
            output += i + " " + turkeys[i]+ "\n";
        }
        return output;
    }
}
