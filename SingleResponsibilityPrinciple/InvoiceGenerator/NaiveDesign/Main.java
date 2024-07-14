package SingleResponsibilityPrinciple.Before;

public class Main {
    public static void main(String[] args) {
        ShoppingCart myCart = new ShoppingCart();

        myCart.addItem(new Item("milk", 25.0, 2));
        myCart.addItem(new Item("egg", 6.0,5));

        myCart.createInvoice();

        // You notice that the code still works even the design has many flaws in terms of scalability
    }
}
