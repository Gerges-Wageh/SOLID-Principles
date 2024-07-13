package SingleResponsibilityPrinciple.After;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// This class follows the SRP, Its attributes and methods all are related to the class.
public class Stock {
    private  static List<Item> availableItems =
            new ArrayList<>(Arrays.asList(
                    new Item("milk", 25.0, 100),
                    new Item("cheese", 23.0, 90),
                    new Item("egg", 6.0, 300),
                    new Item("bread", 2.0, 200)
            ));

    public static List<Item> getAvailableItems() {
        return availableItems;
    }

    public static boolean isItemAvailable(Item item){
        // Checking the item availability [implementation]
        int quantityInStock = Stock.getAvailableItems().stream()
                .filter(x -> x.getName().equals(item.getName()))
                .map(Item::getQuantity).findFirst().orElse(0);

        return quantityInStock > item.getQuantity();
    }

}
