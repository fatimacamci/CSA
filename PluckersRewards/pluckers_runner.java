
public class pluckers_runner
{
    public static void main(String[] args)
    {
        rewardsCard card1 = new rewardsCard("Donny Blast");
        rewardsCard card2 = new rewardsCard("Elise Johns");
        rewardsCard card3 = new rewardsCard("Jose Westland");
        
        System.out.println(card1);
        System.out.println(card2);
        System.out.println(card3);
        
        card1.recordTransaction(50.00, 0, "09/28/16");
        card1.recordTransaction(36.24, 0, "09/30/16");
        card1.recordTransaction(76.25, 0, "10/04/16");
        card1.recordTransaction(90.00, 10, "10/12/16");
        
        System.out.println(card1);
    }
}
