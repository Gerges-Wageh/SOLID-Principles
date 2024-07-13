package SingleResponsibilityPrinciple.After;

public class PrintingManager {
    public static void printInvoice(ShoppingCart cart, double totalPrice){

        // Printing the invoice [implementation]
        System.out.println("Thank you for your trust in us, you ordered the following:");
        System.out.println("ItemName" + "    " + "PricePerOne     " + "Amount") ;
        for (Item item : cart.cartItems){
            System.out.printf("%-12s   %-12s   %-5s\n", item.getName(), item.getPrice(), item.getQuantity());

        }
        System.out.println("Your total invoice =  " + totalPrice);
    }
}
