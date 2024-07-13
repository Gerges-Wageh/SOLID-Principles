package SingleResponsibilityPrinciple.After;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    public final List<Item> cartItems = new ArrayList<>();


    // Here we modify this method to solve only one problem [only one implementation] that's adding item to the cart
    public boolean addItem(Item item){

        // Now the addItem() just uses the implementation of isItemAvailable not posses the implementation
        boolean isAvailable = Stock.isItemAvailable(item);


        // Adding the item to the cart if available [implementation]
        if(isAvailable){
            cartItems.add(item);
            return true;
        }else {
            return false;
        }

        // Hence the addItem() now has only one implementation, and so one reason to change
    }

    public int getItemsCount(){
        return cartItems.size();
    }

   // The method createInvoice() is moved to a new class called "SalesInvoice" as it's not the responsibility
   // of ShoppingCart to generate invoices
   // This makes the ShoppingCart class follows the SRP

}
