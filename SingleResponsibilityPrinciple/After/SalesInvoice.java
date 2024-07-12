package SingleResponsibilityPrinciple.After;

public class SalesInvoice {
    // createInvoice() must be divided into small pieces, each of which solves only one problem
    // Each has only one implementation, thus one reason to change
    public static void createInvoice(ShoppingCart cart){

        // Calculating the total price of items in the cart [implementation]
        double totalPrice = cart.cartItems.stream().mapToDouble(x -> x.getQuantity() * x.getPrice()).sum();


        // The implementation of the printing the invoice is moved to a new class called "PrintingManager"
        // Now this method just uses the implementation of printInvoice() from PrintingManager not responsible for it.
        PrintingManager.printInvoice(cart, totalPrice);

    }
}
