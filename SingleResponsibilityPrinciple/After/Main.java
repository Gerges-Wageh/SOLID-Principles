package SingleResponsibilityPrinciple.After;

public class Main {
    public static void main(String[] args) {

        ShoppingCart myCart = new ShoppingCart();

        myCart.addItem(new Item("milk", 25.0, 2));
        myCart.addItem(new Item("egg", 6.0,5));

        SalesInvoice.createInvoice(myCart);

        //Gives the same result as before
        // But this code follows the SRP which is more scalable, testable and maintainable
    }
}

