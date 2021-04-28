
public class player
{
    private String name;
    private int balance;
    private int betAmount;
    wallet walletOne = new wallet();
    public player(){
        name = "";
        balance = 0;
    }
    
    public player(String n, int m){
        name = n;
        balance = m;
    }
    
    public int getWallet(int b, int bet){
        walletOne.addMoney(b, bet);
        return walletOne.getMoney();
    }
    
}
