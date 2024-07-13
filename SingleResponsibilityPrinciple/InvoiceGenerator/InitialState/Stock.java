package SingleResponsibilityPrinciple.Before;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    public static Item getItem(String name){
        Item targetItem  =  null;
        targetItem = availableItems.stream().filter(x -> x.getName().equals(name))
                .findFirst().orElse(null);
        return targetItem;
    }
}
