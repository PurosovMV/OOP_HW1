import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------- ПОИСК ОСВЕЖАЮЩИХ НАПИТКОВ ---------");
        VendingMachineBottle vmBottle = new VendingMachineBottle();
        List<BottleOfWater> bottleList = new ArrayList<>(Arrays.asList(
                new BottleOfWater("Cola", 3.0, 0.5),
                new BottleOfWater("Sprite", 3.1, 0.45),
                new BottleOfWater("Fanta", 2.9, 0.43),
                new BottleOfWater("Aqua Minerale", 1.2, 0.5)));
        vmBottle.initProduct(bottleList);
        System.out.println(vmBottle.getProduct("Cola"));

        System.out.println("--------- ПОИСК ГОРЯЧИХ НАПИТКОВ ---------");
        VendingMachineHotDrinks vmHotDrinks = new VendingMachineHotDrinks();
        List<HotDrinks> hotDrinksList = new ArrayList<>(Arrays.asList(
                new HotDrinks("Coffee", 3.0, 0.3, 90),
                new HotDrinks("Tea", 1.0, 0.4, 80),
                new HotDrinks("Milk", 2.5, 1.0, 0)));
        vmHotDrinks.initProduct(hotDrinksList);
        System.out.println("Поиск по названию: " + vmHotDrinks.getProduct("Coffee"));
        System.out.println("Поиск по цене <=: " + vmHotDrinks.getProduct(1.0));
        System.out.println("Поиск по температуре <=: " + vmHotDrinks.getProduct(50));
    }

}
