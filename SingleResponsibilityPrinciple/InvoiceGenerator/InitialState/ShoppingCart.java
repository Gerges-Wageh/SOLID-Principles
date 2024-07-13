package SingleResponsibilityPrinciple.Before;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final List<Item> cartItems = new ArrayList<>();


    // Note that is method violate the SRP on the method level
    // The method is now responsible for 2 implementations.
    // It has now 2 reasons to change
    public boolean addItem(Item item){
        // Checking the item availability [implementation]
        int quantityInStock = Stock.getAvailableItems().stream()
                .filter(x -> x.getName().equals(item.getName()))
                .map(Item::getQuantity).findFirst().orElse(0);

        // Adding the item to the cart if available [implementation]
        if(item.getQuantity() < quantityInStock){
            cartItems.add(item);
            return true;
        }else {
            return false;
        }
    }

    public int getItemsCount(){
        return cartItems.size();
    }


    // Note that: this method violates the SRP on both the class level and the Method level
    // On the class level, the invoice generation isn't the ShoppingCart class if there is any modification
    // or bug in the invoice or in the cart you will refer to the same class, hence there are 2 reasons to change ShoppingCart
    // On the method level, the method do 3 implementations for 3 different problems and also has 3 reasons to change
    public void createInvoice(){

        // Calculating the total price of items in the cart [implementation]
        double totalPrice = cartItems.stream().mapToDouble(x -> x.getQuantity() * x.getPrice()).sum();

        // Printing the invoice [implementation]
        System.out.println("Thank you for your trust in us, you ordered the following:");
        System.out.println("ItemName" + "    " + "PricePerOne     " + "Amount") ;
        for (Item item : cartItems){
            System.out.printf("%-12s   %-12s   %-5s\n", item.getName(), item.getPrice(), item.getQuantity());

        }
        System.out.println("Your total invoice =  " + totalPrice);

        // Sending an Email to the customer [implementation]

    }


}
