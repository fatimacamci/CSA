import java.util.Scanner;
public class TurkeyFarmRunner
{
    public static void main( String args[] ){
        int entry = 0;
        Farm farm = new Farm(20);
        Turkey turkey;
        Scanner kb = new Scanner(System.in);
        System.out.println("Turkey Farm Software v0.8");
        while (entry != 5){
            System.out.println("enter 1 to add a turkey");
            System.out.println("enter 2 to remove a turkey");
            System.out.println("enter 3 to update weight");
            System.out.println("enter 4 to print the list of turkeys");
            System.out.println("enter 5 to end\n");
            System.out.println("entry: ");
            entry = kb.nextInt();
            if (entry == 1){
                turkey = new Turkey();
                System.out.println("enter turkey name: ");
                turkey.setName(kb.next());
                farm.addTurkey(turkey);
                System.out.println(farm);
            }
            else if (entry == 2){
                System.out.println("enter number of turkey to remove: ");
                farm.removeTurkey(kb.nextInt());
                System.out.println(farm);
            }
            else if (entry == 3){
                turkey = new Turkey();
                System.out.println(farm);
                System.out.println("enter turkey number to adjust weight: ");
                int indexOfTurkey = kb.nextInt();
                System.out.println("enter turkey weight: ");
                farm.setTurkeyWeight(indexOfTurkey, kb.nextDouble());
                //System.out.println(farm);
            }
            else if (entry == 4){
                System.out.println(farm);
            }
            else if (entry == 5){
                System.out.println("Thank you for using Turkey Farm Software v0.8");
            }
         }
    }
}
