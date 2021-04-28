
public class ClothesRunner
{
    public static void main( String args[] ){
        
        Clothes[] array = new Clothes[10];
        
        Clothes pOne = new Pants();
        Clothes pTwo = new Pants("blue", "striped", "cotton", 45);
        Clothes pThree = new Pants();
        pThree.setColor("pink");
        Clothes pFour = new Pants();
        pFour.setFabric("polyester");
        Clothes pFive = new Pants();
        ((Pants)pFive).setLength(15);
        pFive.setColor("yellow");
        Clothes tOne = new Tops();
        Clothes tTwo = new Tops("white", "checkered", "cotton", "short sleeve");
        Clothes tThree = new Tops();
        ((Tops)tThree).setSleeve("no sleeve");
        Clothes tFour = new Tops();
        tFour.setFabric("silk");
        Clothes tFive = new Tops();
        tFive.setColor("green");
        tFive.setPatternType("polka dot");
        
        array[0] = pOne;
        array[1] = pTwo;
        array[2] = pThree;
        array[3] = pFour;
        array[4] = pFive;
        array[5] = tOne;
        array[6] = tTwo;
        array[7] = tThree;
        array[8] = tFour;
        array[9] = tFive;
        
        for (Clothes x: array){
            System.out.println(x);
        }
    }
}
